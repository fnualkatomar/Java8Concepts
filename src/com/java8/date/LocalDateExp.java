package com.java8.date;

import java.time.LocalDate;
import java.time.Month;
import java.time.temporal.ChronoUnit;

public class LocalDateExp {

	public static void main(String[] args) {
		LocalDate ldDate = LocalDate.of(2017, Month.JUNE, 12);
		LocalDate ldDate1 = LocalDate.of(2017, Month.OCTOBER, 29);
        System.out.println(ldDate.until(ldDate1, ChronoUnit.DAYS));
	}

}
