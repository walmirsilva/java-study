package br.com.javase8programmeri.scope;
/**
 * Esta classe gera um erro de compilação por que está tentando exibir uma variável fora do escopo
 * 
 * @author Walmir Silva
 */
public class Test1 {

	public static void main(String[] args) {
		for (int i=0; i < 20; i++) {
			System.out.println(i);
		}
		
		System.out.println(i);

	}

}
