package br.com.javase8programmeri.datatype;
/**
 * A classe quando copiada desta forma, aponta a sua referencia de momoria para todas as que copiarem ela. 
 * Logo no final o resultado será 48
 * 
 * @author Walmir Silva
 */
public class TestB {

	public static void main(String[] args) {	
		
		TestA x = new TestA();
		TestA y = x;
		y.v++;
		x.v++;
		
		TestA z = y;
		z.v--;
		
		System.out.println(x.v + y.v + z.v);

	}

}
