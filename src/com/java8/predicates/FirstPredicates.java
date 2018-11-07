package com.java8.predicates;

import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class FirstPredicates {
	public static void main(String[] args) { 
		Stream<String> stream = Stream.of("one","two","three", "four","five");
		Consumer<String> c = s -> System.out.println(s);
		
		Predicate<String> p = s -> s.length() >3;
		Predicate<String> p2 = Predicate.isEqual("two");
		Predicate<String> p3 = Predicate.isEqual("five");
		
		stream
		.filter(p2.or(p3).or(p))
		.forEach(c);
	}
}
