package com.lambdabasics.methodreferences;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

import com.lambdabasics.model.Person;

public class MethodReferenceExample2 {
	public static void main(String[] args){
		List<Person> people = Arrays.asList(
				new Person("naveen", "kankanala", 25),
				new Person("bhargav", "epuri", 26),
				new Person("vinay", "kuchampudi", 28),
				new Person("samuel", "vangara", 30),
				new Person("kevin", "kasha", 50),
				new Person("rakesh", "gubbala", 34)
				);
		
		//Step0: Create a method that prints all elements first names before sorting with last names in the list
		System.out.println("\nPrinting all persons first names before sorting with last names");
		performConditionally(people, (p) -> true, System.out::println); //(p) -> System.out.println(p.getFirstName()) === System.out::println
	}
	
	public static void performConditionally(List<Person> people, Predicate<Person> predicate, Consumer<Person> consumer){
		for(Person p : people){
			if(predicate.test(p) == true){
				consumer.accept(p);
			}
		}
	}
}
