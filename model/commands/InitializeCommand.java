package model.commands;

import java.util.*;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.ErrorNode;
import org.antlr.v4.runtime.tree.ParseTreeListener;
import org.antlr.v4.runtime.tree.ParseTreeWalker;
import org.antlr.v4.runtime.tree.TerminalNode;

import parser.PSCParser.SimpleExpressionContext;
import parser.PSCParser.VariableDeclarationContext;
import parser.PSCParser.ConstantContext;
import parser.PSCParser.MutableContext;
import model.*;
import model.objects.*;
import model.semcheck.*;


public class InitializeCommand implements Command, ParseTreeListener {

    private Scope scope; 
    private VariableDeclarationContext varDecCtx;
    private SimpleExpressionContext rhsCtx;
    private EvaluateCommand evalCommand;
    private String builder = "";
    private List<String> excluded = new ArrayList<>();
    
    public InitializeCommand(VariableDeclarationContext varDecCtx, SimpleExpressionContext rhsCtx) {
        this.rhsCtx = rhsCtx;
        this.varDecCtx = varDecCtx;
        this.scope = ScopeManager.getInstance().getScope();

        UndeclaredSemCheck undeclaredSemCheck = new UndeclaredSemCheck(rhsCtx);
        undeclaredSemCheck.check();


        
        evalCommand = new EvaluateCommand(this.rhsCtx);
    }

    @Override
    public void execute() {
        System.out.println(varDecCtx.typeSpecifier().getText());
        if (varDecCtx.typeSpecifier().getText().contains("String")){
            ParseTreeWalker treeWalker = new ParseTreeWalker();
            treeWalker.walk(this, this.rhsCtx);
            PseudoValue pseudoValue = scope.getVariableAllScope(varDecCtx.variableDeclarationInitialize().IDENTIFIER().getText());
            pseudoValue.setValue(builder);
            
        } else {
            evalCommand.execute();
		
            PseudoValue pseudoValue = scope.getVariableAllScope(varDecCtx.variableDeclarationInitialize().IDENTIFIER().getText());
            Util.assignValue(pseudoValue, evalCommand.getEvaluated());
        }
        
    }

    @Override
    public void enterEveryRule(ParserRuleContext ctx) {

        if (ctx instanceof MutableContext) { ///str = str + arr[i]
            MutableContext mutableCtx  = (MutableContext) ctx;
            if (mutableCtx.LeftBracket() != null) { // if an array
                excluded.add(mutableCtx.getText());
                EvaluateCommand arrEvalCommand = new EvaluateCommand(mutableCtx.simpleExpression(), this.scope);
                arrEvalCommand.execute(); // rhs
    
                int arrIndex = arrEvalCommand.getEvaluated().intValue();
                PseudoValue pseudoValue = scope.getVariableAllScope(mutableCtx.IDENTIFIER().getText());
                System.out.println(pseudoValue.getValue().toString());
                PseudoArray pseudoArray = (PseudoArray) pseudoValue.getValue();
    
                if (pseudoArray.isInitialized()) {
                    PseudoValue curValue = pseudoArray.getValueAt(arrIndex);
                
                    if (curValue != null) {
                        this.builder += curValue.getValue().toString();
                    } else {
                        Printer.getInstance().print("Array Index is out of bounds.", mutableCtx.getStart().getLine());
                        RuntimeManager.getInstance().killExecution();
                    }
                    
                } else {
                    Printer.getInstance().print("Array is not initialized", mutableCtx.getStart().getLine());
                    RuntimeManager.getInstance().killExecution();
                }
                
                
            } else {
                PseudoValue pseudoValue = scope.getVariableAllScope(mutableCtx.IDENTIFIER().getText());
                if (!isInExcluded(mutableCtx.getText())){
                    this.builder += pseudoValue.getValue().toString();
                }
            }
            
        } else if (ctx instanceof ConstantContext) {
            ConstantContext constCtx  = (ConstantContext) ctx;
            if (!isInExcluded(constCtx.getText())){
                if (constCtx.StringLiteral()!= null) {
                    this.builder += constCtx.StringLiteral().getText().replaceAll("^\"+|\"+$", "");
                } else {
                    this.builder += constCtx.getText();
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

    private boolean isInExcluded (String s) {
		boolean found = false;
		for (String ex: excluded){
			if (ex.contains(s)) {
				return true;
			}
		}
		return found;
	}



}