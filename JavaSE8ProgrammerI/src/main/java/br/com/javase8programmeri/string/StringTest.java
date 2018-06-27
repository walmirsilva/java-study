package br.com.javase8programmeri.string;

public class StringTest {

	public static void main(String[] args) {
		
		String text = "Pretendo fazer a prova de certificação em Java";
		
		System.out.println(text.indexOf("Pretendo")); // 0
		System.out.println(text.indexOf("pretendo")); // -1
		System.out.println(text.indexOf("tendo")); // 3 => P=0, r=1, e=2, t=3
		
		System.out.println();
		
		System.out.println(text.indexOf("a")); // 10 => o spaco também conta
		System.out.println(text.lastIndexOf("a")); // 45
		
		System.out.println();
		
		System.out.println(text.startsWith("Pretendo")); // true
		System.out.println(text.startsWith("pretendo")); // false
		System.out.println(text.startsWith("Pretend")); // true
		System.out.println(text.startsWith("Pretenda")); // false
		
		System.out.println();
		
		System.out.println(text.endsWith("Java")); // true
		System.out.println(text.endsWith("java")); // false
		System.out.println(text.endsWith("Jav")); // false
		System.out.println(text.endsWith("ava")); // true
		
		
		

	}

}
