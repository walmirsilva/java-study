package br.com.javase8programmeri.visibility;

import br.com.javase8programmeri.visibility.model.Client;

public class Test {

	public static void main(String[] args) {
		new Client("Walmir").print(); // N�o compila por causa do Construtor Default

	}

}
