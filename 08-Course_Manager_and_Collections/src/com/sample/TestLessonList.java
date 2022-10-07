package com.sample;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class TestLessonList {

	public static void main(String[] args) {

		Lesson a1 = new Lesson("Revisiting the ArrayLists", 21);
		Lesson a2 = new Lesson("Object Lists", 20);
		Lesson a3 = new Lesson("Relation of lists and Objects", 15);

		ArrayList<Lesson> lessons = new ArrayList<>();

		lessons.add(a1);
		lessons.add(a2);
		lessons.add(a3);

		/*
		 * This is before any sort, so it should be the in the order of insertion
		 */
		System.out.println(lessons);

		/*
		 * This is using the comparator inside the class, that should be based on the
		 * alphabetical order of titles
		 */
		Collections.sort(lessons);
		System.out.println(lessons);

		/*
		 * This should sort based on the order (from lowest to highest) of time this
		 * could be better as this is using a quite old class
		 */
		Collections.sort(lessons, Comparator.comparing(Lesson::getTime));
		System.out.println(lessons);

		/*
		 * This does the same sort of the one right above, but it is a better way of
		 * doing it
		 */
		lessons.sort(Comparator.comparing(Lesson::getTime));
		System.out.println(lessons);

	}

}
