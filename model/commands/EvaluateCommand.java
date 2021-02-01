package model.commands;

import java.util.*;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.ErrorNode;
import org.antlr.v4.runtime.tree.ParseTreeListener;
import org.antlr.v4.runtime.tree.ParseTreeWalker;
import org.antlr.v4.runtime.tree.TerminalNode;

import java.math.BigDecimal;
import parser.PSCParser.SimpleExpressionContext;
import parser.PSCParser.MutableContext;
import parser.PSCParser.ConstantContext;
import model.*;
import model.objects.*;

public class EvaluateCommand implements Command, ParseTreeListener {

    private SimpleExpressionContext simpleCtx;
    private String strExp;
    private Scope scope; 
    private BigDecimal evaluated;
    private Scope altScope;
    
    public EvaluateCommand(SimpleExpressionContext simpleCtx) {
        this.simpleCtx = simpleCtx;
        this.scope = ScopeManager.getInstance().getScope();
             
        this.strExp = simpleCtx.getText();
    }

    public EvaluateCommand(SimpleExpressionContext simpleCtx, Scope scope) {
        this.simpleCtx = simpleCtx;
        this.scope =scope;
        this.strExp = simpleCtx.getText();
    }

    @Override
    public void execute() {

        ParseTreeWalker treeWalker = new ParseTreeWalker();
        treeWalker.walk(this, this.simpleCtx);

        if (strExp.contains("T")) {
            this.evaluated = new BigDecimal(1);
        } else if (strExp.contains("F")) {
            this.evaluated = new BigDecimal(0);
        } else {
            Expression evalEx = new Expression(this.strExp);
            this.evaluated = evalEx.eval();
        }
    }


    @Override
    public void enterEveryRule(ParserRuleContext ctx) {
        if (ctx instanceof MutableContext) {
            MutableContext mutableCtx  = (MutableContext) ctx;

            // non-array variable
            if (mutableCtx.IDENTIFIER() != null && mutableCtx.LeftBracket() == null) {
                PseudoValue pseudoValue = this.scope.getVariableAllScope(mutableCtx.IDENTIFIER().getText());
                this.strExp =  this.strExp.replaceFirst(mutableCtx.IDENTIFIER().getText(), pseudoValue.getValue().toString());
            } else { // access array

                EvaluateCommand evalCommand = new EvaluateCommand(mutableCtx.simpleExpression(), this.scope);
                evalCommand.execute();

                int arrIndex = evalCommand.getEvaluated().intValue();
                this.strExp = this.strExp.replaceFirst(mutableCtx.IDENTIFIER().getText(), "");

                PseudoValue pseudoValue = scope.getVariableAllScope(mutableCtx.IDENTIFIER().getText());
                PseudoArray pseudoArray = (PseudoArray) pseudoValue.getValue();

                if (pseudoArray.getValueAt(arrIndex) != null) { 
                    if (pseudoArray.getValueAt(arrIndex).getValue() != null) {
                        this.strExp = this.strExp.replaceFirst("\\[.*\\]", pseudoArray.getValueAt(arrIndex).getValue().toString());
                    } else {  // Value at index is not initialized
                        Printer.getInstance().print("Value at index is null. Might be uninitialized.", ctx.getStart().getLine());
                        RuntimeManager.getInstance().killExecution();
                    }
                } else { // Index is out of bounds
                    Printer.getInstance().print("Index is out of bounds.", ctx.getStart().getLine());
                    RuntimeManager.getInstance().killExecution();
                }
            }
            
        } 
    }

    @Override
	public void exitEveryRule(ParserRuleContext ctx) {
		// TODO Auto-generated method stub
		
	}

    @Override
	public void visitTerminal(TerminalNode node) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void visitErrorNode(ErrorNode node) {
		// TODO Auto-generated method stub
		
	}

    public BigDecimal getEvaluated() {
        return this.evaluated;
    }

}