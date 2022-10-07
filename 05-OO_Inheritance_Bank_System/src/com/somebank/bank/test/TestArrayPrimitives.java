package com.somebank.bank.test;

public class TestArrayPrimitives {

	public static void main(String[] args) {
		
		/*
		 * Testing arrays using "primitives"
		 * 
		 * arrays can store the "type" of the items stored
		 * usually you can find it just in front of the declaration
		 * Type[x]
		 */
		int[] ages = new int[5];
		
		for(int i = 0; i < ages.length; i++) {
			ages[i] = i * i;
		}
		
		for(int i = 0; i < ages.length; i++) {
			System.out.println(ages[i]);
		}

	}

}
