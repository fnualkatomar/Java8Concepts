package com.java8.string;

import java.util.StringJoiner;

public class StringJoinerExp {

	public static void main(String[] args) {
		StringJoiner sj = new StringJoiner(", ");
		sj.add("one").add("two").add("three");
		System.out.println(sj.toString());
		
		StringJoiner sj1 = new StringJoiner(", ","{","}");
		sj1.add("one");
		System.out.println(sj1.toString());
	}

}
