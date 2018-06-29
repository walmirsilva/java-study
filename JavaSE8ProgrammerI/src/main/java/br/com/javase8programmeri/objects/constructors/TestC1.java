package br.com.javase8programmeri.objects.constructors;

public class TestC1 {
	TestC1(TestC tc) {
		new TestC2();
	}
	
	TestC1() {
		new TestC2(this);
	}

}
