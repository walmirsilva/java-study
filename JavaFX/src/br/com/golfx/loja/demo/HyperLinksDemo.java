/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.golfx.loja.demo;

import java.awt.Desktop;
import java.net.URI;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Hyperlink;

import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
/**
 *
 * @author walmir.silva
 */
public class HyperLinksDemo extends Application {
    private AnchorPane pane;
    @Override
    public void start(Stage stage) throws Exception {
        initComponents();
        
        Scene scene = new Scene(pane);
        
        stage.setScene(scene);
        stage.setResizable(false);
        stage.show();
        
    }
    
    private void initComponents() {
        pane = new AnchorPane();
        pane.setPrefSize(300,200);
        
        Hyperlink link = new Hyperlink("Click aqui...");
        
        link.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                try {
                    Desktop.getDesktop().browse(new URI("http://www.casadocodigo.com.br"));
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
        
        pane.getChildren().add(link);
        
    }
    
    public static void main(String[] args) {
        launch(args);
    }
    
}
