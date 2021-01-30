package model;

import java.util.*;
import model.commands.*;
import model.objects.*;


public class RuntimeManager {

    private static RuntimeManager instance = null;
    private static List<Command> commandList;
    private RuntimeThread thread;

    public static RuntimeManager getInstance() {
        if (instance == null) {
            instance = new RuntimeManager();
            commandList = new ArrayList<>();
            System.out.println("Runtime Manager initialized");
        }

        return instance;
    }


    public void initialize() {
        commandList = new ArrayList<Command>();
    }

    public void reset() {
        if (commandList != null) {
            commandList.clear();
        }

        System.out.println("Runtime was reset");
    }

    public void addCommand(Command c) {
        System.out.println("Added " + c.getClass() + " to command list");
        commandList.add(c);
    }

    public void executeAll() {
        thread = new RuntimeThread(commandList);
        thread.start();
    }

    public void pauseExecution() {
        this.thread.setExecFlag(false);
    }

    public void resumeExecution() {
        this.thread.setExecFlag(true);
    }

    //not sure pa
    public PseudoFunction getCurrentFunction() {
        return null;
        
    }

    public boolean isInFunctionExecution() {
        return true;

    }
}
