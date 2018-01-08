package com.lambdabasics.java7;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import com.lambdabasics.interfaces.Condition;
import com.lambdabasics.model.Person;

public class Unit1ExcerciseUsingJava7 {

	public static void main(String[] args){
		List<Person> people = Arrays.asList(
				new Person("naveen", "kankanala", 25),
				new Person("bhargav", "epuri", 26),
				new Person("vinay", "kuchampudi", 28),
				new Person("samuel", "vangara", 30),
				new Person("kevin", "kasha", 50),
				new Person("rakesh", "gubbala", 34)
				);
		
		//Step1: Sort List by lastName
		Collections.sort(people, new Comparator<Person>() {

			@Override
			public int compare(Person o1, Person o2) {
				return o1.getLastName().compareTo(o2.getLastName());
			}
		});
		
		//Step2: Create a method that prints all elements in the list
		System.out.println("Printing all persons");
		printConditionally(people, new Condition() {
			
			@Override
			public boolean test(Person p) {
				return true;
			}
		});
		
		//Step3: Create a method that prints all the elements lastName starting with k
		System.out.println("\nPrinting all the elements lastName starting with k");
		printConditionally(people, new Condition() {
			
			@Override
			public boolean test(Person p) {
				return p.getLastName().startsWith("k");
			}
		});
		
		//Step4: Create a method that prints all the elements firstName starting with s
		System.out.println("\nPrinting all the elements lastName starting with s");
		printConditionally(people, new Condition() {
			
			@Override
			public boolean test(Person p) {
				return p.getFirstName().startsWith("s");
			}
		});
		
	}
	
	public static void printConditionally(List<Person> people, Condition condition){
		for(Person p : people){
			if(condition.test(p) == true)
				System.out.println(p);
		}
	}
}
