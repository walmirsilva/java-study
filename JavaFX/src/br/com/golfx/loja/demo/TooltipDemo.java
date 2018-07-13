/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.golfx.loja.demo;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.control.Tooltip;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
/**
 *
 * @author walmir.silva
 */
public class TooltipDemo extends Application {
    private AnchorPane pane;
    @Override
    public void start(Stage stage) throws Exception {
        initComponents();
        initTooltip();
        
        Scene scene = new Scene(pane);
        
        stage.setScene(scene);
        stage.setResizable(false);
        stage.show();
    }    
    
    private void initComponents() {
        pane = new AnchorPane();
        pane.setPrefSize(200,200);
    }
    
    private void initTooltip() {
        Label lbNome = new Label("Nome: ");
        TextField txNome = new TextField();
        txNome.setLayoutX(50);
        
        Tooltip.install(txNome, new Tooltip("Digite aqui seu nome completo..."));
        
        pane.getChildren().addAll(lbNome, txNome);
    }
    
    public static void main(String[] args) {
        launch(args);
    }
}
