package br.com.javase8programmeri.datatype;
/**
 * Classe n�o compila porque a atribui��o � inv�lida. A vari�vel argis esperava receber um boolean
 * 
 * @author Walmir Silva
 *
 */
public class Test4 {

	public static void main(String[] args) {
		boolean argis;
		
		if (args.length > 0)
			argis = 1;
		else 
			argis = 0;
		
		System.out.println(argis);

	}

}
