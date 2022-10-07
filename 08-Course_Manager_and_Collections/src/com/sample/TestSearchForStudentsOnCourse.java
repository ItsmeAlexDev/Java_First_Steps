package com.sample;

public class TestSearchForStudentsOnCourse {
	public static void main(String[] args) {
		
		/*
		 * Testing some of the methods in "Course"
		 */
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
		
		System.out.println("Who is the Student by the registration number 5617?");
		
		Student aluno = javaCollections.getStudentByRegisterationNumber(5617);
		System.out.println("Student: " + aluno);
	}
}
