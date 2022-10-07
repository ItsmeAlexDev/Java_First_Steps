package com.sample;

import java.util.ArrayList;
import java.util.Collections;

public class TestingLists {

	public static void main(String[] args) {

		String Lesson1 = "Understanding more about lists";
		String Lesson2 = "Modeling the class Lesson";
		String Lesson3 = "Working with Courses and Sets";

		ArrayList<String> lessons = new ArrayList<>();

		lessons.add(Lesson1);
		lessons.add(Lesson2);
		lessons.add(Lesson3);

		System.out.println(lessons);

		/*
		 * The remove method removes the object referenced by the index
		 * 
		 * Removing 0 should remove the first item
		 * (since the counting starts at 0)
		 */
		lessons.remove(0);
		System.out.println(lessons);

		/*
		 * This could be used to do something with every lesson
		 */
		
		/*
		 * The .get() method is used to get an item using the index of it
		 */
		String firstLesson = lessons.get(0);
		System.out.println("The First Lesson is: " + firstLesson);
		
		/*
		 * This is another way to do something with every lesson
		 */

		/*
		 * The .size() method is used to get the number of items inside a list
		 */
		System.out.println(lessons.size());

		/*
		 * The .add() is used to add an item to a list (as it's notable in the start)
		 */
		lessons.add("Increasing our knowledge");
		System.out.println(lessons);

		/*
		 * The .sort() method (of the Collection class) is used to sort
		 * There is also a .sort() on the List class but it works differently
		 * 
		 * the Collections.sort() method when not provided with a comparator
		 * uses a "natural" order, in this case as this is a String list
		 * the "natural" order, is in alphabetical order
		 */
		Collections.sort(lessons);
		System.out.println("After the sorting:");
		System.out.println(lessons);

	}
}
