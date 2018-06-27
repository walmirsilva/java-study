package br.com.javase8programmeri.string;

public class B {
	String msg;
	
	void imprime() {
		if (!msg.isEmpty()) // Gera um erro NullPointerException
			System.out.println(msg);
		else 
			System.out.println("empty");
	}
}