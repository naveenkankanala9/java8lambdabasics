package com.lambdabasics.methodreferences;

public class MethodReferenceExample1 {
	
	public static void main(String[] args){
		Thread thread = new Thread(MethodReferenceExample1::printMessage); //() -> printMessage() === MethodReferenceExample1::printMessage
		thread.start();
	}
	
	public static void printMessage(){
		System.out.println("Hello World!!");
	}
}

