package br.com.javase8programmeri.datatype;
/**
 * Compila porque na condi��o do ELSE, h� um return que encerrar� a execu��o e n�o precisar� acionar o 
 * sysout da vari�vel age
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
