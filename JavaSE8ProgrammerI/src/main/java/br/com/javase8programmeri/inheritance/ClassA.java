package br.com.javase8programmeri.inheritance;


/**
 * Não compila por causa da declaração de exception da ClassC
 * Desta forma Compilaria e executaria
 * 
 * public static void main(String ...strings ) throws IOException {
 * 
 * }
 * 
 * @author Walmir Silva
 */
public class ClassA {
	
	public static void main(String ... args ) {
		new ClassC().x();
	}

}
