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
    private boolean isLessThan = false;

    public WhileCommand(WhileStatementContext whileStatementContext) {
        System.out.println("I MADE IT");
        this.commandList = new ArrayList<>();
        this.iteratorIdentifier = whileStatementContext.IDENTIFIER().getText();
        System.out.println(iteratorIdentifier);
        this.iterationToStatementCtx = whileStatementContext.iterationToStatement();
        this.simpleExpressionCtx = whileStatementContext.simpleExpression();
        this.scope = ScopeManager.getInstance().getScope();
        
        this.pseudoValue = scope.getVariableAllScope(iteratorIdentifier);


        if (iterationToStatementCtx.getText().contains("up")){
            this.isLessThan = true;
        } else {
            this.isLessThan = false;
        } 
    }

    @Override
    public void execute() {
        this.counter = Integer.parseInt(pseudoValue.getValue().toString());

        EvaluateCommand evalCommand = new EvaluateCommand(this.simpleExpressionCtx, this.scope);
        evalCommand.execute();

        if (this.isLessThan) {
            System.out.println(this.counter);
            while (this.counter < evalCommand.getEvaluated().intValue()) {
                int index = 0;
                while (index < commandList.size() ) {
                    if (RuntimeManager.getInstance().canExec()) {
                        commandList.get(index).execute();
                        index ++;
                    } 
                }
                System.out.println(this.counter);
                evalCommand = new EvaluateCommand(this.simpleExpressionCtx, this.scope);
                evalCommand.execute();
                this.updateCounter();
            }

        } else {
                System.out.println(this.counter);

            while (this.counter > evalCommand.getEvaluated().intValue()) {
                int index = 0;
                while (index < commandList.size() ) {
                    if (RuntimeManager.getInstance().canExec()) {
                        commandList.get(index).execute();
                        index ++;
                    } 
                }
                System.out.println(this.counter);
                evalCommand = new EvaluateCommand(this.simpleExpressionCtx, this.scope);
                evalCommand.execute();
                this.updateCounter();
            }

        }
        
    }

    @Override   
    public void addCommand(Command c) {
        this.commandList.add(c);
    }

    private void updateCounter() {
        if (this.isLessThan) {
            this.counter = Integer.parseInt(pseudoValue.getValue().toString());
            this.counter++;
            this.pseudoValue.setValue(this.counter);
        } else {
            this.counter = Integer.parseInt(pseudoValue.getValue().toString());
            this.counter--;
            this.pseudoValue.setValue(this.counter);
        }
        
    }





    
}