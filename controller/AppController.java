package controller;

import model.Parser;
import view.AppView;

public class AppController {

    private Parser parser;
    private AppView view;

    public AppController(Parser parser, AppView view) {
        this.parser = parser;
        this.view = view;
    }

    public void parse() {
        // update view
        
    }
}