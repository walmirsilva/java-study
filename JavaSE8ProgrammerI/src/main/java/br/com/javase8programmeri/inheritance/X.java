package br.com.javase8programmeri.inheritance;

public class X {
	private String s;
	
	protected X() {}
	
	static Y X(String s) {
		return new Y(s);
	}

}
