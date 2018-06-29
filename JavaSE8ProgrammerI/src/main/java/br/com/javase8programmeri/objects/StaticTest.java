package br.com.javase8programmeri.objects;
/**
 * Não compila porque o metodo precisa definir o tipo de retorno
 * @author walmir.silva
 *
 */
public class StaticTest {

	public static void main(String[] args) {
		x();
	}
	
	static x() {
		System.out.println("x");
		y();
	}
	
	static y() {
		System.out.println("y");
	}

}
