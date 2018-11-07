package com.java8.collector;

import java.util.stream.Collectors;
import java.util.stream.Stream;

import com.java8.stream.Person;

public class CollectorExample {

	public static void main(String[] args) {
		Person p1 = new Person();
		p1.setAge(20);
		p1.setName("Shiv");
		
		Person p2 = new Person();
		p2.setAge(21);
		p2.setName("Ratan");
		
		Person p3 = new Person();
		p3.setAge(21);
		p3.setName("Singh");
		
		Stream<Person> personsStream = Stream.of(p1,p2,p3);
		
		String name= personsStream.map(p -> p.getName()).collect(Collectors.joining(","));
		System.out.println(name);
	}

}
