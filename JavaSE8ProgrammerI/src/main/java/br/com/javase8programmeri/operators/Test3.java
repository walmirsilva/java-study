package br.com.javase8programmeri.operators;

public class Test3 {

	public static void main(String[] args) {
		int i;
		for (i = 0; i < 5; i++) {
			if (i++ % 3 == 0)
				break;
		}
		System.out.println(i);
	
		char c = 65;
		char c2 = 68 - 65;
		System.out.println(c + c2);
		
	}

}
