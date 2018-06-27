package br.com.javase8programmeri.string;

public class TestB {

	public static void main(String[] args) {
		
//		B b = new B();
//		b.imprime();

		String s = "Caelum";
		s.concat(" - Ensino e Inovação");
		System.out.println(s);
		
		StringBuffer str = new StringBuffer("Caelum");
		str.append(" - Ensino e Inovação");
		System.out.println(str);
		
	}

}
