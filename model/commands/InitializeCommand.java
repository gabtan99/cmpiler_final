package model.commands;

import java.util.*;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.ErrorNode;
import org.antlr.v4.runtime.tree.ParseTreeListener;
import org.antlr.v4.runtime.tree.ParseTreeWalker;
import org.antlr.v4.runtime.tree.TerminalNode;

import parser.PSCParser.SimpleExpressionContext;
import parser.PSCParser.VariableDeclarationContext;
import model.*;
import model.objects.*;
import model.semcheck.*;


public class InitializeCommand implements Command {

    private Scope scope; 
    private VariableDeclarationContext varDecCtx;
    private SimpleExpressionContext rhsCtx;
    private EvaluateCommand evalCommand;
    
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
        if (varDecCtx.typeSpecifier().getText().contains("String")){
            PseudoValue pseudoValue = scope.getVariableAllScope(varDecCtx.variableDeclarationInitialize().IDENTIFIER().getText());
            pseudoValue.setValue(varDecCtx.variableDeclarationInitialize().simpleExpression().getText().replaceAll("^\"+|\"+$", ""));
        } else {
            evalCommand.execute();
		
            PseudoValue pseudoValue = scope.getVariableAllScope(varDecCtx.variableDeclarationInitialize().IDENTIFIER().getText());
            Util.assignValue(pseudoValue, evalCommand.getEvaluated());
        }
        
    }



}