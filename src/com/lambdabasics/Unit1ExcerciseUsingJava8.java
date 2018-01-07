package com.lambdabasics;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Unit1ExcerciseUsingJava8 {

	public static void main(String[] args){
		List<Person> people = Arrays.asList(
				new Person("naveen", "kankanala", 25),
				new Person("bhargav", "epuri", 26),
				new Person("vinay", "kuchampudi", 28),
				new Person("samuel", "vangara", 30),
				new Person("kevin", "kasha", 50)
				);
		
		//Step1: Sort List by lastName
		Collections.sort(people, (o1, o2) -> o1.getLastName().compareTo(o2.getLastName()));
		
		//Step2: Create a method that prints all elements in the list
		System.out.println("Printing all persons");
		printConditionally(people, (p) -> true);
		
		//Step3: Create a method that prints all the elements lastName starting with k
		System.out.println("Printing all the elements lastName starting with k");
		printConditionally(people, (p) -> p.getLastName().startsWith("k"));
		
		//Step3: Create a method that prints all the elements firstName starting with c
		System.out.println("Printing all the elements lastName starting with v");
		printConditionally(people, (Person p) -> p.getFirstName().startsWith("v"));
		
	}
	
	public static void printConditionally(List<Person> people, Condition condition){
		for(Person p : people){
			if(condition.test(p) == true)
				System.out.println(p);
		}
	}
}
