package br.com.desbravandojavaoo.livraria.testes;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

import br.com.desbravandojavaoo.livraria.Autor;
import br.com.desbravandojavaoo.livraria.produtos.Livro;
import br.com.desbravandojavaoo.livraria.produtos.LivroFisico;

public class NovidadesDoJava8 {

	public static void main(String[] args) {
		
		Autor autor = new Autor();
		autor.setNome("Walmir Silva");
		
		Livro javaoo = new LivroFisico(autor);
		javaoo.setNome("Java O.O");
		
		Livro java8 = new LivroFisico(autor);
		java8.setNome("Java 8 Prático");
		
		Livro ruby = new LivroFisico(autor);
		ruby.setNome("Livro de Ruby");
		
		List<Livro> livros = Arrays.asList(javaoo, java8, ruby);
		
//		Collections.sort(livros, new ComparadorPorNome());
//		
//		for (Livro livro : livros)
//			System.out.println(livro.getNome());
		
//		Collections.sort(livros, new Comparator<Livro>() {
//			public int compare(Livro l1, Livro l2) {
//				return l1.getNome().compareTo(l2.getNome());
//			}
//		});
		
//		livros.sort(new Comparator<Livro>() {
//			@Override
//			public int compare(Livro l1, Livro l2) {
//				return l1.getNome().compareTo(l2.getNome());
//			}
//		});
		
		livros.sort((Livro l1, Livro l2) -> {
			return l1.getNome().compareTo(l2.getNome());
		});
		
//		for (Livro livro : livros) 
//			System.out.println(livro.getNome());
		
//		livros.forEach(l -> System.out.println(l.getNome()));
		
//		List<Livro> filtrados = new ArrayList<>();
//		
//		for (Livro livro: livros) {
//			if (livro.getNome().contains("Java")) 
//				filtrados.add(livro);
//		}
//		

//		for (Livro livro : livros)
//			System.out.println(livro.getNome());		
		
		Stream<Livro> stream = livros.stream();
		stream
			.filter(l -> l.getNome().contains("Java"))
			.forEach(l -> System.out.println(l.getNome()));

	}

}
