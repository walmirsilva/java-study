package br.com.javase8programmeri.encapsulation;

public class Test {
	
	public static void main(String ... args) {
		int i = 150;
		i = ++s(i); // pegadinha, n�o podemos pre-incrementar m�todos
		System.out.println(i);
	}
	
	static int s(int i) {
		return ++i;
	}

}
