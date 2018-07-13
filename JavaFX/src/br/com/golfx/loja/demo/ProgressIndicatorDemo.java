/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.golfx.loja.demo;

import javafx.application.Application;
import javafx.concurrent.Task;
import javafx.scene.Scene;
import javafx.scene.control.ProgressIndicator;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import javax.swing.JOptionPane;

/**
 *
 * @author walmir.silva
 */
public class ProgressIndicatorDemo extends Application {
    private AnchorPane pane;
    @Override
    public void start(Stage stage) throws Exception {
        initComponents();
        initProgressIndicator();
        
        Scene scene = new Scene(pane);
        
        stage.setScene(scene);
        stage.setResizable(false);
        stage.show();
    }
    
    private void initComponents() {
        pane = new AnchorPane();
        pane.setPrefSize(400,150);
    }
    
    private void initProgressIndicator() {
        ProgressIndicator progress = new ProgressIndicator(0.0);
        
        Task<Void> task = new Task<Void>() {
            @Override
            protected Void call() throws Exception {
                final int max = 10;
                for (int i= 1; i <= max; i++) {
                    updateProgress(i, max);
                    try {
                        Thread.sleep(1000);
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
                JOptionPane.showMessageDialog(null, "Progresso concluído");
                return null;
            }  
        };
        progress.progressProperty().bind(task.progressProperty());
        
        new Thread(task).start();
        
        pane.getChildren().add(progress);
    }
    
    public static void main(String[] args) {
        launch(args);
    }
    
}
