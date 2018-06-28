package br.com.javase8programmeri.operators;
/**
 * Classe não compila por falta de delimitação de escopo
 * 
 * @author Walmir Silva
 */
public class A {

	public static void main(String[] args) {
		String name = args[0];
		if ( name.equals("guilherme"))
			System.out.println(name);
			System.out.println("good");
		else
			System.out.println("better");
			System.out.println(name);
				
	}

}
