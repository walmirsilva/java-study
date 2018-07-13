/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.golfx.loja.demo;
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Accordion;
import javafx.scene.control.Label;
import javafx.scene.control.TitledPane;
import javafx.scene.layout.AnchorPane;
/**
 *
 * @author walmir.silva
 */
public class AccordionDemo extends Application {
    
    private AnchorPane pane;

    @Override
    public void start(Stage stage) throws Exception {
        initComponents();
        initAccordion();
        
        Scene scene = new Scene(pane);
       
        stage.setScene(scene);
        stage.setResizable(false);
        stage.show();
    }
    
    private void initComponents() {
        pane = new AnchorPane();
        pane.setPrefSize(400,200);
        
        
    }
    
    private void initAccordion() {
        Accordion accordion = new Accordion();
        
        TitledPane tPane1 = new TitledPane("Primeiro Painel",
            new Label("Primeiro painel aberto!")
        );
        
        TitledPane tPane2 = new TitledPane("Segundo Painel",
            new Label("Segundo painel aberto!")
        );
        
        TitledPane tPane3 = new TitledPane("Terceiro Painel",
            new Label("Terceiro painel aberto!")
        );
        
        accordion.getPanes().addAll(tPane1, tPane2, tPane3);
        
        pane.getChildren().add(accordion);
    }
    
    public static void main(String[] args) {
        launch(args);
    }
    
}
