/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.golfx.loja;
import javafx.application.Application;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.effect.DropShadow;
import javafx.scene.layout.AnchorPane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

/**
 *
 * @author walmir.silva
 */
public class VitrineApp extends Application {
    
    private AnchorPane pane;
    private TextField txPesquisa;
    private TableView<ItensProperty> tbVitrine;
    private TableColumn<ItensProperty, String> columnProduto; 
    private TableColumn<ItensProperty, Double> columnPreco; 
    private static ObservableList<ItensProperty> listItens = FXCollections.observableArrayList();
    public static Carrinho carrinho = new Carrinho();
    
    private static Stage stage;
    
    @Override
    public void start(Stage stage) throws Exception {
        initComponents();
        initItens();
        initListeners();
        
        Scene scene = new Scene(pane);
        
        stage.setScene(scene);
        stage.setResizable(false);
        stage.setTitle("Vitrine - GolFX");
        stage.show();
        
        initLayout();
        VitrineApp.stage = stage;
    }
    
    @SuppressWarnings("unchecked")
    private void initComponents() {
        pane = new AnchorPane();
        pane.setPrefSize(800, 600);
        
        DropShadow ds = new DropShadow();
        ds.setSpread(0.5);
        ds.setColor(Color.RED);
        
        txPesquisa = new TextField();
        txPesquisa.setEffect(ds);
                
//        txPesquisa.setEffect(new DropShadow());
        txPesquisa.setPromptText("Digite o item para pesquisa");
        
        tbVitrine = new TableView<ItensProperty>();
        tbVitrine.setPrefSize(780, 550);
        
        columnProduto = new TableColumn<ItensProperty, String>("Produtos");
        columnProduto.setCellValueFactory(
            new PropertyValueFactory<ItensProperty, String>("produto"));
        
        columnPreco = new TableColumn<ItensProperty, Double>("Preço");
        columnPreco.setCellValueFactory(
            new PropertyValueFactory<ItensProperty, Double>("preco"));
        
        tbVitrine.getColumns().addAll(columnProduto, columnPreco);
        tbVitrine.setItems(listItens);
        
        pane.getChildren().addAll(txPesquisa, tbVitrine);
    }
    
    private void initLayout() {
        txPesquisa.setLayoutX(590);
        txPesquisa.setLayoutY(10);
        
        tbVitrine.setLayoutX(10);
        tbVitrine.setLayoutY(40);
    }
    
    private void initItens() {
        Vitrine v = new Vitrine();
        v.addProdutos(
            new Produto("Bola Topper", 15.00),
            new Produto("Luvas Umbro", 9.00),
            new Produto("Camisa Esportiva", 40.00),
            new Produto("Chuteira Nike Mercurial", 199.00),
            new Produto("Caneleira Topper", 10.00)
        );
        
        for (Produto p : v.getProdutos())
            listItens.add(new ItensProperty(p.getProduto(), p.getPreco()));
    }
        
    private void initListeners() {
        txPesquisa.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                if (!txPesquisa.getText().equals("")) {
                    tbVitrine.setItems(findItens());
                } else {
                    tbVitrine.setItems(listItens);
                }
            }
        });
        
        tbVitrine.getSelectionModel().selectedItemProperty()
            .addListener(new ChangeListener<ItensProperty>() {
                @Override
                public void changed(ObservableValue<? extends ItensProperty> observable, 
                                   ItensProperty oldItem, ItensProperty newItem) {
                   
                    ItemApp.setProduto(new Produto(
                        newItem.getProduto(), newItem.getPreco()));
                    
                    ItemApp.setIndex(tbVitrine.getSelectionModel().getSelectedIndex());
                    
                    try {
                        new ItemApp().start(new Stage());
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
               }
            });
    }
    
    private ObservableList<ItensProperty> findItens() {
        ObservableList<ItensProperty> itensEncontrados = FXCollections.observableArrayList();
        for (ItensProperty itens : listItens) {
            if (itens.getProduto().contains(txPesquisa.getText()))
                itensEncontrados.add(itens);
        }
        return itensEncontrados;
    }
    
    public static Stage getStage() {
        return stage;
    }
    
    public static void main(String[] args) {
        launch(args);
    }
}
