package br.com.javase8programmeri.lambdas;

public class AgeOfMajority implements Matcher<Person> {

	@Override
	public boolean test(Person p) {
		return p.getAge() >= 18;
	}

}
