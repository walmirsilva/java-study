package br.com.desbravandojavaoo.livraria.testes;

import br.com.desbravandojavaoo.livraria.Autor;

public class ComparandoReferencias {

	public static void main(String[] args) {
		
		Autor autor = new Autor();
		autor.setNome("Walmir Silva");
		autor.setEmail("walmir@gmail.com");
		autor.setCpf("123.456.789-10");
		
		Autor outroAutor = new Autor();
		outroAutor.setNome("Walmir Silva");
		outroAutor.setEmail("walmir@gmail.com");
		outroAutor.setCpf("123.456.789-10");
		
		if ( autor == outroAutor)
			System.out.println("Iguais, mesmo autor!");
		else 
			System.out.println("Diferente");

	}

}
