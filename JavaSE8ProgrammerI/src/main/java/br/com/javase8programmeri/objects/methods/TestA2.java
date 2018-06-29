package br.com.javase8programmeri.objects.methods;

/**
 * @author Walmir Silva
 */
public class TestA2 {
	
	int a(D d) { return 1; }
	static int a(C d) { return 2; }
	static int a(B d) { return 3; }
	static int a(A d) { return 4; }
	
	public static void main(String[] args) {
		System.out.println(a(new D())); // Metodo a(D d) Não é statico

	}

}
