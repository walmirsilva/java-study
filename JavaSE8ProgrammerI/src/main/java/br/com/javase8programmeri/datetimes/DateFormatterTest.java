package br.com.javase8programmeri.datetimes;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class DateFormatterTest {

	public static void main(String[] args) {
		LocalDate birthDate = LocalDate.of(1983,8, 24);
		
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
				
		System.out.println(formatter.format(birthDate));
		
		DateTimeFormatter formatterOther = DateTimeFormatter.ofPattern("yyyyMM");
		
		System.out.println(formatterOther.format(birthDate));

	}

}
