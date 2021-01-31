package model.commands;

import java.util.*;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.ErrorNode;
import org.antlr.v4.runtime.tree.ParseTreeListener;
import org.antlr.v4.runtime.tree.ParseTreeWalker;
import org.antlr.v4.runtime.tree.TerminalNode;

import parser.PSCParser.SimpleExpressionContext;
import parser.PSCParser.MutableContext;
import model.*;
import model.objects.*;
import model.semcheck.*;

public class AssignCommand implements Command {

    private Scope scope; 
    private TerminalNode id;
    private MutableContext mutableCtx;
    private SimpleExpressionContext rhsCtx;
    private EvaluateCommand evalCommand;
    
    public AssignCommand(MutableContext mutableCtx, SimpleExpressionContext rhsCtx) {
        this.rhsCtx = rhsCtx;
        this.id = mutableCtx.IDENTIFIER();
        this.mutableCtx = mutableCtx;
        this.scope = ScopeManager.getInstance().getScope();

        UndeclaredSemCheck undeclaredSemCheck = new UndeclaredSemCheck(rhsCtx);
        undeclaredSemCheck.check();

        PseudoValue pseudoValue = scope.getVariableAllScope(id.getText());

        if (pseudoValue.getPrimitiveType() != PrimitiveType.ARRAY) {
            ConstantSemCheck constSemCheck = new ConstantSemCheck(this.id);
            constSemCheck.check();
        }
       
        // check if rhs is compatible with id type
        TypeMismatchSemCheck typeMMSemCheck = new TypeMismatchSemCheck(pseudoValue, rhsCtx);
        typeMMSemCheck.check();

        evalCommand = new EvaluateCommand(rhsCtx);
    }

    @Override
    public void execute() {
        
        if (mutableCtx.LeftBracket() != null) { // if an array


        } else { // if normal variable
            PseudoValue pseudoValue = scope.getVariableAllScope(id.getText());
		    Util.assignValue(pseudoValue, evalCommand.getEvaluated());
        }
        
    }



}