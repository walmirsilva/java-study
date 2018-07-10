package br.com.explorandoapisbibliotecasjava.livraria.produtos;

public interface Produto extends Comparable<Produto> {

	double getValor();

	String getNome();

	String getDescricao();
	
	String getIsbn();
}
