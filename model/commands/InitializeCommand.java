package model.commands;

import java.util.*;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.ErrorNode;
import org.antlr.v4.runtime.tree.ParseTreeListener;
import org.antlr.v4.runtime.tree.ParseTreeWalker;
import org.antlr.v4.runtime.tree.TerminalNode;

import parser.PSCParser.SimpleExpressionContext;
import model.*;
import model.objects.*;
import model.semcheck.*;


public class InitializeCommand implements Command {

    private Scope scope; 
    private TerminalNode id;
    private SimpleExpressionContext rhsCtx;
    private EvaluateCommand evalCommand;
    
    public InitializeCommand(TerminalNode id, SimpleExpressionContext rhsCtx) {
        this.rhsCtx = rhsCtx;
        this.id = id;
        this.scope = ScopeManager.getInstance().getScope();

        UndeclaredSemCheck undeclaredSemCheck = new UndeclaredSemCheck(rhsCtx);
        undeclaredSemCheck.check();
        
        evalCommand = new EvaluateCommand(this.rhsCtx);
    }

    @Override
    public void execute() {
        evalCommand.execute();
		
		PseudoValue pseudoValue = scope.getVariableAllScope(id.getText());
		Util.assignValue(pseudoValue, evalCommand.getEvaluated());
    }



}