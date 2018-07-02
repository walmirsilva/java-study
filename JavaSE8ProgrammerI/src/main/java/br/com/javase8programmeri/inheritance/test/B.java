package br.com.javase8programmeri.inheritance.test;

import java.io.IOException;

public class B {
	void x(int i) throws IOException {
		if (i < 0 ) return ;
		x(-1);
 		System.out.println("c");
	}
}
