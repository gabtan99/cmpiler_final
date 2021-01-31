package model;

import model.objects.*;


public class FunctionDeclarationTracker {

    private static FunctionDeclarationTracker instance = null;
    private PseudoFunction curFunction;
    private boolean hasReturn;

    public FunctionDeclarationTracker() {
        curFunction = null;
        hasReturn = false;
    }

    public static FunctionDeclarationTracker getInstance() {
        if (instance == null) {
            instance = new FunctionDeclarationTracker();
            System.out.println("Function Declaration Tracker initialized");
        }
        
        return instance;
    }

    public void reset() {
        instance = null;
        hasReturn = false;
        curFunction = null;
    } 

    public void setCurFunction(PseudoFunction curFunction) {
        this.curFunction = curFunction;
    }

    public PseudoFunction getCurFunction() {
        return curFunction;
    }

    public boolean hasReturn() {
        return hasReturn;
    }

    public void setHasReturn(boolean hasReturn) {
        this.hasReturn = hasReturn;
    }

}