package br.com.javase8programmeri.arrays;
/**
 * Classe compila mas gerar uma exception. ArrayIndexOutOfBoundsException
 * 
 * @author Walmir Silva
 */
public class Test {

	public static void main(String[] args) {
		int x[] = new int[3];
		
		for(int i=x.length; i>=0; i--) x[i] = i*2;
		System.out.println("end!");

	}

}
