
package model;
import java.util.*;
import view.AppView;

public class Printer {

    private static Printer instance = null;
    private AppView view;
    
    public static Printer getInstance() {
        if (instance == null) {
            instance = new Printer();
            System.out.println("Printer initialized");
        }


        return instance;
    }

    public void addView(AppView view) {
        this.view = view;
    }

    public void print(String msg) {
        view.printToConsole(msg);
    }

}