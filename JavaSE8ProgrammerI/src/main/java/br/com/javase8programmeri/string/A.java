package br.com.javase8programmeri.string;

public class A {
	static String empty;
	
	public static void main(String[] args) {
		
		String full = "Welcome " + empty;
		System.out.println(full); // Welcome null
		
		String s = null;
		String s2 = new String(s); // Compila mas ao executar, ele d� um erro
		String s3 = new String(null); // N�o compila
		System.out.println(s2);
		
		String ss = "estudando para a certifica��o";
		System.out.println(ss.substring(3,6));

	}

}
