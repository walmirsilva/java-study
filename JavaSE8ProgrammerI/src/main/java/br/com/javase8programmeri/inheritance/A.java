package br.com.javase8programmeri.inheritance;
/**
 * Não compila! inconcistencia na hierarquia das classes
 * @author walmir.silva
 *
 */
public class A extends B {
	int m(String c) {
		return 3;
	}
	
	public static void main(String ...strings) {
		System.out.println(new C().m(3));
	}

}
