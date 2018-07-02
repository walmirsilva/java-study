package br.com.javase8programmeri.inheritance;

public class Y extends X {
	// Se esa propriedade tivesse sido declarada, compilava normalmente
	//private String s;
	
	Y(String s) {
		this.s = s; // Não compila
	}
	public static void main(String[] args) {
		Y y = Y.X("t");
		System.out.println(y.s);

	}

}
