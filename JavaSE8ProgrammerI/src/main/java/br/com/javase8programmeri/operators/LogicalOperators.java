package br.com.javase8programmeri.operators;

public class LogicalOperators {

	public static void main(String[] args) {
		System.out.println(1 == 1 & 1 > 2); // false
		System.out.println(1 == 1 | 2 > 1); // True
		System.out.println(1 == 1 ^ 2 > 1); // false
		System.out.println(!(1 == 1)); // false
		
	}

}
