package br.com.desbravandojavaoo.livraria;

import java.util.ArrayList;
import java.util.List;

import br.com.desbravandojavaoo.livraria.produtos.Produto;

public class CarrinhoDeCompras {
	
	private double total = 0;
	private ArrayList<Produto> produtos;
	
	public CarrinhoDeCompras() {
		this.produtos = new ArrayList<Produto>();
	}
	
	public void adiciona(Produto produto) {
		System.out.println("Adicionando: " + produto);
		this.produtos.add(produto);
	}
	
	public void remove(int posicao) {
		this.produtos.remove(posicao);
	}
	
	public double getTotal() {
		return total;
	}
	
	public List<Produto> getProdutos() {
		return produtos;
	}

}
