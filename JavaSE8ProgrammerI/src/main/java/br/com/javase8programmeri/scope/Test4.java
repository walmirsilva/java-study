package br.com.javase8programmeri.scope;
/**
 * O c�digo n�o compila por causa do conflito entre a vari�vel est�tica e a vari�vel de par�metro
 * 
 * @author Walmir Silva
 */
public class Test4 {
	
	static int x = 15;
	
	public static void main(String[] x) {
		x = 200;
		System.out.println(x);
	}

}
