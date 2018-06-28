package br.com.javase8programmeri.switchcase;

public class Test3 {

	public static void main(String[] args) {
		
		switch(10) {
			case < 10: // Gera erro de compilação
				System.out.println("<");
			default:
				System.out.println("=");
			case > 10: // Gera erro de compilação
				System.out.println(">");
			
		}

	}

}
