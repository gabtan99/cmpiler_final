package controller;

import java.util.*;


import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CharStream;

import model.Parser;
import view.AppView;

public class AppController {

    private Parser parser;
    private AppView view;

    public AppController(Parser parser, AppView view) {
        this.parser = parser;
        this.view = view;        
    }

    public void parse(String input) {
        System.out.println("----------- PARSING ----------");
        // process the input
        CharStream stream = CharStreams.fromString(input);
        parser.setInput(stream);
        parser.parse();

        view.updateLogs(parser.getErrorList());
        System.out.println(parser.getErrorList().toString());
    }
}