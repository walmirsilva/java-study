package br.com.javase8programmeri.arrays;
/**
 * Classe compila, imprime alguns n�meros e depois gera uma exception  ArrayIndexOutOfBoundsException
 * 
 * @author Walmir Silva
 */
public class C {

	public static void main(String[] args) {
		
		int x[] = new int[3];
		
		for (x[1] = x.length - 1; x[0] ==0; x[1]--) {
			x[x[1]] = -5;
			System.out.println(x[1]);
		}

	}

}
