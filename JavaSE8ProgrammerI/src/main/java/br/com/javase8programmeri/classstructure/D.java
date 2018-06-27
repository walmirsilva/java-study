package br.com.javase8programmeri.classstructure;

import java.util.*;


class D {

	public static void main(String[] args) {
		ArrayList<String> existing = new ArrayList<String>();
		
		for (String arg : args) {
			if (new E().exists(arg))
				existing.add(arg);
		}

	}

}
/**
 * Arquivo não compila porque o import tem que ficar no topo
 */
import java.io.*;

class E {
	public boolean exists(String name) {
		File f = new File(name);
		return f.exists();
	}
}



