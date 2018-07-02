package br.com.javase8programmeri.inheritance.test2;

public class B {
	void x() {
		System.out.println(3);
	}
	
	void y(B b) {
		b.x();
	}
	
//	void y(C c) {
//		c.x();
//	}
//	
//	void y(D d) {
//		d.x();
//	}

}
