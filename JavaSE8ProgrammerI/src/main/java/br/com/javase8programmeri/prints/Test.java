package br.com.javase8programmeri.prints;

public class Test {

	public static void main(String[] args) {
		
		System.out.printf(">%0,8.2f<",12.45);
		System.out.println();
		System.out.printf(">%-(8.2f<",12.45);
		System.out.println();
		System.out.format(">%0(8.2f<",12.45);
		System.out.format(">%01$08.2f<",12.45);
		System.out.printf(">%0,(8.2f<",12.45);

	}

}
