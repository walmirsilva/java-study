package br.com.javase8programmeri.operators;

public class Condition {

	public static void main(String[] args) {
		int valor = 201;
		// C�digo sem identa��o
		if (valor > 200)
		if (valor < 400)
		if (valor > 300)
			System.out.println("a");
		else
			System.out.println("b");
		else
			System.out.println("c");
		
		// c�dico identado
		if (valor > 200)
			if (valor < 400)
				if (valor > 300)
					System.out.println("a");
				else
					System.out.println("b");
			else
				System.out.println("c");

		
		
	}

}
