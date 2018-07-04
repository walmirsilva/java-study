package br.com.javase8programmeri.exceptions;

public class Test {

	public static void main(String[] args) {
		try {
			method();
		} catch (RuntimeException e) {
			System.out.println("Exception caught");
		}
		System.out.println("finish main");
	}
	
	public static void method() {
		int[] i = new int[10];
		System.out.println(i[15]);
		System.out.println("after i[15]");
	}

}
