package model.objects;

import java.util.*;
import model.*;
import model.commands.*;


public class PseudoFunction implements Command {

    private String name;
    private List<Command> commandList;

    private Scope localScope;

    private LinkedHashMap<String, PseudoValue> parameters;

    private PseudoValue returnValue;
    private FunctionType returnType;
    private boolean hasReturn;


    public PseudoFunction() {
        this.parameters = new LinkedHashMap<>();
        this.commandList = new ArrayList<>();
        this.returnType = FunctionType.VOID;
        this.hasReturn = false;
        this.localScope = new Scope();
    }

    @Override 
    public void execute() {

        FunctionControlTracker.getInstance().enterFunction(this);

        int index = 0;
        while (index < commandList.size() ) {
            if (RuntimeManager.getInstance().canExec()) {
                commandList.get(index).execute();
                index ++;
            } 
        }
        FunctionControlTracker.getInstance().exitFunction();
    }

    public void setLocalScope(Scope localScope) {
        this.localScope = localScope;
    }

    public Scope getLocalScope() {
        return localScope;
    }

    public PseudoValue getReturnValue() {
        return this.returnValue;
    }

    public void addCommand(Command c) {
        commandList.add(c);
    }


    public void setReturnValue(PseudoValue returnValue) {
        this.returnValue = returnValue;
    }

    public void setReturnType(FunctionType functionType) {
		this.returnType = functionType;
		
		switch(this.returnType) {
			case BOOLEAN: this.returnValue = new PseudoValue(true, "bool"); break;
			case INT: this.returnValue = new PseudoValue(0, "int"); break;
			case FLOAT: this.returnValue = new PseudoValue(0.0f, "float"); break;
			case STRING: this.returnValue = new PseudoValue("", "String"); break;
			default:break;	
		}
	}

    public void setReturnType(FunctionType functionType, int isArray) {
		this.returnType = functionType;
		
        if (isArray == 1) {

            PseudoArray pseudoArray = null;

            switch(this.returnType) {
                case BOOLEAN: pseudoArray = PseudoArray.createArray("boolean", null); break;
                case INT: pseudoArray = PseudoArray.createArray("int", null); break;
                case FLOAT: pseudoArray = PseudoArray.createArray("float", null); break;
                case STRING: pseudoArray = PseudoArray.createArray("String", null); break;
                default:break;	
            }

            this.returnValue = new PseudoValue(pseudoArray, "array");
        }
		
	}

    public FunctionType getReturnType() {
        return this.returnType;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public void addParameter(String id, PseudoValue pseudoValue) {
        this.parameters.put(id, pseudoValue);

        this.localScope.addVariable(id ,this.parameters.get(id));

    }

    public int getParameterCount() {
        return this.parameters.size();
    }

    public boolean searchParameter(String id) {
        return parameters.containsKey(id);
    }

    public PseudoValue getParamAt(int index) {
        int i = 0;

        for(PseudoValue pv : this.parameters.values()) {
            if(i == index) {
                return pv;
            }

            i++;
        }

        return null;

    }

    public void mapArrayParameter(String id, PseudoValue pseudoValue, int index) {
        if (index >= this.getParameterCount()) {
            return;
        }

        PseudoArray passedArray = (PseudoArray) pseudoValue.getValue();

        PseudoArray copyArray = new PseudoArray(passedArray.getPrimitiveType(), id);
        PseudoValue copyValue = new PseudoValue(copyArray, PrimitiveType.ARRAY);
        copyArray.initSize(passedArray.getSize());
        
        for (int i = 0; i<copyArray.getSize(); i++) {
            copyArray.updateValueAt(passedArray.getValueAt(i), i);
        }

        String origId = this.getParamIdAt(index);
        this.parameters.put(origId, copyValue);
    }

    public String getParamIdAt(int index) {
        int x = 0;

        for (String id : this.parameters.keySet()) {
            if (index == x) {
                return id;
            }
            x++;
        }

        return null;
    }




}