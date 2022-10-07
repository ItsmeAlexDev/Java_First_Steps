package com.sample.stack;
public class Flux {

	public static void main(String[] args) {
		
		/*
		 * Testing the behaviour of an Exception in a "stack"
		 * 
		 * An exception stops the execution of code in the line that it happened,
		 * if the method that called the method that had an exception doesnt
		 * deal with the exception, the exception "explodes" like a bomb on the
		 * "base" of the execution stack
		 * 
		 * When a method can have an exception, but doesnt deal with the exception
		 * you must write "throws [theException]"
		 * 
		 */
		System.out.println("Main Start");
		try {
			method1();
		} catch(Exception ex) {
			String msg = ex.getMessage();
			System.out.println("Exception " + msg);
			ex.printStackTrace();
		} 
		System.out.println("Main End");
	}

	private static void method1() throws MyCheckedException  {
		System.out.println("Method1 Start");

		method2();

		System.out.println("Method1 End");
	}

	private static void method2() throws MyCheckedException {
		System.out.println("Method2 Start");
		throw new NullPointerException("Something went wrong here");
		//System.out.println("Method2 End");		
	}
}