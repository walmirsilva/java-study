package br.com.javase8programmeri.wrappers;

public class A {
	
	static long i;
	
	public static void main(String[] args) {
		i = Integer.valueOf("10", 8);
		m1(i); // Não compila

	}
	
	private static void m1(Integer i) {
		System.out.println(i);
	}

}
