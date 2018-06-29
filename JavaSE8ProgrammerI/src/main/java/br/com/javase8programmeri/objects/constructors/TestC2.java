package br.com.javase8programmeri.objects.constructors;

public class TestC2 {
	TestC2(TestC1 tc) {
		new TestC1(new TestC());
	}
	
	TestC2() {
		new TestC1();
	}
}
