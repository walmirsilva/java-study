package br.com.javase8programmeri.operators;

public class CompareString {

	public static void main(String[] args) {
		String s1 = "string";
		String s2 = "string";
		String s3 = new String("string");
		
		System.out.println(s1 == s2); // true
		System.out.println(s1 == s3); // False
		System.out.println(s1.equals(s2)); // True
		System.out.println(s1.equals(s3)); // True
		System.out.println(s3.equals(s1)); // true
		
		System.out.println();
		
		String str1 = "s1";
		String str2 = "s" + "1";
		System.out.println(str1==str2);
		System.out.println(str1==(""+str2));
		
		System.out.println();
		
		String _s1 = "s1";
		String _s2 = _s1.substring(0, 1) + _s1.substring(1,1);
		System.out.println(_s1 == _s2);
		System.out.println(_s1.equals(_s2));
		
		System.out.println();
		
		String __s1 = "s1";
		String __s2 = __s1.substring(0,2);
		System.out.println(__s1 == __s2);
		System.out.println(__s1.equals(__s2));
		
		
	}

}
