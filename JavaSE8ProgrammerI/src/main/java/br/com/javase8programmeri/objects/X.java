package br.com.javase8programmeri.objects;
/**
 * N�o compila porque o long � maior que int
 * 
 * @author Walmir Silva
 */
public class X {

	public static void main(String[] args) {
		System.out.println(a(args.length));

	}
	
	static int a(int l) {
		if (l <10 ) return b(l);
		else return c();
	}
	
	static int b(int l) {
		if (l <10 ) return b(l);
		else return c();		
	}
	
	static long c() {
		return 3;
	}

}
