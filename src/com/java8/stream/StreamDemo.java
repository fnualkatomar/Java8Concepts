package com.java8.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class StreamDemo {

	public static void main(String[] args) {
		Person p1 = new Person();
		p1.setAge(20);
		p1.setName("Shiv");
		
		Person p2 = new Person();
		p2.setAge(30);
		p2.setName("Shiv Ratan");
		
		List<Person> persons = new ArrayList<Person>();
		persons.add(p1);
		persons.add(p2);
		
		Stream<Person> personStream = persons.stream();
		
		personStream.
				filter(p -> p.getAge()>20 ).forEach(System.out::println);

	}

}
