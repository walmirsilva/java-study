package br.com.javase8programmeri.datatype;
/**
 * Não compila porque a declaração a variável age não foi inicializada, nem setada na segunda condição do ELSE.
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
