package br.com.javase8programmeri.datatype;
/**
 * N�o compila porque a declara��o do array deveria ser boolean[]. Se houvesse essa declara��o, ao tentar
 * acessar a chave 3 do array, retornaria FALSE
 * 
 * @author Walmir Silva
 */
public class Test3 {

	public static void main(String[] args) {
		boolean array = new boolean[300];
		System.out.println(array[3]);
	}
}
