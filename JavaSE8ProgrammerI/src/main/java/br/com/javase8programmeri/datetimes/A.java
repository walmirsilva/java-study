package br.com.javase8programmeri.datetimes;

import java.time.LocalTime;
import java.time.ZoneId;

public class A {

	public static void main(String[] args) {
		LocalTime dateChicago = LocalTime.now(ZoneId.of("America/Los_Angeles"));
		LocalTime cateSaoPaulo = LocalTime.now(ZoneId.of("America/Sao_Paulo"));
		
		System.out.println(dateChicago);
		System.out.println(cateSaoPaulo);

	}

}
