package br.com.javase8programmeri.datetimes;

import java.time.Month;
import java.time.MonthDay;

public class C {

	public static void main(String[] args) {
		MonthDay someChristimas = MonthDay.of(Month.DECEMBER, 31);
		
		System.out.println(someChristimas);

	}

}
