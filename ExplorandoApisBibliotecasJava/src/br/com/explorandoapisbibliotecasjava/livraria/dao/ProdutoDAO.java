/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.explorandoapisbibliotecasjava.livraria.dao;

import br.com.explorandoapisbibliotecasjava.livraria.Autor;
import br.com.explorandoapisbibliotecasjava.livraria.ConnectionFactory;
import br.com.explorandoapisbibliotecasjava.livraria.produtos.Livro;
import br.com.explorandoapisbibliotecasjava.livraria.produtos.LivroFisico;
import br.com.explorandoapisbibliotecasjava.livraria.produtos.Produto;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

/**
 *
 * @author walmir.silva
 */
public class ProdutoDAO {
    
    public ObservableList<Produto> lista() {
        
        ObservableList<Produto> produtos = FXCollections.observableArrayList();
        
        try (Connection conn = new ConnectionFactory().getConnection()) {
            
            PreparedStatement ps = conn.prepareStatement("select * from produtos");
            ResultSet resultSet = ps.executeQuery();
            
            while(resultSet.next()) {
                Livro livro = new LivroFisico(new Autor());
                livro.setNome(resultSet.getString("nome"));
                livro.setDescricao(resultSet.getString("descricao"));
                livro.setValor(resultSet.getDouble("valor"));
                livro.setIsbn(resultSet.getString("isbn"));
                produtos.add(livro);
            }
            resultSet.close();
            ps.close();
//            conn.close(); // O try-with-resources fecha a conexão automaticamente
            
        } catch (SQLException e) {
            new RuntimeException(e);
        }
        return produtos;
    }
    
    public void adiciona(Produto produto) {
        try (Connection conn = new ConnectionFactory().getConnection()) {
            
            PreparedStatement ps = conn.prepareStatement("INSERT INTO produtos (nome, descricao, valor, isbn) values (?, ?, ?, ?)");
            ps.setString(1, produto.getNome());
            ps.setString(2, produto.getDescricao());
            ps.setDouble(3, produto.getValor());
            ps.setString(4, produto.getIsbn());
            ps.execute();
            ps.close();
            
        } catch(SQLException e) {
            new RuntimeException(e);
        }
        
    }
    
}
