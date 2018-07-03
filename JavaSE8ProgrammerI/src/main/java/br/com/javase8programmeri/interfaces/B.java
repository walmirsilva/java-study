package br.com.javase8programmeri.interfaces;

abstract class B {
	void x() {
		System.out.println(y());
	}
	
	Object y() {
		return "a";
	}
}
