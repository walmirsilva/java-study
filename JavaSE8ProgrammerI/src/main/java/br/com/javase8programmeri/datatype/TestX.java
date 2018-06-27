package br.com.javase8programmeri.datatype;
/**
 * Essa classe compila normalente porque dentro do For estamos apanes utilizando a variável x e subscrevendo sua referencai de memória
 * a cada new X()
 * 
 * @author Walmir Silva
 */
public class TestX {

	public static void main(String[] args) {
		X x = new X();
		for (int i = 0; i < 10; i++)
			x = new X();
		
		System.out.println("End!");

	}

}
