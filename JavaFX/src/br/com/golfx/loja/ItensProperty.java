/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.golfx.loja;

import javafx.beans.property.SimpleDoubleProperty;
import javafx.beans.property.SimpleStringProperty;

/**
 *
 * @author walmir.silva
 */
public class ItensProperty {
    
    private SimpleStringProperty produto;
    private SimpleDoubleProperty preco;
    
    public ItensProperty(String produto, double preco) {
        this.produto = new SimpleStringProperty(produto);
        this.preco = new SimpleDoubleProperty(preco);
    }

    public String getProduto() {
        return produto.get();
    }

    public void setProduto(String produto) {
        this.produto.set(produto);
    }

    public double getPreco() {
        return preco.get();
    }

    public void setPreco(double preco) {
        this.preco.set(preco);
    }
}
