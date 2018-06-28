package br.com.javase8programmeri.switchcase;

public class Test4 {

	public static void main(String[] args) {
		switch(10) {
			case 10:
				System.out.println("a");
				break;
				System.out.println("b"); // Não compila
			default:
				System.out.println("c");
			case 11:
				System.out.println("d");
		}

	}

}
