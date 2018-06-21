package br.com.desbravandojavaoo.livraria.testes;

import br.com.desbravandojavaoo.livraria.Autor;
import br.com.desbravandojavaoo.livraria.produtos.Livro;
import br.com.desbravandojavaoo.livraria.produtos.LivroFisico;

public class CadastroDeLivros {

	public static void main(String[] args) {
		Autor autor = new Autor();
		autor.setNome("Walmir Silva");
		autor.setEmail("walmir@gmail.com");
		autor.setCpf("123.456.789-10");
		
		Livro livro = new LivroFisico(autor);
		livro.setNome("Java 8 prático");
		livro.setDescricao("Novos recursos da linguagem");
		livro.setValor(59.90);
		livro.setIsbn("978-85-66250-46-6");
		
		livro.mostrarDetalhes();

	}

}
