package model.commands;

import parser.PSCParser.SimpleExpressionContext;

import model.*;
import model.objects.*;
import model.semcheck.*;

import java.util.*;

public class ReturnCommand implements Command {

    private SimpleExpressionContext exprCtx;
    private PseudoFunction func;
    private Scope scope;
    

    public ReturnCommand(SimpleExpressionContext exprCtx, PseudoFunction func) {
        this.exprCtx = exprCtx;
        this.func = func;
        this.scope = ScopeManager.getInstance().getScope();

        UndeclaredSemCheck undeclaredSemCheck = new UndeclaredSemCheck(exprCtx);
        undeclaredSemCheck.check();

        PseudoValue pseudoValue = this.func.getReturnValue();
        TypeMismatchSemCheck typeMMSemCheck = new TypeMismatchSemCheck(pseudoValue, this.exprCtx);
        typeMMSemCheck.check();
    }

    @Override
    public void execute() {
        EvaluateCommand evalCommand = new EvaluateCommand(this.exprCtx, FunctionControlTracker.getInstance().getCurFunction().getLocalScope());
        evalCommand.execute();

        System.out.println(evalCommand + " is eval instance");
        PseudoValue returnValue = FunctionControlTracker.getInstance().getCurFunction().getReturnValue();
        Util.assignValue(returnValue, evalCommand.getEvaluated());
        System.out.println( returnValue + "'s  value is now " + evalCommand.getEvaluated());
    }

    public int getLine() {
        return this.exprCtx.getStart().getLine();
    }
    
} 