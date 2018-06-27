package br.com.javase8programmeri.varargs;

public class A {

	public static void main(String[] args) {
		new B().x();
		new C().x();
		
		new B().x(new int[] {23789, 673482});
		
		new B().x(new Object[] {23789, 673482});

	}

}
