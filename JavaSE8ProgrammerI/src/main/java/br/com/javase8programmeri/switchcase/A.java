package br.com.javase8programmeri.switchcase;

public class A {

	public static void main(String[] args) {
		int t2 = 1;
		int t = args.length;
		
		switch(t) {
			case t2: // Não compila porque essa variável não é final
				System.out.println("1");
				break;
			default:
				System.out.println("arg???");
		}

	}

}
