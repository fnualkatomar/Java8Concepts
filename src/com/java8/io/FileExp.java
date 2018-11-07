package com.java8.io;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class FileExp {

	public static void main(String[] args) {
		Path path = Paths.get("C:\\Users\\singhs\\workspace\\Java8\\src\\com\\java8\\io\\Person.txt");
		Predicate<String> a = l -> l.contains("ERROR");
		Predicate<String> b = l -> l.contains("Shiv");
		Predicate<String> c = l -> l.contains("Alka");
		try(Stream<String> s = Files.lines(path)){
			//s.filter(a.or(b)).findFirst().ifPresent(System.out::println);
			s.filter(a.or(b).or(c)).forEach(System.out::println);
		} catch (IOException e) {
			
			e.printStackTrace();
		}

	}

}
