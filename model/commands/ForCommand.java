package model.commands;

import parser.PSCParser.ForStatementContext;

import model.*;
import model.objects.*;
import model.semcheck.*;
import java.util.*;


public class ForCommand implements ControlledCommand {

    private List<Command> commandList;
    private int counter;

    public ForCommand(ForStatementContext ) {
        commandList = new ArrayList<>();
    }

    @Override
    public void execute() {
        
    }
    @Override   
    public void addCommand(Command c) {

    }





    
}