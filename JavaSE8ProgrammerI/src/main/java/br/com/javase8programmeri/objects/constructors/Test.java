package br.com.javase8programmeri.objects.constructors;

public class Test {
	int i;
	String name;
	int length = getLength();

	Test(String name) {
		this.name = name;
	}
	
	int getLength() {
		return name.length();
	}
	
	Test() {
		
	}

}
