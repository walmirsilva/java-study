package br.com.javase8programmeri.scope;
/**
 * O código não compila por causa do conflito entre a variável estática e a variável de parâmetro
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
