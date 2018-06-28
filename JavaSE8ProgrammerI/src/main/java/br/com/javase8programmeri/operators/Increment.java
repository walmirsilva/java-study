package br.com.javase8programmeri.operators;

public class Increment {

	public static void main(String[] args) {
		int i = 10;
		
		System.out.println(i++); //Exibe 10 porque é  Pós incremento
		System.out.println(i); // Após o p´so incremento, exibe 11
		
		System.out.println();
		
		int j = 10;
		System.out.println(++j); // Já exibe de cara 11, porque é pré-incremento
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
		System.out.println(y); //121 = 10 (ainda não incrementou) * 11 (já incrementado) + 11 (aqui ainda não incrementou x++)
		
	}

}
