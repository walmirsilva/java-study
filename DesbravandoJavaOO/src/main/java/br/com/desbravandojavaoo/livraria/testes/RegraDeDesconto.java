package br.com.desbravandojavaoo.livraria.testes;

import br.com.desbravandojavaoo.livraria.Autor;
import br.com.desbravandojavaoo.livraria.produtos.MiniLivro;

public class RegraDeDesconto {

	public static void main(String[] args) {
		
		Autor autor = new Autor();
		autor.setNome("Walmir Silva");
		
		MiniLivro livro = new MiniLivro(autor);
		livro.setValor(39.90);
		
		if (!livro.aplicaDescontoDe(0.3))
			System.out.println("Desconto no Ebook não pode ser maior do que 15%");
		else 
			System.out.println("Valor com desconto do ebook: " + livro.getValor());

	}

}
