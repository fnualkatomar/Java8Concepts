package com.java8.date;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.time.LocalDate;
import java.time.Period;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class DateAndTime {

	public static void main(String[] args) {
		List<Person> personsList = new ArrayList<>();
		try(BufferedReader reader = new BufferedReader(new InputStreamReader(DateAndTime.class.getResourceAsStream("Person.txt")));
				Stream<String> stream = reader.lines();){
			stream.forEach(
					line -> {
					String[] s=	line.split(" ");
					Person p = new Person(s[0], LocalDate.of(Integer.parseInt(s[1]), Integer.parseInt(s[2]), Integer.parseInt(s[3])));
					personsList.add(p);
				
					});
			LocalDate now = LocalDate.now();
			personsList.stream().forEach(p -> {
				Period period = Period.between(p.getAge(), now);
				System.out.println(p.getName() +" was born " +period.get(ChronoUnit.YEARS) +" years " +period.get(ChronoUnit.MONTHS) +" month "+period.get(ChronoUnit.DAYS) +" days ago. ");
			});
		} catch (IOException e) {
			
			e.printStackTrace();
		}

	}

}
