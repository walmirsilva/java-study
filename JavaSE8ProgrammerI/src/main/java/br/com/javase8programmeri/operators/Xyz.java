package br.com.javase8programmeri.operators;
/**
 * Essa classe n�o compila porque a variavel y n�o foi inicializada
 * 
 * @author Walmir Silva
 */
public class Xyz {

	public static void main(String[] args) {
		int y;
		for (int x = 0; x < 10; x++) {
			y = x % 5 + 2;
		}

		System.out.println(y);
	}

}
