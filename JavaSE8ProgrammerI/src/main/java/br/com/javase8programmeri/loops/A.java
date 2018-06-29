package br.com.javase8programmeri.loops;

public class A {

	public static void main(String[] args) {
		int a = 10;
		while(a < 100) a++;
		System.out.println(a); // 100
		
		
		for(int i=0; i<2; i++, System.out.println(i))
			System.out.println(i);
		
		System.out.println();
		
		int i = 0;
		do System.out.println(i); while(i++ < 10);
		
		do; while(i++<10);

	}

}
