package br.com.javase8programmeri.objects.constructors;
/**
 * Compila mas gerar um NullPointerException na vari�vel n que n�o foi inicializada no construtor da
 * classe B
 * @author walmir.silva
 *
 */
public class B extends A {

	void a() {
		System.out.println(n.length());
	}
	
	public static void main(String[] args) {
		new B();

	}

}
