package br.com.javase8programmeri.switchcase;

public class Test {

	public static void main(String[] args) {
		int t = args.length;
		
		switch(t) {
			case 1:
				System.out.println("1");
			case 2:
				System.out.println("2");
			default:
				System.out.println("+++"); // Exibe esta linha
		}

	}

}
