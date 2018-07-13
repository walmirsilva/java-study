/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.golfx.loja;
import javafx.animation.FadeTransition;
import javafx.animation.KeyFrame;
import javafx.animation.KeyValue;
import javafx.animation.ParallelTransition;
import javafx.animation.ScaleTransition;
import javafx.animation.SequentialTransition;
import javafx.animation.Timeline;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.effect.Reflection;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import javafx.util.Duration;

/**
 *
 * @author walmir.silva
 */
public class ItemApp extends Application {

    private AnchorPane pane;
    private ImageView imgItem;
    private Label lbPreco;
    private Label lbDescricao;
    private Button btAddCarrinho;
    private static Stage stage;
    private static Produto produto;
    private static int index = 0;
    private static String[] imagens = {
        "img/bola_topper.jpg",
        "img/luvas_umbro.jpg",
        "img/camisa_espportiva.jpg",
        "img/chuteira_nike.jpg",
        "img/caneleira_topper.jpg"
    };
    
    @Override
    public void start(Stage stage) throws Exception {
        initComponents();
        initListeners();
        initTransition();
        initTimeline();
        
        Scene scene = new Scene(pane);
        
        stage.setScene(scene);
        stage.setResizable(false);
        stage.setTitle(String.format("Produto: %s",produto.getProduto()));
        stage.show();
        
        initLayout();
        ItemApp.stage = stage;
    }
    
    private void initTransition() {
        FadeTransition fTransition = new FadeTransition(Duration.millis(3000), imgItem);
        fTransition.setFromValue(0.0);
        fTransition.setToValue(1.0);
        
        ScaleTransition sTransition = new ScaleTransition(Duration.millis(2000), btAddCarrinho);
        sTransition.setToX(1.5);
        sTransition.setToY(1.5);
        sTransition.setAutoReverse(true);
        
//        // Efetuado Transição paralela
//        ParallelTransition pTransition = new ParallelTransition();
//        pTransition.getChildren().addAll(fTransition, sTransition);
//        pTransition.play();
        
        // Efetuando Transição Squencial
        SequentialTransition seqTransition = new SequentialTransition();
        seqTransition.getChildren().addAll(fTransition, sTransition);
        seqTransition.play();
    }
    
    private void initTimeline() {
        Timeline timeline = new Timeline();
        KeyValue kv = new KeyValue(imgItem.opacityProperty(), 0.0);
        KeyFrame kf = new KeyFrame(Duration.millis(2000), kv);
        
        timeline.getKeyFrames().add(kf);
        timeline.setCycleCount(Timeline.INDEFINITE);
        timeline.setAutoReverse(true);
        timeline.play();
    }
    
    private void initComponents() {
        pane = new AnchorPane();
        pane.setPrefSize(600, 400);
        
        Image image = new Image(getClass().getResource(imagens[index]).toExternalForm());
        
        imgItem = new ImageView();
        imgItem.setImage(image);
        imgItem.setEffect(new Reflection());
        
        lbDescricao = new Label(String.format("Descrição: %s", produto.getProduto()));
        lbPreco = new Label(String.format("Preço: %.2f", produto.getPreco()));
        
        btAddCarrinho = new Button("Adicinoar ao Carrinho");
        
        pane.getChildren().addAll(imgItem, lbDescricao, lbPreco, btAddCarrinho);
    }
    
    private void initLayout() {
        
        imgItem.setFitWidth(300);
        imgItem.setPreserveRatio(true);
        imgItem.setSmooth(true);
        imgItem.setCache(true);
         
        lbDescricao.setLayoutX(320);
        lbDescricao.setLayoutY(10);
        
        lbPreco.setLayoutX(320);
        lbPreco.setLayoutY(40);
        
        btAddCarrinho.setLayoutX(320);
        btAddCarrinho.setLayoutY(80);
        
    }
    
    private void initListeners() {
        btAddCarrinho.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                VitrineApp.carrinho.addProdutos(produto);
                try {
                    new CarrinhoApp().start(new Stage());
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
        
        btAddCarrinho.setOnMouseEntered(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent event) {
                ScaleTransition transition = new ScaleTransition(Duration.millis(2000), btAddCarrinho);
                transition.setToX(1.5);
                transition.setToY(1.5);
                transition.play();
            }
        });
        
        btAddCarrinho.setOnMouseExited(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent event) {
                ScaleTransition transition = new ScaleTransition(Duration.millis(2000), btAddCarrinho);
                transition.setToX(1.0);
                transition.setToY(1.0);
                transition.play();
            }
            
        });
    }
    
    public static Stage getStage() {
        return stage;
    }
    
    public static Produto getProduto() {
        return produto;
    }
    
    public static void setProduto(Produto produto) {
        ItemApp.produto = produto;
    }
    
    public static int getIndex() {
        return index;
    }
    
    public static void setIndex(int index) {
        ItemApp.index = index;
    }
    
    public static void main(String[] args) {
        launch(args);
    }
}
