package br.com.javase8programmeri.classstructure;

/**
 * Essa classe compila, mas como o contrutor est� como void, n�o imprime na tela
 * 
 * @author Walmir Silva
 *
 */
class Test {
	int Test = 305;
	
	void Test() {
		System.out.println(Test);
	}
	
	public static void main(String[] args) {
		new Test();
	}

}
