package br.com.javase8programmeri.objects;

public class C {

	public static void main(String[] args) {
		new C().x();

	}
	
	static void x() {
		new B().y();
	}

}
