package br.com.javase8programmeri.scope;
/**
 * Esta classe Compila e roda, imprimindo de 0 até 19 e depois 15.
 * 
 * @author Walmir Silva
 *
 */
public class Test3 {

	public static void main(String[] args) {
		for (int i = 0; i < 20; i++) {
			System.out.println(i);
		}
		int i = 15;
		System.out.println(i);

	}

}
