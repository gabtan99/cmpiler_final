package view;

import java.util.*;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

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
import javafx.scene.control.Alert;
import javafx.scene.control.ButtonType;
import javafx.event.ActionEvent; 

import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CharStream;
import org.fxmisc.richtext.*;

import controller.AppController;

public class AppView {
    private AppController controller;
    TextArea textArea;

    public AppView (Stage stage) {
        // MENU GUI
        Menu fileMenu = new Menu("File");


        // New
        MenuItem fileMenuItem1 = new MenuItem("New");
        Image plusIcon = new Image(getClass().getResourceAsStream("/assets/plus.png"));
        ImageView plusIconView = new ImageView(plusIcon);
        plusIconView.setFitWidth(17);
        plusIconView.setFitHeight(17);
        fileMenuItem1.setGraphic(plusIconView);
        

        // Open
        Image folderIcon = new Image(getClass().getResourceAsStream("/assets/folder.png"));
        ImageView folderIconView = new ImageView(folderIcon);
        folderIconView.setFitWidth(17);
        folderIconView.setFitHeight(17);
        MenuItem fileMenuItem2 = new MenuItem("Open");
        fileMenuItem2.setGraphic(folderIconView);
        fileMenuItem2.addEventHandler(ActionEvent.ACTION,event ->{ 
            readFile();
        });

        // Exit 
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
        
        // Parse
        MenuItem runMenuItem1 = new MenuItem("Parse");
        Image playIcon = new Image(getClass().getResourceAsStream("/assets/play.png"));
        ImageView playIconView = new ImageView(playIcon);
        playIconView.setFitWidth(17);
        playIconView.setFitHeight(17);
        runMenuItem1.setGraphic(playIconView);

        // Show Parse Tree
        MenuItem runMenuItem2 = new MenuItem("Show Parse Tree");
        Image treeIcon = new Image(getClass().getResourceAsStream("/assets/tree.png"));
        ImageView treeIconView = new ImageView(treeIcon);
        treeIconView.setFitWidth(17);
        treeIconView.setFitHeight(17);
        runMenuItem2.setGraphic(treeIconView);

        runMenu.getItems().add(runMenuItem1);
        runMenu.getItems().add(runMenuItem2);

        MenuBar menuBar = new MenuBar(fileMenu, runMenu);

        // TEXT EDITOR
        CodeArea codeArea = new CodeArea();
        codeArea.setParagraphGraphicFactory(LineNumberFactory.get(codeArea));
        codeArea.setMinHeight(370);

        runMenuItem1.addEventHandler(ActionEvent.ACTION,event -> { 
            controller.parse(codeArea.getText());
        });

        runMenuItem2.addEventHandler(ActionEvent.ACTION,event -> { 
            controller.showTree(codeArea.getText());
        });

        fileMenuItem1.addEventHandler(ActionEvent.ACTION,event ->{ 
            Alert alert = new Alert(Alert.AlertType.CONFIRMATION);
            alert.setTitle("New project");
            alert.setHeaderText("Changes in the text editor will not be saved.");
            alert.setContentText("Are you sure?");

            alert.showAndWait().ifPresent(response -> {
                if (response == ButtonType.OK) {
                    codeArea.clear();
                }
            });
            
        });
        
        // CONSOLE
        textArea = new TextArea("Output");
        textArea.setEditable(false);
        textArea.setMinHeight(230);

        VBox vBox = new VBox(menuBar,codeArea, textArea);
        Scene scene = new Scene(vBox, 800, 600);

        stage.setScene(scene);
        stage.setResizable(false);
        stage.getIcons().add(new Image("/assets/code.png"));
        stage.setTitle("Psuedocode Compiler by Tan & Ty");
        stage.show();

    }

    private void readFile() {

         System.out.println("Try read file");
    }

    public void updateLogs(List<String> output) {
        StringBuilder logs = new StringBuilder(""); 

        if (output.isEmpty()) {
            logs.append("Parsing Complete. No errors found.");
        }

        output.forEach((li) -> {
            logs.append(li + "\n");
        });

        textArea.setText(logs.toString());
    }

    public void setController(AppController controller) {
        this.controller = controller;
    }
}