package controller;

import java.util.*;

import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CharStream;

import model.*;
import view.AppView;

public class AppController {

    private Parser parser;
    private AppView view;

    public AppController(Parser parser, AppView view) {
        this.parser = parser;
        this.view = view;        
        init();
    }

    public void parse(String input) {
        Console.reset();

        System.out.println("----------- PARSING ----------");

        CharStream stream = CharStreams.fromString(input);
        parser.setInput(stream);
        parser.parse();

        view.updateLogs(Console.getErrorList());
    }

    public void execute() {
        System.out.println("----------- EXECUTING ----------");
        
        // execute all in execution manager

        // after, cleanup and reset
    }

    private void init() {
        System.out.println("----------- INITIALIZING ----------");
        Console.startInstance(); 
        ScopeManager.getInstance();
        RuntimeManager.getInstance();
    }

    public void showTree(String input) {
        System.out.println("----------- SHOW TREE ----------");
        CharStream stream = CharStreams.fromString(input);
        parser.setInput(stream);
        parser.showTree();
    }
}