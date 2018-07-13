/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.golfx.loja.graficos;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.chart.LineChart;
import javafx.scene.chart.NumberAxis;
import javafx.scene.chart.XYChart;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
/**
 *
 * @author walmir.silva
 */
public class LineChartDemo extends Application {
    private AnchorPane pane;
    @Override
    public void start(Stage stage) throws Exception {
        initComponents();
        initLineChart();
        
        Scene scene = new Scene(pane);
        
        stage.setScene(scene);
        stage.setResizable(false);
        stage.show();
    }
    
    private void initComponents() {
        pane = new AnchorPane();
        pane.setPrefSize(400, 200);
    }
    
    private void initLineChart() {
        
        LineChart<Number, Number> chartLinguagens = 
             new LineChart<Number, Number>(
                    new NumberAxis(2008, 2013, 5), new NumberAxis());
        chartLinguagens.setTitle("Ranking de Linguagens de Programação Mar/2013");
        
        XYChart.Series<Number, Number> serieJava = 
                new XYChart.Series<Number, Number>();
        serieJava.setName("Java");
        serieJava.getData().addAll(
            new XYChart.Data<Number, Number>(2008, 1),
            new XYChart.Data<Number, Number>(2013, 1));
        
        XYChart.Series<Number, Number> serieC = 
                new XYChart.Series<Number, Number>();
        serieC.setName("C");
        serieC.getData().addAll(
            new XYChart.Data<Number, Number>(2008, 2),
            new XYChart.Data<Number, Number>(2013, 2));
        
        XYChart.Series<Number, Number> serieObjectiveC = 
                new XYChart.Series<Number, Number>();
        serieObjectiveC.setName("Objective-C");
        serieObjectiveC.getData().addAll(
            new XYChart.Data<Number, Number>(2008, 45),
            new XYChart.Data<Number, Number>(2013, 3));
        
        XYChart.Series<Number, Number> serieCPlus = 
                new XYChart.Series<Number, Number>();
        serieCPlus.setName("C++");
        serieCPlus.getData().addAll(
            new XYChart.Data<Number, Number>(2008, 5),
            new XYChart.Data<Number, Number>(2013, 4));
        
        XYChart.Series<Number, Number> serieCSharp = 
                new XYChart.Series<Number, Number>();
        serieCSharp.setName("C#");
        serieCSharp.getData().addAll(
            new XYChart.Data<Number, Number>(2008, 8),
            new XYChart.Data<Number, Number>(2013, 5));
        
        chartLinguagens.getData().addAll(serieJava, serieC, serieObjectiveC, serieCPlus, serieCSharp);
        
        pane.getChildren().add(chartLinguagens);        
    }
    
    public static void main(String[] args) {
        launch(args);
    }
}

