package com.somebank.bank.test;

public class TestString {

	public static void main(String[] args) {

		/*
		 * Testing out some strings
		 * 
		 * String unlike double**, int**, float** 
		 * is a class so it has methods in it
		 * 
		 * **(We have classes for those primitive values,
		 *  but I will let this as content for further testing)
		 */
		
		String string = "     Alura    ";
		String trimmedString = string.trim();//.trim() should remove the spaces
		
		System.out.println(string.contains("Alu"));//should be true as "Alu" is in fact inside "Alura"
		System.out.println(trimmedString);//should be "Alura" as the .trim() method should remove the spaces
		
		String name = "Alura"; //Object Literal
		String name2 = new String("Alura"); //String is a class so you should be able to instanciate it
		
		System.out.println(name);//These 2 should be the same
		System.out.println(name2);//as they are just different ways to writing the same thing
		
		System.out.println(name.length());//get the length of the name, should be 5
		
		for(int i = 0; i < name.length(); i++) { //Printing a name letter (char) by letter
			System.out.println(name.charAt(i));
		}
		
		string = trimmedString.replace("u", "o");//Should replace the U with O
		System.out.println(string);//Should print "Alora"
		
		
	}

}
