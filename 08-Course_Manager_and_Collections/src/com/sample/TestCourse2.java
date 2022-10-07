package com.sample;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TestCourse2 {

	public static void main(String[] args) {

		Course javaCollections = new Course("Dominating Java collections",
				"Paulo Silveira");

		javaCollections.add(new Lesson("Working with ArrayList", 21));
		javaCollections.add(new Lesson("Creating a Lesson", 20));
		javaCollections.add(new Lesson("Modeling with collections", 24));
		
		
		/*
		 * Here is the unmodifiable list as I tested before
		 */
		List<Lesson> unmodifiableList = javaCollections.getLessons();
	
		
		/*
		 * If I create another List and and pass the unmodifiable list to be copied
		 * I can create a List that I CAN modify that is equal to the unmodifiable list
		 */
		List<Lesson> lessons = new ArrayList<>(unmodifiableList);
		
		// Sorting the modifiable list to show how I can modify it
		Collections.sort(lessons);
		System.out.println(lessons);
		
		// Original unmodifiableList to compare to the last one
		System.out.println(unmodifiableList);
	}
}
