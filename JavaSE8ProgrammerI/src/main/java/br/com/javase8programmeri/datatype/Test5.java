package br.com.javase8programmeri.datatype;
/**
 * Não compila porque para esse tipo de atribuição octal, teria que ser entre 0 e 7 os numeros que agrupam para gerar o octal
 * 
 * @author Walmir Silva
 */
public class Test5 {
	public static void main(String[] args) {
		int n = 09;
		int m = 031;
		int x = 1_000;
		System.out.println(x - n + m);
		
	}

}
