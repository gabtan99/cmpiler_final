package model;

import java.util.*;
import model.objects.*;

public class FunctionControlTracker {

    private static FunctionControlTracker instance = null;
    private Stack<PseudoFunction> stack;
    
    public FunctionControlTracker() {
        this.stack = new Stack<PseudoFunction>();
    }

    public static FunctionControlTracker getInstance() {
        if (instance == null) {
            instance = new FunctionControlTracker();
            System.out.println("Function Control Tracker initialized");
        }
        
        return instance;
    }

    public void reset() {
        instance = null;
    } 

    public void enterFunction(PseudoFunction pseudoFunction) {
        this.stack.push(pseudoFunction);
    }

    public void exitFunction() {
        this.stack.pop();
    }

    public boolean isInsideFunction() {
        return this.stack.size() != 0;
    }

    public PseudoFunction getCurFunction() {
        return this.stack.peek();
    }

}