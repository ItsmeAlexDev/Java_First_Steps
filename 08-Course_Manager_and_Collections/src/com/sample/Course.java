package com.sample;

import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;

public class Course {

	/*
	 * using an
	 * ArrayList to lessons, as I need order of elements, and I am probally not going to delete any
	 * HashSet to students, as I do NOT need order of elements, and I do NOT want a Student to be here twice
	 * HashMap to registration to student, as I need to create a relation between numbers (registration) and students
	 */
	private String name;
	private String instructor;
	private List<Lesson> lessons = new LinkedList<Lesson>();
	private Set<Student> students = new HashSet<>();
	private Map<Integer, Student> registrationToStudent = new HashMap<>();

	public Course(String name, String instructor) {
		this.name = name;
		this.instructor = instructor;
	}

	public String getName() {
		return name;
	}

	public String getInstructor() {
		return instructor;
	}

	public List<Lesson> getLessons() {
		return Collections.unmodifiableList(lessons);
	}

	public Set<Student> getStudents() {
		return Collections.unmodifiableSet(students);
	}

	public void add(Lesson lesson) {
		this.lessons.add(lesson);
	}

	public int getTotalTime() {
		return this.lessons.stream().mapToInt(Lesson::getTime).sum();
	}

	@Override
	public String toString() {
		return "[Course: " + name + ", total time: " + this.getTotalTime()
				+ ", lessons: + " + this.lessons + "]";
	}

	/*
	 * Adding a Student to the Course
	 */
	public void register(Student student) {
		this.students.add(student);
		this.registrationToStudent.put(student.getRegistrationNumber(), student);
	}

	/*
	 * Checking if a Student is inside the student Collection
	 */
	public boolean isRegistered(Student student) {
		return this.students.contains(student);
	}

	/*
	 * Getting a Student by the registration number 
	 */
	public Student getStudentByRegisterationNumber(int number) {
		if(!registrationToStudent.containsKey(number)) throw new NoSuchElementException();
		return registrationToStudent.get(number);
	}

}
