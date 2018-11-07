package com.java8.reduce;

import java.util.Arrays;
import java.util.List;
import java.util.function.BinaryOperator;
import java.util.stream.Stream;

public class ReductionWithIdentityExample {

	public static void main(String[] args) {
		List<Integer> intList = Arrays.asList(10,10);
		Stream<Integer> intStream = intList.stream();
		BinaryOperator<Integer> sum1 =Integer::sum;
		
		int a= intStream.reduce(0,sum1);
		System.out.println(a);

	}

}
