/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.golfx.loja.demo;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.scene.web.HTMLEditor;
import javafx.stage.Stage;
/**
 *
 * @author walmir.silva
 */
public class HtmlEditorDemo extends Application {
    private AnchorPane pane;
    private HTMLEditor editor;
    @Override
    public void start(Stage stage) throws Exception {
        initComponents();
        initHtmlEditor();
        
        Scene scene = new Scene(pane);
        
        stage.setScene(scene);
        stage.setResizable(false);
        stage.show();
    }
    
    private void initComponents() {
        pane = new AnchorPane();
        pane.setPrefSize(800,600);
    }
    
    private void initHtmlEditor() {
        editor = new HTMLEditor();
        
        pane.getChildren().add(editor);
    }
    
    public static void main(String[] args) {
        launch(args);
    }
    
}
