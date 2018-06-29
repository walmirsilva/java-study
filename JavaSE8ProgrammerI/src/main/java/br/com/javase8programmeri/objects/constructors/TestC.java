package br.com.javase8programmeri.objects.constructors;

public class TestC {

	public static void main(String[] args) {
		new TestC(); new TestC1(); new TestC2(); 
		
		new TestC2(new TestC1(new TestC()));

	}

}
