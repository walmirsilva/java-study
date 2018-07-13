/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.golfx.loja.demo;

import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.ContextMenu;
import javafx.scene.control.ListView;
import javafx.scene.control.MenuItem;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import javax.swing.JOptionPane;
/**
 *
 * @author walmir.silva
 */
public class ContextMenuDemo extends Application {
    private AnchorPane pane;
    @Override
    public void start(Stage stage) throws Exception {
        initComponents();
        initContextMenu();
        
        Scene scene = new Scene(pane);
        
        stage.setScene(scene);
        stage.setResizable(false);
        stage.show();
    }
    
    private void initComponents() {
        pane = new AnchorPane();
        pane.setPrefSize(400, 200);
        
        
    }
    
    private void initContextMenu() {
        final ListView<String> listView = new ListView<String>(
                FXCollections.observableArrayList("Primeiro item", 
                                                  "Segundo item",
                                                  "Terceiro item"));
       ContextMenu contextMenu = new ContextMenu();
       MenuItem item1 = new MenuItem("Mostrar valor");
       item1.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                JOptionPane.showMessageDialog(null, 
                    listView.getSelectionModel().getSelectedItem());
            }
        });
       
       MenuItem item2 = new MenuItem("Determinar valor nulo");
       item2.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                listView.getItems().set(listView.getSelectionModel().getSelectedIndex(),null);
            }
        });
       
       contextMenu.getItems().addAll(item1, item2);       
       listView.setContextMenu(contextMenu);
       
       pane.getChildren().add(listView);
       
    }
    
    public static void main(String[] args) {
        launch(args);
    }
    
    
}
