package br.com.javase8programmeri.operators;

public class Increment {

	public static void main(String[] args) {
		int i = 10;
		
		System.out.println(i++); //Exibe 10 porque �  P�s incremento
		System.out.println(i); // Ap�s o p�so incremento, exibe 11
		
		System.out.println();
		
		int j = 10;
		System.out.println(++j); // J� exibe de cara 11, porque � pr�-incremento
		System.out.println(j); // 11
		
		System.out.println();
		
		int a = 10;
		a += ++a;
		System.out.println(a); //21 = 10 + 11 (incrementou primeiro)
		
		System.out.println();
		
		int b = 10;
		b += ++b + b + ++b;
		System.out.println(b); //44 = 10 + 11 + 11 + 12 
		
		int x = 10;
		int y = (x++ * x + x++);
		System.out.println(y); //121 = 10 (ainda n�o incrementou) * 11 (j� incrementado) + 11 (aqui ainda n�o incrementou x++)
		
	}

}
