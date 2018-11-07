package com.java8.date;

import java.time.LocalDate;
import java.time.Month;
import java.time.temporal.ChronoUnit;

public class CountNoOfDays {

	public static void main(String[] args) {
		LocalDate ld = LocalDate.of(1988, Month.MARCH, 06);
		LocalDate now = LocalDate.now();
		System.out.println(ld.until(now, ChronoUnit.YEARS));
	}

}
