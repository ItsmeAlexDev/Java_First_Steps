package com.sample.stack;
public class FluxWithTreatment {

	public static void main(String[] args) {
		
		/*
		 * Here we can see on the console "Main End", indicating
		 * that the "main" part of the code was executed from
		 * start to finish, showing that the exception was dealt
		 * with.
		 * 
		 * Here the "Exception bomb" does not "explode" as I deal
		 * with the "bomb" situation
		 */
		System.out.println("Main Start");
		try {
			method1();
		} catch(Exception ex) {
			String msg = ex.getMessage();
			System.out.println("Exception " + msg);
			System.out.println("Dealing with Exception...");
			ex.printStackTrace();
		} 
		System.out.println("Main End");
	}

	private static void method1() {
		System.out.println("Method1 Start");
		method2();
		System.out.println("Method1 End");
	}

	/*
	 * Should throw an Exception as a division by 0 is not possible
	 */
	private static void method2() {
		System.out.println("Method2 Start");
		for(int i = 1; i <= 5; i++) {
			System.out.println(i);
			int a = i / 0;
			System.out.println(a);
		}
		System.out.println("Method2 End");		
	}
}