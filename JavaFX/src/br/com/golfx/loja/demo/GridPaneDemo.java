/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.golfx.loja.demo;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

/**
 *
 * @author walmir.silva
 */
public class GridPaneDemo extends Application {
    
    private AnchorPane pane;
    private GridPane gPane;

    @Override
    public void start(Stage stage) throws Exception {
        initComponents();
        initGridPane();
        
        Scene scene = new Scene(pane);
        
        stage.setScene(scene);
        stage.setResizable(false);
        stage.show();
    }
    
    private void initComponents() {
        pane = new AnchorPane();
        pane.setPrefSize(300, 200);
        
    }
    
    private void initGridPane() {
        gPane = new GridPane();
        gPane.setHgap(10);
        gPane.setVgap(10);
        
        Label lbLogin = new Label("Login:");
        TextField txLogin = new TextField();
        
        Label lbSenha = new Label("Senha:");
        PasswordField txSenha = new PasswordField();
        
        Button btEntrar = new Button("Entrar");
        Button btSair = new Button("Sair");
        
        gPane.addRow(0, lbLogin, txLogin);
        gPane.addRow(1, lbSenha, txSenha);
        gPane.addRow(3, btEntrar, btSair);
        
        pane.getChildren().add(gPane);
    }
    
    public static void main(String[] args) {
        launch(args);
    }
    
}
