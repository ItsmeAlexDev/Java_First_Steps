package com.somebank.bank.test.util;

public class TestWrappers2 {

	public static void main(String[] args) {
		
		/*
		 * Basically every primitive have a wrapper class
		 */
		Integer idadeRef = Integer.valueOf(29); //autoboxing
		System.out.println(idadeRef.intValue()); // unboxing
		
		Double dRef = Double.valueOf(3.2); //autoboxing
		System.out.println(dRef.doubleValue()); //unboxing
		
		Boolean bRef = Boolean.FALSE;
		System.out.println(bRef.booleanValue());
		
		Number refNumber = Float.valueOf(29.9f);
		System.out.println(refNumber);
		
		/*
		 * Number is a class for basically any kind of number
		 * int, float, double, etc. 
		 */
		
	}

}
