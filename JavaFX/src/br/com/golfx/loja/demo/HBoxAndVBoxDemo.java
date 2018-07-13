/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.golfx.loja.demo;
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
/**
 *
 * @author walmir.silva
 */
public class HBoxAndVBoxDemo extends Application {
    private AnchorPane pane;
    private HBox hBox;
    private VBox vBox;
    
    @Override
    public void start(Stage stage) throws Exception {
        initComponents();
        initHBoxAndVBox();
        
        Scene scene = new Scene(pane);
        
        stage.setScene(scene);
        stage.setResizable(false);
        stage.show();
    }
    
    private void initComponents() {
        pane = new AnchorPane();
        pane.setPrefSize(300, 200);
    }
    
    
    private void initHBoxAndVBox() {
        hBox = new HBox();
        Label lbHBox1 = new Label("Estamos...");
        Label lbHBox2 = new Label("na caixa...");        
        Label lbHBox3 = new Label("Horizontal!");        
        hBox.getChildren().addAll(lbHBox1, lbHBox2, lbHBox3);
        
        vBox = new VBox();
        vBox.setLayoutY(30);
        
        Label lbVBox1 = new Label("Agora estamos...");
        Label lbVBox2 = new Label("na caixa...");        
        Label lbVBox3 = new Label("Vertical!");        
        vBox.getChildren().addAll(lbVBox1, lbVBox2, lbVBox3);
        
        pane.getChildren().addAll(hBox, vBox);
        
    }
    public static void main(String[] args) {
        launch(args);
    }
    
}
