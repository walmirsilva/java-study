/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.explorandoapisbibliotecasjava.livraria;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author walmir.silva
 */
public class ConnectionFactory {
    
//    public static void main(String[] args) throws SQLException {
//        Connection conn = new ConnectionFactory().getConnection();
//        System.out.println("Conexao aberta");
//        conn.close();
//    }
    
    public Connection getConnection() {
        String url = "jdbc:mysql://localhost:3306/livraria";
        try {
            return DriverManager.getConnection(url, "walmir.silva", "x4vcndfoe");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
    
}
