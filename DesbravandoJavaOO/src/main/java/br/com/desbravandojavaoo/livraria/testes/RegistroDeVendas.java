package br.com.desbravandojavaoo.livraria.testes;

import java.util.List;

import br.com.desbravandojavaoo.livraria.Autor;
import br.com.desbravandojavaoo.livraria.CarrinhoDeCompras;
import br.com.desbravandojavaoo.livraria.produtos.Ebook;
import br.com.desbravandojavaoo.livraria.produtos.LivroFisico;
import br.com.desbravandojavaoo.livraria.produtos.Produto;

public class RegistroDeVendas {

	public static void main(String[] args) {
		
		Autor autor = new Autor();
		autor.setNome("Walmir Silva");
		
		LivroFisico fisico = new LivroFisico(autor);
		fisico.setNome("Test Driven Development");
		fisico.setValor(59.90);
		
		if (fisico.aplicaDescontoDe10Porcento())
			System.out.println("Valor agora é: " + fisico.getValor());
		
		Ebook ebook = new Ebook(autor);
		ebook.setNome("Test Driven Development");
		ebook.setValor(29.90);
		
		CarrinhoDeCompras carrinho = new CarrinhoDeCompras();
		carrinho.adiciona(fisico);
		carrinho.adiciona(ebook);
		
		List<Produto> produtos = carrinho.getProdutos();
		
		for (Produto produto : produtos) {
			System.out.println(produto.getValor());
		}
		
		System.out.println("Total: " + carrinho.getTotal());

	}

}
