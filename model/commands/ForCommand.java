package model.commands;

import parser.PSCParser.ForStatementContext;
import parser.PSCParser.LoopDeclarationContext;
import parser.PSCParser.IterationToStatementContext;
import parser.PSCParser.SimpleExpressionContext;

import model.*;
import model.objects.*;
import model.semcheck.*;
import java.util.*;


public class ForCommand implements ControlledCommand {

    private List<Command> commandList;
    private int counter;
    private LoopDeclarationContext loopDeclarationCtx; 
    private IterationToStatementContext iterationToStatementCtx;
    private SimpleExpressionContext simpleExpressionCtx;

    public ForCommand(ForStatementContext forStatementContext) {
        this.commandList = new ArrayList<>();
        this.loopDeclarationCtx = forStatementContext.loopDeclaration();
        this.iterationToStatementCtx = forStatementContext.iterationToStatement();
        this.simpleExpressionCtx = forStatementContext.simpleExpression();
        
    }

    @Override
    public void execute() {
        
    }
    @Override   
    public void addCommand(Command c) {

    }





    
}