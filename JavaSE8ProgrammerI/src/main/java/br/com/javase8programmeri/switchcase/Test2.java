package br.com.javase8programmeri.switchcase;

public class Test2 {

	public static void main(String[] args) {
		
		switch("Guilherme") {
			case "Guilherme":
				System.out.println("Guilherme"); // Compila e exibe Guilherme
				break;
			case "42":
				System.out.println("42");
			default:
				System.out.println("Mario");
		}

	}

}
