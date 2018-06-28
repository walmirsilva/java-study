package br.com.javase8programmeri.arrays;

public class A {

	public static void main(String[] args) {
		int x[] = new int[30];
		/**
		 * Não compila porque se for pre-definido os valores dos arrays, 
		 * não precisa definir a quantidade dos indices
		 */
		int y[] = new int[3] {0, 3, 5};
		
		int z[] = new int[] {0, 3, 5}; // Desta forma é o correto

	}

}
