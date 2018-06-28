package br.com.javase8programmeri.arraylist;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListTest {

	public static void main(String[] args) {
		
		ArrayList<String> names = new ArrayList<String>();
		names.add("Walmir");
		names.add("Silva");
		
		ArrayList<String> countries = new ArrayList<String>();
		countries.add("Brasil");
		countries.add("USA");
		
		ArrayList<String> everything = new ArrayList<String>();
		everything.addAll(names);
		everything.addAll(countries);
		
		System.out.println(everything.size());
		
		System.out.println(names.get(0));
		
		ArrayList<String> a = new ArrayList<String>();
		ArrayList<String> b = new ArrayList<String>();
		ArrayList<String> c = new ArrayList<String>();
		b.add("a");c.add("c");
		b.add("b");c.add("d");
		
		a.addAll(b);
		a.addAll(c);
		
		System.out.println();
		
		System.out.println(a.get(0));
		System.out.println(a.get(3));
		
		System.out.println();
		
		ArrayList<String> as = new ArrayList<String>();
		as.add(0, "b");
		as.add(0, "a");
		
		for (Iterator<String> i=as.iterator(); i.hasNext(); i.next()) {
			String element = i.next();
			System.out.println(element);
		}
		

	}

}
