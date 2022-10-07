 package com.sample;

import java.util.Iterator;
import java.util.Set;

public class TestCourseWithStudents {

	public static void main(String[] args) {

		Course javaCollections = new Course("Dominating Java collections",
				"Paulo Silveira");

		javaCollections.add(new Lesson("Working with ArrayList", 21));
		javaCollections.add(new Lesson("Creating a Lesson", 20));
		javaCollections.add(new Lesson("Modeling with collections", 24));
		


		Student a1 = new Student("Rodrigo Turini", 34672);
		Student a2 = new Student("Guilherme Silveira", 5617);
		Student a3 = new Student("Mauricio Aniche", 17645);

		javaCollections.register(a1);
		javaCollections.register(a2);
		javaCollections.register(a3);

		/*
		 * A bit old way to go thru a collection
		 */
		Set<Student> students = javaCollections.getStudents();
		Iterator<Student> iterator = students.iterator();
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}
	
		/*
		 * This should be true as "a1" was added in line 24
		 */
		System.out.println("Is the Student " + a1.getName() + " registered?");
		System.out.println(javaCollections.isRegistered(a1));

		/*
		 * This should also be true as "turini" is equal to "a1"
		 */
		Student turini = new Student("Rodrigo Turini", 34672);
		System.out.println("And is this \"Turini\" registered?");
		System.out.println(javaCollections.isRegistered(turini));

		/*
		 * If the checks before are true, this should also be true
		 */
		System.out.println("Is a1 equals to Turini?");
		System.out.println(a1.equals(turini));
		
		/*
		 * The hash codes of a1 and turini should be equal, as they are the same Object
		 */
		System.out.println("Is a1.hashCode() equal to turini.hashCode()");
		System.out.println(a1.hashCode() == turini.hashCode());

	}
}
