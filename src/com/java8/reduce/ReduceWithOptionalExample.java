package com.java8.reduce;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.function.BinaryOperator;
import java.util.stream.Stream;

public class ReduceWithOptionalExample {

	public static void main(String[] args) {
		List<Integer> intList = Arrays.asList(1,2,3);
		Stream<Integer> intStream = intList.stream();
		BinaryOperator<Integer> sum1 =Integer::sum;
		
		Optional<Integer> a= intStream.reduce(sum1);
		if(a.isPresent()) System.out.println(a.get());

	}

}
