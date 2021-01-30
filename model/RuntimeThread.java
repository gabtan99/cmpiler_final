package model;

import java.util.*;
import model.commands.*;
import model.objects.*;

public class RuntimeThread extends Thread {

    // put the flags / semaphore here instead(?)
    private List<Command> commandList;

    public RuntimeThread(List<Command> commandList) {
        this.commandList = commandList;
    }

    @Override
    public void run() {
        System.out.println("Starting a runtime thread. Count: " + commandList.size());
        for (Command c : this.commandList) {
            // check flag muna before execution
            System.out.println("Executing " + c.getClass());
            c.execute();
        }

        RuntimeManager.getInstance().cleanup();

        // try {

            
            
        // } catch(InterruptedException e) {
        //     // Console log here 
        // }
    }


}
