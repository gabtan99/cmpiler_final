package model;

import java.util.*;
import model.commands.*;

public class RuntimeManager {

    private static RuntimeManager instance = null;
    private static List<Command> commandList;
    
    public static void getInstance() {
        if (instance == null) {
            instance = new RuntimeManager();
        }
        commandList = new ArrayList<>();
        System.out.println("Runtime Manager initialized");
    }

    public static void reset() {
        if (commandList != null) {
            commandList.clear();
        }
    }

}
