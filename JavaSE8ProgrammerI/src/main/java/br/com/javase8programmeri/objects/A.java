package br.com.javase8programmeri.objects;
/**
 * Não compila porque o retorn é int e 
 * na parte do coduigo tem return  early return ( retorno antecipado )
 * 
 * @author Walmir Silva
 */
public class A {

	public static void main(String[] args) {
		x(5);
	}
	
	static int x(final int l) {
		for(int i=0; i< 100; i++) {
			switch(i) {
				case 1:
					System.out.println(l);
					if (l==i) return 3;
				case 0:
					System.out.println(0);
			}
		}
		System.out.println("end");
		return -1;
	}

}
