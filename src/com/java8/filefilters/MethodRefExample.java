package com.java8.filefilters;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class MethodRefExample {

	public static void main(String[] args) {
		List<String> stringList = Arrays.asList("Shiv","Ratan","Singh");
		Consumer<String> c1 = System.out::println;
		List<String> newList = new ArrayList<>();
		Consumer<String> c2 = newList::add;
		stringList.forEach(c2.andThen(c1));
		System.out.println(newList.size());
		newList.forEach(c1);
	}

}
