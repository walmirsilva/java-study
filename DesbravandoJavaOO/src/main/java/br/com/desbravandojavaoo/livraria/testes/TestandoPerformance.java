package br.com.desbravandojavaoo.livraria.testes;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class TestandoPerformance {

	public static void main(String[] args) {
		
		comparandoDesempenhoList();
		comparandoDesempenhoSet();

	}
	
	private static void comparandoDesempenhoList() {
		List<String> colecao = new ArrayList<String>();
		
		for (int i = 0; i < 100000; i++)
			colecao.add("Item" + i);
		
		long inicio = System.currentTimeMillis();
		
		for (int i = 0; i < 100000; i++)
			colecao.contains("Item" + i);
		
		long fim = System.currentTimeMillis();
		long tempo = fim - inicio;
		
		System.out.println("Utilizando List demorou " + tempo +" MS para executar") ;
	}
	
	
	private static void comparandoDesempenhoSet() {
		Set<String> colecao = new HashSet<String>();
		
		for (int i = 0; i < 100000; i++)
			colecao.add("Item" + i);
		
		long inicio = System.currentTimeMillis();
		
		for (int i = 0; i < 100000; i++)
			colecao.contains("Item" + i);
		
		long fim = System.currentTimeMillis();
		long tempo = fim - inicio;
		
		System.out.println("Utilizando Set demorou " + tempo +" MS para executar") ;
	}

}
