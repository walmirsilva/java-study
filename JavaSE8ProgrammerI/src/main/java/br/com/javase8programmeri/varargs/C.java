package br.com.javase8programmeri.varargs;

public class C {

	void x(String ... args) {
		System.out.println(args.length);
	}
	
	void x() {
		System.out.println("empty");
	}

}
