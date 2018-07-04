package br.com.javase8programmeri.exceptions;

public class Test2 {
	
	void method1() {
		System.out.println("primeiro antes");
		try {
			this.method2();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("primeiro depois");
	}
	
	void method2() throws Exception {
		throw new Exception();
	}

}
