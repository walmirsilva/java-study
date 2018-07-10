/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.explorandoapisbibliotecasjava.livraria.repositorio;

import br.com.explorandoapisbibliotecasjava.livraria.Autor;
import br.com.explorandoapisbibliotecasjava.livraria.produtos.Livro;
import br.com.explorandoapisbibliotecasjava.livraria.produtos.LivroFisico;
import br.com.explorandoapisbibliotecasjava.livraria.produtos.Produto;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

/**
 *
 * @author walmir.silva
 */
public class RepositorioDeProdutos {
    
    public ObservableList<Produto> lista() {
        
        Autor autor = new Autor();
        autor.setNome("Walmir Silva");
        autor.setEmail("walmir.design@gmail.com");
        autor.setCpf("123.456.789.10");
        
        Livro livro = new LivroFisico(autor);
        livro.setNome("java 8 Prático");
        livro.setDescricao("Novos recursos da linguagem");
        livro.setValor(59.90);
        livro.setIsbn("978-85-66250-46-6");
        
        Livro maisUmlivro = new LivroFisico(autor);
        maisUmlivro.setNome("Desbravando a O.O");
        maisUmlivro.setDescricao("Livro de Java O.O");
        maisUmlivro.setValor(59.90);
        maisUmlivro.setIsbn("321-54-67890-11-2");
        
        
        Autor outroAutor = new Autor();
        outroAutor.setNome("Walmir Silva");
        outroAutor.setEmail("walmir.design@gmail.com");
        outroAutor.setCpf("123.456.789.10");
        
        Livro outrolivro = new LivroFisico(outroAutor);
        outrolivro.setNome("Lógica de Programação");
        outrolivro.setDescricao("Crie seus primeiros programas");
        outrolivro.setValor(59.90);
        outrolivro.setIsbn("978-85-66250-22-0");
        
        return FXCollections.observableArrayList(livro, maisUmlivro, outrolivro);
    }
    
}
