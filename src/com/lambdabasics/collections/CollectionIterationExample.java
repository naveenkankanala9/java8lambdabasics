package com.lambdabasics.collections;

import java.util.Arrays;
import java.util.List;

import com.lambdabasics.model.Person;

public class CollectionIterationExample {
	
	public static void main(String[] args){
		List<Person> people = Arrays.asList(
				new Person("naveen", "kankanala", 25),
				new Person("bhargav", "epuri", 26),
				new Person("vinay", "kuchampudi", 28),
				new Person("samuel", "vangara", 30),
				new Person("kevin", "kasha", 50),
				new Person("rakesh", "gubbala", 34)
				);
		//external executor
		System.out.println("using for block");
		for(int i=0; i<people.size(); i++){
			System.out.println(people.get(i));
		}
		//external executor
		System.out.println("\nusing for-in block");
		for(Person p : people){
			System.out.println(p);
		}
		//internal executor
		System.out.println("\nusing lambda method reference for-each consumer block");
		people.forEach(System.out::println);
	}
}
