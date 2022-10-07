package com.sample;

import java.util.List;

public class TestCourse {

	public static void main(String[] args) {

		/*
		 * Testing "Course" and its methods
		 */
		Course javaCollections = new Course("Dominating Java collections",
				"Paulo Silveira");

		javaCollections.add(new Lesson("Working with ArrayList", 21));
		javaCollections.add(new Lesson("Creating a Lesson", 20));
		javaCollections.add(new Lesson("Modeling with collections", 22));

		/*
		 * I can NOT modify lessons on JavaCollections here, since
		 * getLessons returns an "unmodifiableList" of lessons
		 * 
		 * So I am forced to use the methods on "Course",
		 * which is pretty cool on OO since it forces
		 * to go on the OO way
		 */
		List<Lesson> lessons = javaCollections.getLessons();
		System.out.println(lessons);
		System.out.println(javaCollections.getLessons());
		System.out.println(javaCollections);

	}

}
