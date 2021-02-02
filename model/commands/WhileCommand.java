package model.commands;

import parser.PSCParser.WhileStatementContext;
import parser.PSCParser.LoopDeclarationContext;
import parser.PSCParser.IterationToStatementContext;
import parser.PSCParser.SimpleExpressionContext;

import model.*;
import model.objects.*;
import model.semcheck.*;
import model.commands.*;
import java.util.*;


public class WhileCommand implements ControlledCommand {

    private List<Command> commandList;
    private IterationToStatementContext iterationToStatementCtx;
    private SimpleExpressionContext simpleExpressionCtx;
    private Scope scope;
    private PseudoValue pseudoValue;
    private int counter = 0;
    private String iteratorIdentifier ;
    private String strExpression = "";

    public WhileCommand(WhileStatementContext whileStatementContext) {
        // RuntimeManager.getInstance().addCommand(this);
        // RuntimeManager.getInstance().openControlledCommand(this);

        this.commandList = new ArrayList<>();
        this.iteratorIdentifier = whileStatementContext.IDENTIFIER().getText();
        this.iterationToStatementCtx = whileStatementContext.iterationToStatement();
        this.simpleExpressionCtx = whileStatementContext.simpleExpression();
        this.scope = ScopeManager.getInstance().getScope();
        
        this.pseudoValue = scope.getVariableAllScope(iteratorIdentifier);
        this.counter = (int)pseudoValue.getValue();
        // i > x + 3
        this.strExpression = this.strExpression + this.iteratorIdentifier;
        if (iterationToStatementCtx.getText().contains("up")){
            this.strExpression = this.strExpression + " < ";
        } else {
            this.strExpression = this.strExpression + " > ";
        }
        this.strExpression = this.strExpression + this.simpleExpressionCtx.getText();
        
    }

    @Override
    public void execute() {
        int index = 0;
        while (index < commandList.size() ) {
            if (RuntimeManager.getInstance().canExec()) {
                commandList.get(index).execute();
                index ++;
            } 
        }
    }
    @Override   
    public void addCommand(Command c) {
        this.commandList.add(c);
    }

    private void updateCounter() {
        this.counter = (int)pseudoValue.getValue();
        this.counter++;
        this.pseudoValue.setValue(this.counter);
    }





    
}