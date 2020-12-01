import javafx.application.Application;
import javafx.stage.Stage;

import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CharStream;

import java.io.IOException;

import model.Parser;
import view.AppView;
import controller.AppController;

public class App extends Application {

    @Override
    public void start(Stage stage) {

        try {
            CharStream input = CharStreams.fromFileName("./resources/example1.psc");
            Parser parser = new Parser(input);
            parser.parse();
    
            AppView view = new AppView(stage);
            AppController controller = new AppController(parser, view);
            view.setController(controller);
        }
        catch (IOException e) {
            e.printStackTrace();
        }

    }

    public static void main(String[] args) {
        launch();
    }

}