package br.com.javase8programmeri.objects.methods;

/**
 * @author Walmir Silva
 */
public class TestA4 {	
	static int a(D d, B b) { return 1; }
	static int a(C d, C c) { return 2; }
	static int a(B d, B b) { return 3; }
	static int a(A d, A a) { return 4; }
	
	public static void main(String[] args) {
		System.out.println(a(new D(), new D())); // compila normalmente retorna 1
		System.out.println(a(new D(), new B())); // compila normalmente retorna 1
		System.out.println(a(new B(), new D())); // compila normalmente retorna 3

	}

}
