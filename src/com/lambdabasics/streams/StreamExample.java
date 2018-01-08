package com.lambdabasics.streams;

import java.util.Arrays;
import java.util.List;

import com.lambdabasics.model.Person;

public class StreamExample {

	public static void main(String[] args) {
		List<Person> people = Arrays.asList(
				new Person("naveen", "kankanala", 25),
				new Person("bhargav", "epuri", 26),
				new Person("vinay", "kuchampudi", 28),
				new Person("samuel", "vangara", 30),
				new Person("kevin", "kasha", 50),
				new Person("rakesh", "gubbala", 34)
				);
		System.out.println("Printing using stream");
		people.stream()
		.filter(p -> p.getLastName().startsWith("k"))
		.forEach(System.out::println);
		
		long count = people.parallelStream().count();
		System.out.println("\ncount of people");
		System.out.println(count);
	}

}
