package br.com.javase8programmeri.inheritance.test2;

public class D extends C {
	void x() {
		System.out.println(1);
	}
	
	void y(C b) {
		x();
	}
}
