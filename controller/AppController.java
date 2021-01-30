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
        System.out.println("----------- PARSING ----------");

        ScopeManager.getInstance().reset();
        Console.reset();

        CharStream stream = CharStreams.fromString(input);
        parser.setInput(stream);
        parser.parse();

        view.updateLogs(Console.getErrorList());
    }

    public void execute() {
        System.out.println("----------- EXECUTING ----------");
        
        // execute all in execution manager
        RuntimeManager.getInstance().executeAll();
    }

    private void init() {
        System.out.println("----------- INITIALIZING ----------");
        Console.startInstance(); 
        Printer.getInstance();
        Printer.getInstance().addView(this.view);
        RuntimeManager.getInstance();
    }

    public void showTree(String input) {
        System.out.println("----------- SHOW TREE ----------");
        CharStream stream = CharStreams.fromString(input);
        parser.setInput(stream);
        parser.showTree();
    }
}