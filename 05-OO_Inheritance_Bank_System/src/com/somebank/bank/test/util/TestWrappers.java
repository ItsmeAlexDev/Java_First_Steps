package com.somebank.bank.test.util;

import java.util.ArrayList;
import java.util.List;

public class TestWrappers {

	public static void main(String[] args) {

		/*
		 * Testing to see how wrappers work 
		 */
		//Integer
		int ageint = 29;//primitive
		Integer ageInteger = Integer.valueOf(29);//in a Class
		//Integer (the Class) is a "wrapper" for the primitive int
		
		System.out.println("is \"ageint\" equal to \"ageInteger\"? " + (ageint == ageInteger));//checking to see if ageint = ageInteger
		System.out.println(ageInteger.doubleValue());//ageInteger value as a double

		//Some methods of the Integer Class
		System.out.println(Integer.MAX_VALUE);
		System.out.println(Integer.MIN_VALUE);
		System.out.println(Integer.SIZE);
		System.out.println(Integer.BYTES);
		
		int value = ageInteger.intValue(); //going from wrapper to primitive again		
		System.out.println(value);

		/*
		 * getting an int/Integer out of a string 
		 */
		String s = "10";
		Integer number = Integer.valueOf(s);
		int number2 = Integer.parseInt(s);
		System.out.println("String -> int/Integer: " + number + " and " + number2);
		
		/*
		 * Testing autoboxing/unboxing 
		 */
		List<Integer> numbers = new ArrayList<Integer>();
		numbers.add(29);//Autoboxing: here the primitive is converted to the wrapper, as the list only accepts Integer(s) and not int(s)
		int unboxedInt = numbers.get(0);//Unboxing: here the Class is converted to the primitive, as "unboxedInt" is a primitive
		System.out.println("autoboxing/unboxing: " + unboxedInt + " and " + numbers.get(0));
	}

}
