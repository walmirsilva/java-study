/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.golfx.loja;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import javax.swing.JOptionPane;

/**
 *
 * @author walmir.silva
 */
public class LoginApp extends Application {
    
    private AnchorPane pane;
    private TextField txLogin;
    private PasswordField txSenha;
    private Button btEntrar;
    private Button btSair;
    private static Stage stage;

    @Override
    public void start(Stage stage) throws Exception {
        initComponents();
        initListeners();
        
        Scene scene = new Scene(pane);
        scene.getStylesheets().add(getClass().getResource("css/login.css").toExternalForm());
        
        stage.setScene(scene);
        
        stage.setResizable(false);
        stage.setTitle("Login - GolFX");
        stage.show();
        
        initLayout();
        LoginApp.stage = stage;
    }
    
    private void initComponents() {
        pane = new AnchorPane();
        pane.setPrefSize(400, 300);
        pane.getStyleClass().add("pane");
//        pane.setStyle("-fx-background-color: linear-gradient("
//                + "from 0% 0% to 100% 100%, blue 0%, silver 100%);");
        
        txLogin = new TextField();
        txLogin.setPromptText("Digite aqui seu login");

        txSenha = new PasswordField();
        txSenha.setPromptText("Digite aqui sua senha");
        
        btEntrar = new Button("Entrar");
        btEntrar.getStyleClass().add("btEntrar");
        
        
        btSair = new Button("Sair");
        btSair.getStyleClass().add("btSair");
        
        pane.getChildren().addAll(txLogin, txSenha, btEntrar, btSair);
    }
    
    private void initLayout() {
        txLogin.setLayoutX((pane.getWidth() - txLogin.getWidth()) / 2);
        txLogin.setLayoutY(50);
        
        txSenha.setLayoutX((pane.getWidth() - txSenha.getWidth()) / 2);
        txSenha.setLayoutY(100);
        
        btSair.setLayoutX((pane.getWidth() - btSair.getWidth()) / 2);
        btEntrar.setLayoutY(150);
        
        btEntrar.setLayoutX((pane.getWidth() - btEntrar.getWidth()) / 2);
        btSair.setLayoutY(200);
    }
    
    private void initListeners() {
        btEntrar.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                logar();
            }
            
        });
        btSair.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                fecharAplicacao();
            }
        });
    }
    
    private void logar() {
        if (txLogin.getText().equals("admin") &&
            txSenha.getText().equals("12345")) {
            try {
                new VitrineApp().start(new Stage());
                LoginApp.getStage().close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        } else {
            JOptionPane.showMessageDialog(null, "Login e/ou senha inválidos", "Erro", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    private void fecharAplicacao() {
        System.exit(0);
    }
    
    public static Stage getStage() {
        return stage;
    }
    
    public static void main(String ... args) {
        launch(args);
    }
    
}
