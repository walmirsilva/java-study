package br.com.javase8programmeri.datatype;
/**
 * N�o compila porque a declara��o a vari�vel age n�o foi inicializada, nem setada na segunda condi��o do ELSE.
 * 
 * @author Walmir Silva
 *
 */
public class Test {

	public static void main(String[] args) {
		int age;
		
		if (args.length > 0 ) {
			age = Integer.parseInt(args[0]);
		} else {
			System.out.println("???");
		}
		
		System.out.println(age);

	}

}
