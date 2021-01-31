package model.commands;

import parser.PSCParser.SimpleExpressionContext;

import model.*;
import model.objects.*;
import model.semcheck.*;

public class ReturnCommand implements Command {

    private SimpleExpressionContext exprCtx;
    private PseudoFunction func;
    private Scope scope;
    private EvaluateCommand evalCommand;

    public ReturnCommand(SimpleExpressionContext exprCtx, PseudoFunction func) {
        this.exprCtx = exprCtx;
        this.func = func;
        this.scope = ScopeManager.getInstance().getScope();


        UndeclaredSemCheck undeclaredSemCheck = new UndeclaredSemCheck(exprCtx);
        undeclaredSemCheck.check();

        evalCommand = new EvaluateCommand(this.exprCtx);
    }

    @Override
    public void execute() {
        evalCommand.execute();

        PseudoValue pseudoValue = func.getReturnValue();
		Util.assignValue(pseudoValue, evalCommand.getEvaluated()); 
    }





    
}