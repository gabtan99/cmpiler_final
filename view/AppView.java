package view;

import javafx.stage.Stage;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.ScrollPane;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;
import javafx.scene.control.MenuItem;
import javafx.scene.layout.VBox;
import javafx.scene.control.ScrollPane;
import javafx.scene.control.TextArea;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.Node;
import javafx.event.ActionEvent; 

import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CharStream;
import org.fxmisc.richtext.*;

import controller.AppController;

public class AppView {
    private AppController controller;

    public AppView (Stage stage) {
        // MENU GUI
        Menu fileMenu = new Menu("File");

        MenuItem fileMenuItem1 = new MenuItem("New");
        Image plusIcon = new Image(getClass().getResourceAsStream("/assets/plus.png"));
        ImageView plusIconView = new ImageView(plusIcon);
        plusIconView.setFitWidth(17);
        plusIconView.setFitHeight(17);
        fileMenuItem1.setGraphic(plusIconView);

        Image folderIcon = new Image(getClass().getResourceAsStream("/assets/folder.png"));
        ImageView folderIconView = new ImageView(folderIcon);
        folderIconView.setFitWidth(17);
        folderIconView.setFitHeight(17);
        MenuItem fileMenuItem2 = new MenuItem("Open");
        fileMenuItem2.setGraphic(folderIconView);

        Image exitIcon = new Image(getClass().getResourceAsStream("/assets/exit.png"));
        ImageView exitIconView = new ImageView(exitIcon);
        exitIconView.setFitWidth(17);
        exitIconView.setFitHeight(17);
        MenuItem fileMenuItem3 = new MenuItem("Exit");
        fileMenuItem3.setGraphic(exitIconView);
        fileMenuItem3.addEventHandler(ActionEvent.ACTION,event ->{ 
            stage.close();
        });

        fileMenu.getItems().add(fileMenuItem1);
        fileMenu.getItems().add(fileMenuItem2);
        fileMenu.getItems().add(fileMenuItem3);

        Menu runMenu = new Menu("Run");
        Image playIcon = new Image(getClass().getResourceAsStream("/assets/play.png"));
        ImageView playIconView = new ImageView(playIcon);
        playIconView.setFitWidth(17);
        playIconView.setFitHeight(17);
        runMenu.setGraphic(playIconView);

        MenuBar menuBar = new MenuBar(fileMenu, runMenu);

        // TEXT EDITOR
        CodeArea codeArea = new CodeArea();
        codeArea.setParagraphGraphicFactory(LineNumberFactory.get(codeArea));
        codeArea.setMinHeight(370);
        
        // CONSOLE
        TextArea textArea = new TextArea("Output");
        textArea.setDisable(true);
        textArea.setMinHeight(230);

        VBox vBox = new VBox(menuBar,codeArea, textArea);
        Scene scene = new Scene(vBox, 800, 600);

        stage.setScene(scene);
        stage.setResizable(false);
        stage.getIcons().add(new Image("/assets/code.png"));
        stage.setTitle("Psuedocode Compiler by Tan & Ty");
        stage.show();
    }

    private void runCode() {
        // controller runs the input with model then updates view
    }

    public void updateConsole() {
        // controller calls this and updates console
    }

    public void setController(AppController controller) {
        this.controller = controller;
    }
}