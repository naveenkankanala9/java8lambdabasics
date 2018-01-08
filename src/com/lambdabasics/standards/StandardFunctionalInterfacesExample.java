package com.lambdabasics.standards;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

import com.lambdabasics.model.Person;

public class StandardFunctionalInterfacesExample {

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
		performConditionally(people, (p) -> true, (p) -> System.out.println(p.getFirstName()));
		
		//Step1: Sort List by lastName
		Collections.sort(people, (o1, o2) -> o1.getLastName().compareTo(o2.getLastName()));
		
		//Step2: Create a method that prints all elements in the list
		System.out.println("Printing all persons");
		performConditionally(people, (p) -> true, (p) -> System.out.println(p));
		
		//Step3: Create a method that prints all the elements lastName starting with k
		System.out.println("\nPrinting all the elements lastName starting with k");
		performConditionally(people, (p) -> p.getLastName().startsWith("k"), (p) -> System.out.println(p));
		
		//Step4: Create a method that prints all the elements firstName starting with s
		System.out.println("\nPrinting all the elements lastName starting with s");
		performConditionally(people, (Person p) -> p.getFirstName().startsWith("s"), (p) -> System.out.println(p));
		
		//Step5: Create a method that prints all elements first names after sorting with last names in the list
		System.out.println("\nPrinting all persons first names after sorting with last names");
		performConditionally(people, (p) -> true, (p) -> System.out.println(p.getFirstName()));
		
	}
	
	public static void performConditionally(List<Person> people, Predicate<Person> predicate, Consumer<Person> consumer){
		for(Person p : people){
			if(predicate.test(p) == true){
				consumer.accept(p);
			}
		}
	}
}
