package br.com.javase8programmeri.objects.methodstatic;

public class A extends B {

	public static void main(String[] args) {
		this.x(); // N�o compila
		x(); // Compila
		A.y();

	}

}
