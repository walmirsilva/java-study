/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.golfx.loja.graficos;

import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.Scene;
import javafx.scene.chart.PieChart;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

/**
 *
 * @author walmir.silva
 */
public class PieChartDemo extends Application {
    private AnchorPane pane;
    @Override
    public void start(Stage stage) throws Exception {
        initComponents();
        initPieChart();
        
        Scene scene = new Scene(pane);
        
        stage.setScene(scene);
        stage.setResizable(false);
        stage.show();        
    }
    
    private void initComponents() {
        pane = new AnchorPane();
        pane.setPrefSize(400, 400);        
    }
    
    private void initPieChart() {
        PieChart chartLinguagens = new PieChart();
        chartLinguagens.setTitle("Ranking de Linguagens de Programação Mar/2013");
        
        ObservableList<PieChart.Data> datas = FXCollections.observableArrayList(
            new PieChart.Data("Java", 18.156),
            new PieChart.Data("C", 17.141),
            new PieChart.Data("Objective-C", 10.230),
            new PieChart.Data("C++", 9.115),
            new PieChart.Data("C#", 6.597),
            new PieChart.Data("Outros", 38.761));
        
        chartLinguagens.setData(datas);
        
        pane.getChildren().add(chartLinguagens);
    }
    
    public static void main(String[] args) {
        launch(args);
    }
    
}
