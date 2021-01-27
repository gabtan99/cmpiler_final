package model;

import java.util.*;
import model.objects.*;


public class ScopeManager {

    private static ScopeManager instance = null;

    private HashMap<String, PseudoFunction> funcList;
    private Scope curScope;

    private ScopeManager() {
        this.funcList = new HashMap<String, PseudoFunction>();
        this.curScope = null;
    }

    public static ScopeManager getInstance() {
        if (instance == null) {
            instance = new ScopeManager();
        } 
        
        return instance;
    }

    public void reset() {
        funcList = new HashMap<String, PseudoFunction>();
    }

    public void setScope(Scope curScope) {
        this.curScope = curScope;
    }

    public Scope getScope() {
        return this.curScope;
    }

    public void addFunction(String id, PseudoFunction pseudoFunction) {
        this.funcList.put(id, pseudoFunction);
    }

    public PseudoFunction getFunction(String id) {
        if (this.funcList.containsKey(id)) {
            return this.funcList.get(id);
        } else {
            Console.log(" function not found.");
            return null;
        }
    }







    

    


}