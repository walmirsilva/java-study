package br.com.javase8programmeri.loops;
/**
 * N�o compila, � como se o segundo if estivesse fora do segundo la�o for
 * 
 * @author Walmir Silva
 */
public class Labels {

	public static void main(String[] args) {
		outside: for(int a=0; a< 30; a++)
		for(int b=0; b<1;b++)
		if(a+b == 25) continue outside;
		else if (a+b == 20) break outside;
		if(a==0) break outside;
		else System.out.println(a);
	}

}
