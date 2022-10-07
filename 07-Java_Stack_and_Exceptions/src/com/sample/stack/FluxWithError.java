package com.sample.stack;

public class FluxWithError {

	public static void main(String[] args) {
		
		/*
		 * The code here can treat some Exceptions, but not the Exception that is happening
		 * so the Exception "bomb" is "exploding" without any treatment
		 * 
		 * If the Exception happening was "Arithmetic" or "NullPointer" I would not have no
		 * problem as there already code to deal with these Exceptions
		 * 
		 * I can treat Exceptions using try/catch, a way to make a try/catch treat EVERY Exception
		 * would be something like
		 * 
		 * Try {
		 * 		codeThatCanThrowException();
		 * } catch (Exception ex) {
		 * 		codeThatDealsWithExceptions(ex);
		 * }
		 */
		System.out.println("Main Start");
		try {
			method1();
		} catch (ArithmeticException | NullPointerException ex) {
			String msg = ex.getMessage();
			System.out.println("Exception " + msg);
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
	 * This should throw an exception as this code NEVER ends the execution on
	 * normal conditions
	 */
	private static void method2() {
		System.out.println("Method2 Start");
		method2();
		System.out.println("Method2 End");
	}
}