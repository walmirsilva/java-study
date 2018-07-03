package br.com.javase8programmeri.thissuper;

public class C extends B {
	C() {
		super();
		z(x());
	}
	
	void z(int i) {
		System.out.println(i);
	}
	
	int y() {
		return 20;
	}

}
