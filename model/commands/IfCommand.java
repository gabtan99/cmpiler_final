package model.commands;

import parser.PSCParser.SimpleExpressionContext;

import model.*;
import model.objects.*;
import model.semcheck.*;
import java.util.*;

public class IfCommand implements Command {

    private List<Command> positiveList;
    private List<Command> negativeList;

    public IfCommand(SimpleExpressionContext exprCtx, PseudoArray array) {
        positiveList = new ArrayList<>();
        negativeList = new ArrayList<>();
    }

    @Override
    public void execute() {
        
    }





    
}