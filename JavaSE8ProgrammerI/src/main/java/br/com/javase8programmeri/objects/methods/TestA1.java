package br.com.javase8programmeri.objects.methods;

/**
 * @author Walmir Silva
 */
public class TestA1 {
	
	int a(D d) { return 1; }
	int a(C d) { return 2; }
	int a(B d) { return 3; }
	int a(A d) { return 4; }
	
	public static void main(String[] args) {
		System.out.println(a(new D())); // Metodo a(D d) N�o � statico

	}

}
