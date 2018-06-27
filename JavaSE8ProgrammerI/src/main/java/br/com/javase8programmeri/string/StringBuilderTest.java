package br.com.javase8programmeri.string;

public class StringBuilderTest {

	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder();
		sb.append("guilherme").delete(2,3);
		
		System.out.println(sb); // gulherme
		
		StringBuilder sb2 = new StringBuilder("guilherme");
		
		System.out.println(sb2.indexOf("e")); // 5
		System.out.println(sb2.lastIndexOf("e")); // 8
		
		System.out.println();
		
		System.out.println(sb2.indexOf("e") + sb2.lastIndexOf("e")); // 13
		System.out.println(sb2.indexOf("k") + sb2.lastIndexOf("k")); // -1

	}

}
