package br.com.javase8programmeri.wrappers;

public class Test {

	public static void main(String[] args) {
		int a = Integer.parseInt("10",2);
		int b = a == 10 ? null : 3;
		System.out.println(a + b);

	}

}
