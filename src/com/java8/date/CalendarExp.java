package com.java8.date;

import java.util.Calendar;
import java.util.Date;

public class CalendarExp {

	public static void main(String[] args) {
		Calendar cal = Calendar.getInstance();
		
		cal.set(1985, 10, 01);
		
		cal.set(Calendar.DAY_OF_MONTH,
				cal.getActualMaximum(Calendar.DAY_OF_MONTH));
		
		Date firstDayOfTheMonth = cal.getTime();
		System.out.println("firstDayOfTheMonth" + firstDayOfTheMonth);
	}

}
