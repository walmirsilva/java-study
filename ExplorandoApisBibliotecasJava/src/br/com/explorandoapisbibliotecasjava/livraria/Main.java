/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.explorandoapisbibliotecasjava.livraria;

import br.com.explorandoapisbibliotecasjava.livraria.produtos.Produto;
import br.com.explorandoapisbibliotecasjava.livraria.dao.ProdutoDAO;
import java.io.IOException;
import javafx.application.Application;
import javafx.collections.ObservableList;
import javafx.concurrent.Task;
import javafx.concurrent.WorkerStateEvent;
import javafx.event.EventHandler;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

/**
 *
 * @author walmir.silva
 */
@SuppressWarnings({"unchecked", "rawtypes"})
public class Main extends Application {

    @Override
    public void start(Stage primaryStage) {
        Group group = new Group();
        Scene scene = new Scene(group, 690, 510);
        scene.getStylesheets().add(getClass().getResource("style.css").toExternalForm());

        ObservableList<Produto> produtos = new ProdutoDAO().lista();
        
//        // Gerar a quantidade de produtos
//        double valorTotal = 0.0;
//        for (Produto produto: produtos) {
//            valorTotal += produto.getValor();
//        }
        // Utilizando Java8 para trazer o total de forma mais funcinoal
       double valorTotal = produtos.stream().mapToDouble(Produto::getValor).sum();
       
        TableView<Produto> tableView = new TableView<>(produtos);

        TableColumn nomeColumn = criaColuna("Nome", 180, "nome");
        TableColumn descColumn = criaColuna("Descrição", 230, "descricao");
        TableColumn valorColumn = criaColuna("Valor", 60, "valor");
        TableColumn isbnColumn = criaColuna("ISBN", 180, "isbn");
        
        tableView.getColumns().addAll(nomeColumn, descColumn, valorColumn, isbnColumn);

        final VBox vbox = new VBox(tableView);
        vbox.setId("vbox");
//        vbox.setPadding(new Insets(70, 0, 0, 10));

        Label label = new Label("Listagem de Livros");
        label.setId("label-listagem");
//        // Setando CSS ao estilo da label
//        label.setStyle("-fx-font-size: 30px; -fx-padding: 20 0 10 10;");
//        label.setFont(Font.font("Lucida Grande", FontPosture.REGULAR, 30));
//        label.setPadding(new Insets(20, 0, 10, 10));
        
        Label progresso = new Label();
        progresso.setId("label-progresso");
//        progresso.setLayoutX(485);
//        progresso.setLayoutY(30);
            
        
        Button button = new Button("Exportar CSV");
//        button.setLayoutX(575);
//        button.setLayoutY(25);
        
//        button.setOnAction(event -> {
//            new Thread(() -> {
//                progresso.setText("Exportando...");
//                dormePorVinteSegundos();
//                exportarEmCSV(produtos);
//                progresso.setText("Concluído!");
//            }).start();
//        });
        
        button.setOnAction(event -> {
            Task<Void> task = new Task<Void>() {
                @Override
                protected Void call() throws Exception {
                    dormePorVinteSegundos();
                    exportarEmCSV(produtos);                    
                    return null;
                }            
            };
//            // Usando lambda            
//            task.setOnRunning(e -> progresso.setText("exportando..."));
            task.setOnRunning(new EventHandler<WorkerStateEvent>() {
                @Override
                public void handle(WorkerStateEvent event) {
                    progresso.setText("exportando...");
                }
            });
//            // Usando lambda
//            task.setOnSucceeded(e -> progresso.setText("concluído!"));
            task.setOnSucceeded(new EventHandler<WorkerStateEvent>() {
                @Override
                public void handle(WorkerStateEvent event) {
                    progresso.setText("concluído!");
                }
            });
            
            new Thread(task).start();
        });        
        
        Label labelFooter = new Label(
            String.format("Você tem R$%.2f em estoque, "
                    + "com um total de %d produtos.", valorTotal, produtos.size())
        );
        labelFooter.setId("label-footer");
        
        group.getChildren().addAll(label, vbox, button, progresso, labelFooter);

        primaryStage.setScene(scene);

        primaryStage.setTitle("Sistema da livraria com Java FX");
        primaryStage.show();
    }
    
    private TableColumn criaColuna(String titulo, int largura, String atributo) {
        TableColumn<Produto, String> column = new TableColumn<>(titulo);
        column.setMinWidth(largura);
        column.setCellValueFactory(
            new PropertyValueFactory<>(atributo));
        return column;
    }
    
    private void dormePorVinteSegundos() {
        try {
            Thread.sleep(20000);
        } catch (InterruptedException e) {
            System.out.println("Ops, ocorreu um erro" + e);
        }
    }
    
    private void exportarEmCSV(ObservableList<Produto> produtos) {
        try {
            new Exportador().paraCSV(produtos);
        } catch (IOException e) {
            System.out.println("Erro ao exportar: "+ e);
        }
    }
    public static void main(String[] args) {
        launch(args);
    }

}
