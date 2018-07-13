/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.golfx.loja;

import javafx.application.Application;
import javafx.application.Platform;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.AnchorPane;
import javax.swing.JOptionPane;
/**
 *
 * @author walmir.silva
 */
public class CarrinhoApp extends Application {
    private AnchorPane pane;
    private TableView<ItensProperty> tbCarrinho;
    private TableColumn<ItensProperty, String> columnProduto;
    private TableColumn<ItensProperty, Double> columnPreco;
    private Button btExcluirItem;
    private Button btVoltarVitrine;
    private Button btConfirmarCompra;
    private ObservableList<ItensProperty> listItens;
    private static Stage stage;
    
   
    
    @Override
    public void start(Stage stage) throws Exception {
        initComponents();
        initListeners();
        
        Scene scene = new Scene(pane);
        
        stage.setScene(scene);
        stage.setResizable(false);
        stage.setTitle("Carrinho de Compras - GolFX");
        stage.show();
        
        initLayout();        
        CarrinhoApp.stage = stage;               
    }
    
    private void initComponents() {
        listItens = FXCollections.observableArrayList();
        
        pane = new AnchorPane();
        pane.setPrefSize(800, 600);
        pane.setStyle("-fx-background-color: linear-gradient(from 0% 0% to 100% 100%, blue 0%, silver 100%);");
        
        tbCarrinho = new TableView<ItensProperty>();
        
        initItens();
        tbCarrinho.setItems(listItens);
        tbCarrinho.setPrefSize(780, 550);
        
        columnProduto = new TableColumn<ItensProperty, String>("Produto");
        columnProduto.setCellValueFactory(
            new PropertyValueFactory<ItensProperty, String>("produto"));
        
        columnPreco = new TableColumn<ItensProperty, Double>("Preço");
        columnPreco.setCellValueFactory(
             new PropertyValueFactory<ItensProperty, Double>("preco")
        );
        
        tbCarrinho.getColumns().addAll(columnProduto, columnPreco);
        
        btExcluirItem = new Button("Excluir Item");
        btVoltarVitrine = new Button("Voltar à Vitrine");
        btConfirmarCompra = new Button("Confirmar Compra");
        
        pane.getChildren().addAll(tbCarrinho, btExcluirItem, btVoltarVitrine, 
                                  btConfirmarCompra);
    }
    
    private void initLayout() {
        tbCarrinho.setLayoutX(10);
        tbCarrinho.setLayoutY(5);
        
        btExcluirItem.setLayoutX(10);
        btExcluirItem.setLayoutY(570);
        
        btVoltarVitrine.setLayoutX((pane.getWidth() - btVoltarVitrine.getWidth()) / 2);
        btVoltarVitrine.setLayoutY(570);
        
        btConfirmarCompra.setLayoutX(675);
        btConfirmarCompra.setLayoutY(570);
    }
    
    private void initItens() {
        for (Produto p : VitrineApp.carrinho.getProdutos())
            listItens.add(new ItensProperty(p.getProduto(), p.getPreco()));
    }
    
    public static Stage getStage() {
        return stage;
    }
    
    private void initListeners() {
        btExcluirItem.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                VitrineApp.carrinho.removeProduto(
                    new Produto((tbCarrinho.getSelectionModel().getSelectedItem().getProduto()),
                                 tbCarrinho.getSelectionModel().getSelectedItem().getPreco()));
                
                tbCarrinho.getItems().remove(tbCarrinho.getSelectionModel().getSelectedItem());
            }
        });
        
        btVoltarVitrine.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                CarrinhoApp.getStage().close();
                ItemApp.getStage().close();
            }
        });
        
        btConfirmarCompra.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                Thread thread = new Thread() {
                    public void run() {
                        try {
                            sleep(5000);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                        
                        JOptionPane.showMessageDialog(null, "Compra realizada com sucesso!");
                        
                        Platform.runLater(new Runnable() {
                            @Override
                            public void run() {
                                CarrinhoApp.getStage().close();
                                ItemApp.getStage().close();
                            }
                        });
                    }
                };
                thread.start();
            }
        });
    }
    public static void main(String[] args) {
        launch(args);
    }
    
}
