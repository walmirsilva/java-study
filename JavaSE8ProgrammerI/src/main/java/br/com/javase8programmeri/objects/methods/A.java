package br.com.javase8programmeri.objects.methods;

public class A {

	public static void main(String[] args) {
		int x = b(15);
		System.out.println(x);
		System.out.println(15);
		System.out.println(15.0);

	}

	static int b(int i) { return i; }
	static double b(int i) { return i; } // Não compila porque causa do memos parâmetro
	static double b(double i) { return i; } // Desta forma funciona
}
