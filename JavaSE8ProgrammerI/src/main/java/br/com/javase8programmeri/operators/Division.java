package br.com.javase8programmeri.operators;

public class Division {

	public static void main(String[] args) {
		System.out.println(3 / 0.0); // Retona infinity
		System.out.println(3.0 / 0); // Retornar infinity
		System.out.println(-3.0 / 0); // Retoanr -infinity (negativo)
		System.out.println(3 / 0); // Compila e gerar o erro ArithmeticException (divisão por zero)

	}

}
