package br.com.desbravandojavaoo.livraria.produtos;

import br.com.desbravandojavaoo.livraria.Autor;

public class MiniLivro extends Livro {
	
	public MiniLivro(Autor autor) {
		super(autor);
	}

	@Override
	public boolean aplicaDescontoDe(double porcentagem) {
		return false;
	}

}
