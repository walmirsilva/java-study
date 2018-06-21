package br.com.desbravandojavaoo.livraria.testes;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import br.com.desbravandojavaoo.livraria.Autor;
import br.com.desbravandojavaoo.livraria.produtos.LivroFisico;
import br.com.desbravandojavaoo.livraria.produtos.Produto;
import br.com.desbravandojavaoo.livraria.produtos.Ebook;

public class OrdenandoComJava {

	public static void main(String[] args) {
		Autor autor = new Autor();
		autor.setNome("Walmir Silva");
		
		LivroFisico fisico = new LivroFisico(autor);
		fisico.setNome("Java 8 prático");
		fisico.setValor(59.90);
		
		Ebook ebook = new Ebook(autor);
		ebook.setNome("Java 8 Prático");
		ebook.setValor(29.90);
		
		List<Produto> produtos = Arrays.asList(fisico, ebook);
		
		Collections.sort(produtos);
		
		for (Produto produto : produtos)
			System.out.println(produto.getValor());
		
	}

}
