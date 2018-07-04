package br.com.javase8programmeri.lambdas;

import java.util.ArrayList;
import java.util.List;

public class PersonFilter {
	
	public List<Person> filter(List<Person> input, Matcher<Person> matcher) {
		List<Person> output = new ArrayList<>();
		
		for(Person person : input) {
			if(matcher.test(person))
				output.add(person);
		}
				
		return output;
		
 	}

}
