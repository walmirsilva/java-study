package br.com.javase8programmeri.datatype;
/**
 * Não compila porque a declaração do array deveria ser boolean[]. Se houvesse essa declaração, ao tentar
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
