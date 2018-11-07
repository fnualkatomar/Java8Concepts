package com.java8.intermediaryandfinal;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class Finale {
	public static void main(String[] args) { 
		Stream<String> stream = Stream.of("one","two","three", "four","five");
		Consumer<String> c = s -> System.out.println(s);
		
		
		Predicate<String> p2 = Predicate.isEqual("two");
		Predicate<String> p3 = Predicate.isEqual("five");
		
		List<String> list = new ArrayList<>();
		
		stream.peek(c)
		.filter(p2.or(p3)).forEach(list::add);
		
		System.out.println("Done!!");
		
		System.out.println("Size of List = "+list.size());
	}
}
