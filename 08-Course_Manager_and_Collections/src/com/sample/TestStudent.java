package com.sample;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;

public class TestStudent {

	public static void main(String[] args) {

		/*
		 * I am using a HashSet here for some reasons:
		 * 
		 * I do NOT to a student to be here twice
		 * I do NOT need the order of elements
		 * It would be good to have something fast here,
		 * as in a college there could be thousands of students
		 */
		Collection<String> students = new HashSet<>();
		students.add("Rodrigo Turini");//Every name here is the actual real name
		students.add("Alberto Souza");//of some of my instructors at Alura ( https://www.Alura.com.br )
		students.add("Nico Steppat");
		students.add("Sergio Lopes");
		students.add("Renan Saggio");
		students.add("Mauricio Aniche");

		System.out.println(students);

		/*
		 * If for some reason I needed to put a HashSet on an ArrayList 
		 * I can just put the HashSet inside the declaration of the list
		 * as shown below (this also works on other Lists/Sets)
		 */
		List<String> studentsOnList = new ArrayList<>(students);
		//sorting in alphabetical order
		Collections.sort(studentsOnList, (n1, n2) -> n1.compareTo(n2));
		
		//printing the list (should be in alphabetical order)
		System.out.println(studentsOnList);
	}

}
