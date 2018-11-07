package com.java8.reduce;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

import com.java8.stream.Person;

public class ReduceWithMinExample {

	public static void main(String[] args) {
		Person p1 = new Person();
		p1.setAge(20);
		p1.setName("Shiv");
		
		Person p2 = new Person();
		p2.setAge(21);
		p2.setName("Ratan");
		
		Person p3 = new Person();
		p3.setAge(21);
		p3.setName("Ratan");
		
		List<Person> persons = new ArrayList<Person>();
		persons.add(p1);
		persons.add(p2);
		persons.add(p3);
		
		
		Stream<Person> personsStream = Stream.of(p1,p2,p3);
		Optional<Integer> minimumAge = personsStream.
		      map(p -> p.getAge()).
		      filter(i -> i>20).
		      min(Comparator.naturalOrder());
		
		if(minimumAge.isPresent()) System.out.println(minimumAge);

	}

}
