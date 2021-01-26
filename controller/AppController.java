package controller;

import java.util.*;

import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CharStream;

import model.Console;
import model.Parser;
import view.AppView;

public class AppController {

    private Parser parser;
    private AppView view;

    public AppController(Parser parser, AppView view) {
        this.parser = parser;
        this.view = view;        
        Console.init();
    }

    public void parse(String input) {

        Console.reset();

        System.out.println("----------- PARSING ----------");
        // process the input
        CharStream stream = CharStreams.fromString(input);
        parser.setInput(stream);
        parser.parse();

        view.updateLogs(Console.getErrorList());
    }

    public void showTree(String input) {
        System.out.println("----------- SHOW TREE ----------");
        CharStream stream = CharStreams.fromString(input);
        parser.setInput(stream);
        parser.showTree();
    }
}