/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.golfx.loja;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 *
 * @author walmir.silva
 */
public class Carrinho {
    
    private static List<Produto> produtos;
    
    public Carrinho() {
        produtos = new ArrayList<Produto>();
    }
    
    public void addProdutos(Produto ... ps) {
        for (Produto p : ps)
            produtos.add(p);
    }
    
    public List<Produto> getProdutos() {
        return produtos;
    }
    
    public void removeProduto(Produto p) {
        Iterator<Produto> itProduto = produtos.iterator();
        while (itProduto.hasNext()) {
            Produto produto = itProduto.next();
            if (produto.getProduto().equals(p.getProduto()) &&
                produto.getPreco() == p.getPreco()) {
                itProduto.remove();
            }
        }
    }
    
}
