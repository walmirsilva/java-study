package br.com.javase8programmeri.varargs;

public class B {
	void x() {
		System.out.println("empty");
	}
	
	void x(String ... args) {
		System.out.println(args.length);
	}
	
	void x(int ... args) {
		System.out.println(args.length);
	}
	
	void x(Object ... args) {
		System.out.println(args.length);
	}
}


