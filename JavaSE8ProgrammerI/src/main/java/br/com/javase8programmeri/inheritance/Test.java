package br.com.javase8programmeri.inheritance;

import br.com.javase8programmeri.inheritance.savings.SavingsAccount;
import br.com.javase8programmeri.inheritance.model.Account;

public class Test {

	public static void main(String[] args) {
		SavingsAccount c = new SavingsAccount();
		c.close();

		Account d = c;
		d.close();
	}

}
