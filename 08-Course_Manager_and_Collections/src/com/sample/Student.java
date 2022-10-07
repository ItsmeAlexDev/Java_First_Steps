package com.sample;

public class Student {

	/*
	 * Creating a Class for Students of a college or something...
	 */
	private String name;
	private int registrationNumber;

	public Student(String name, int registrationNumber) {
		if (name == null) {
			throw new NullPointerException("Name can NOT be null!");
		}
		this.name = name;
		this.registrationNumber = registrationNumber;
	}

	public String getName() {
		return name;
	}

	public int getRegistrationNumber() {
		return registrationNumber;
	}

	
	/*
	 * toString() alters what you get when you use Student.toString();
	 * such as in: System.out.println(Student.toString());
	 * 
	 * the "default" toString() is usually just a number that indicates
	 * "where" the Object is
	 */
	@Override
	public String toString() {
		return "[Student: " + this.name + ", Registration Number: " + this.registrationNumber
				+ "]";
	}
	
	/*
	 * As seen before, Overriding "equals()" is just changing the rules
	 * on what you consider to be equal to the object
	 * 
	 * in this case, if 2 "Students" have a same name, they are the same
	 */
	@Override
	public boolean equals(Object obj) {
		Student anotherStudent = (Student) obj;
		return this.name.equals(anotherStudent.name);
	}
	
	/*
	 * This is a one way conversion that is used in some places such
	 *  as in Collections on HashMap, HashSet, etc.
	 */
	@Override
	public int hashCode() {
		return this.name.hashCode();
	}
	
}
