/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.explorandoapisbibliotecasjava.livraria;

import br.com.explorandoapisbibliotecasjava.livraria.produtos.Livro;
import br.com.explorandoapisbibliotecasjava.livraria.produtos.LivroFisico;
import br.com.explorandoapisbibliotecasjava.livraria.produtos.Produto;
import java.io.IOException;
import java.io.PrintStream;
import java.util.Arrays;
import java.util.List;

/**
 *
 * @author walmir.silva
 */
public class Exportador {
    
//    public static void main(String[] args) throws IOException {
//        Livro livro = new LivroFisico(new Autor());
//        livro.setNome("java 8 Prático");
//        livro.setDescricao("Novos recursos da linguagem");
//        livro.setValor(59.90);
//        livro.setIsbn("578-85-66250-46-6");
//        
//        Livro maisUmLivro = new LivroFisico(new Autor());
//        maisUmLivro.setNome("Desbravando a O.O");
//        maisUmLivro.setDescricao("Livro de Java e O.O");
//        maisUmLivro.setValor(59.90);
//        maisUmLivro.setIsbn("321-54-67890-11-2");
//        
//        new Exportador().paraCSV(Arrays.asList(livro, maisUmLivro));
//    }

    public void paraCSV(List<Produto> produtos) throws IOException {
        PrintStream ps = new PrintStream("produtos.csv");
        ps.println("Nome, Descricao, Valor, ISBN");
        
        produtos.forEach((produto) -> {
            ps.println(String.format("%s, %s, %s, %s",
                    produto.getNome(),
                    produto.getDescricao(),
                    produto.getValor(),
                    produto.getIsbn()
            ));
        });
        ps.close();
    }
}
