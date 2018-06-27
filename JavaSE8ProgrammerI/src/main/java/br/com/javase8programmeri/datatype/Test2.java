package br.com.javase8programmeri.datatype;
/**
 * Compila porque na condição do ELSE, há um return que encerrará a execução e não precisará acionar o 
 * sysout da variável age
 * 
 * @author Walmir Silva
 *
 */
public class Test2 {

	public static void main(String[] args) {
		int age;
		
		if (args.length > 0 ) {
			age = Integer.parseInt(args[0]);
		} else {
			System.out.println("???");
			return;
		}
		
		System.out.println(age);

	}

}
