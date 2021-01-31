package model;

import java.util.*;
import model.commands.*;
import model.objects.*;


public class RuntimeThread extends Thread {

    // put the flags / semaphore here instead(?)
    private List<Command> commandList;
    private volatile boolean canExec;
    private int index;
    
    public RuntimeThread(List<Command> commandList) {
        this.commandList = commandList;
        this.canExec = true;
    }

    @Override
    public void run() {
        System.out.println("Starting a runtime thread. Count: " + commandList.size());

        index = 0;
        while (index < commandList.size() ) {
            if (canExec) {
                System.out.println("Executing " + commandList.get(index).getClass());
                commandList.get(index).execute();
                index ++;
            } 
        }

        RuntimeManager.getInstance().reset();
    }

    public void setExecFlag(boolean canExec) {
        this.canExec = canExec;
    }

    public void kill() {
        index = commandList.size(); // make index go over size
    }


}
