package com.java8.date;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Month;
import java.time.Period;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.Set;

public class ZoneExample {

	public static void main(String[] args) {
		Set<String> zoneIds = ZoneId.getAvailableZoneIds();
		zoneIds.stream().forEach(System.out::println);
		
		ZonedDateTime currentMeeting = ZonedDateTime.of(
				  LocalDate.of(2018, Month.JANUARY, 30), 
				  LocalTime.of(00, 30), ZoneId.of("US/Central"));
		System.out.println(currentMeeting);
		ZonedDateTime nextMeeting = currentMeeting.plus(Period.ofMonths(1));
		System.out.println(nextMeeting);
		System.out.println(nextMeeting.withZoneSameInstant(ZoneId.of("US/Arizona")));
		
		
	}

}
