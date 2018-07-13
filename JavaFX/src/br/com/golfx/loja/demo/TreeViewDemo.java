/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.golfx.loja.demo;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.TreeItem;
import javafx.scene.control.TreeView;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
/**
 *
 * @author walmir.silva
 */
public class TreeViewDemo extends Application {
    private AnchorPane pane;
    @Override
    public void start(Stage stage) throws Exception {
        initComponents();
        initTreeView();
        
        Scene scene = new Scene(pane);
        
        stage.setScene(scene);
        stage.setResizable(false);
        stage.show();
    }
    
    private void initComponents() {
        pane = new AnchorPane();
        pane.setPrefSize(400,200);
    }
    
    private void initTreeView() {
        TreeView<String> treeView = new TreeView<String>();        
        TreeItem<String> item1 = new TreeItem<String>("Tópico 1");
        TreeItem<String> subItem1 = new TreeItem<String>("Tópico 1.1");
        TreeItem<String> subItem1_1 = new TreeItem<String>("Tópico 1.1.1");
        TreeItem<String> subItem1_2 = new TreeItem<String>("Tópico 1.1.2");
        TreeItem<String> subItem2 = new TreeItem<String>("Tópico 1.2");
        TreeItem<String> subItem3 = new TreeItem<String>("Tópico 1.3");
        TreeItem<String> subItem3_1 = new TreeItem<String>("Tópico 1.3.1");
        
        item1.getChildren().addAll(subItem1, subItem2, subItem3);
        subItem1.getChildren().addAll(subItem1_1, subItem1_2);
        subItem3.getChildren().add(subItem3_1);
        
        treeView.setRoot(item1);
        
        pane.getChildren().add(treeView);
    }
    
    public static void main(String[] args) {
        launch(args);
    }
    
}
