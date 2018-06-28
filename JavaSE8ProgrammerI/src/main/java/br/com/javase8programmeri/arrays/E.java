package br.com.javase8programmeri.arrays;

public class E {

	public static void main(String[] args) {
		String[] valores = new String[2];
		valores[0] = "Certification";
		valores[1] = "Java";
		
		Object[] vals = (Object[]) valores;
		vals[1] = "Daniela";
		
		System.out.println(vals[1]);
		System.out.println(valores[1]);
		
		System.out.println(vals[1].equals(valores[1]));
	}
}
