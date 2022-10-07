package com.somebank.bank.test;

public class TestArrayString {
	
	public static void main(String[] args) {
		
		/*
		 * Testing arrays
		 * 
		 * arrays seem to act as some kind of "List"
		 * 
		 * you can get to an item by an index using:
		 * Array[index];
		 * 
		 * in this case I am printing out "args" on the console,
		 * args being the arguments defined while executing a java file
		 * "java myProgam 1 2 3" -> args are 1, 2, 3
		 */
		for(int i = 0; i < args.length; i++) {
			System.out.println(args[i]);
		}
		
	}

}
