package br.com.javase8programmeri.arraylist;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class InteratorTest {

	public static void main(String[] args) {	
		
		Collection<String> strings = new ArrayList<String>();
		strings.add("Walmir");
		strings.add("Silva");
		
		Iterator<String> iterator = strings.iterator();
		
		while(iterator.hasNext()) {
			String current = iterator.next();
			System.out.println(current);
		}
		
		System.out.println();
		
		System.out.println(strings.remove("Walmir"));
		
		// Forma mais elegante de percorrer um array
		for(String current : strings)
			System.out.println(current);
		
		
		ArrayList<String> c = new ArrayList<String>();
		c.add("a");
		c.add("a");
		
		System.out.println(c.remove("a"));
		System.out.println(c.size());
		
		for(String current : c)
			System.out.println(current);
		
		
		System.out.println();
		
		ArrayList<String> list = new ArrayList<String>();
		list.add("a"); 
		list.add("b");
		list.add("a"); 
		list.add("c");
		list.add("a"); 
		list.add("b");
		list.add("a");
		
		System.out.println(list.lastIndexOf("b"));
		
		

		ArrayList<String> lists = new ArrayList<String>();
		lists.add("a");
		lists.add("b");
		lists.add("a");
		lists.add("b");
		lists.add("a");
		
		System.out.println(lists.lastIndexOf("b"));
		
		System.out.println();
		
		ArrayList<String> l = new ArrayList<String>();
		l.add("a");
		l.add("b");
		l.add(1, "amor");
		l.add(3, "love");
		
		String[] array = l.toArray();
		System.out.println(array[2]);
	}

}
