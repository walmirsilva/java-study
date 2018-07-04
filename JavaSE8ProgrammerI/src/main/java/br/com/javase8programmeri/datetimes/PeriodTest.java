package br.com.javase8programmeri.datetimes;

import java.time.LocalDate;
import java.time.Period;

public class PeriodTest {

	public static void main(String[] args) {
		
		LocalDate birthDay = LocalDate.of(1983, 8, 24);
		LocalDate base = LocalDate.of(2018,7, 4);
		
		Period lifeTime = Period.between(birthDay, base);
		
		System.out.println(lifeTime.getYears()); // 34 anos
		System.out.println(lifeTime.getMonths()); // 10 meses
		System.out.println(lifeTime.getDays()); // 10 dias

	}

}
