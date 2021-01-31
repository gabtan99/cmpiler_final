package model.commands;

import parser.PSCParser.PrintParamsContext;
import parser.PSCParser.PrintParamsSelectorContext;

import model.*;
import model.objects.*;

public class CallCommand implements Command {

    private Scope scope;
    private String val;
    private String id;

    public CallCommand(String val, String id) {
        this.val = val.replaceAll("^\"+|\"+$", "");
        this.id = id;

        this.scope = ScopeManager.getInstance().getScope();
    }

    @Override
    public void execute() {
        
        
    }





    
}