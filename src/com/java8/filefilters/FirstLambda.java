package com.java8.filefilters;

import java.io.File;
import java.io.FileFilter;

public class FirstLambda {

	public static void main(String[] args) {
		
		/*FileFilter fileFilter = new FileFilter() {
			
			@Override
			public boolean accept(File pathname) {
				return pathname.getName().endsWith(".java");
			}
		};*/
		
		FileFilter fileFilterLambda = (File pathname) -> pathname.getName().endsWith(".java");
		File dir = new File("C:\\Users\\singhs\\workspace\\Java8\\src\\com\\java8\\abst");
		File[] listFiles= dir.listFiles(fileFilterLambda);
		for (File file : listFiles) {
			System.out.println(file);
		}
	}

}
