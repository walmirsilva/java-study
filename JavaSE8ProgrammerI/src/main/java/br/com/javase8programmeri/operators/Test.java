package br.com.javase8programmeri.operators;

public class Test {

	public static void main(String[] args) {
		int i1    = 3/2;   // 1
		double i2 = 3/2;   // 1.0
		double i3 = 3/2.0; // 1.5
		
		long x = 0;
		double d = 0;
		double zero = x + d;
		
		System.out.println(i1 + i2 + i3 + x + d + zero); // 3.5
		
	}

}
