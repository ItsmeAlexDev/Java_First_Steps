package com.sample;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.Vector;

public class UseWhichCollection {

	@SuppressWarnings("unused")
	public static void main(String[] args) {

		/*
		 * A HashSet basically generates hashes of keys (objects) and positions them
		 * into a table. Then each time you look for a key, its hash is computed and the
		 * bucket in the table is referenced directly. This means you have just one
		 * operation (best case) to access the map
		 * 
		 * Also as the hash is the thing being stored, you can NOT add an Object 2 times
		 * 
		 * So a HashSet is one of the fastest Collections there is
		 * 
		 * But you can NOT get an item by an index,
		 * it does NOT guarantee the order of elements
		 */
		Collection<Student> studentsHS = new HashSet<>();
		Set<Student> studentsHS2 = new HashSet<>();
		HashSet<Student> studentsHS3 = new HashSet<>();
		
		/*
		 * A Linked Hash set is basically the same thing as a HashSet
		 * 
		 * But it DOES guarantee the order of elements
		 */
		Collection<Student> studentsLHS = new LinkedHashSet<>();
		Set<Student> studentsLHS2 = new LinkedHashSet<>();
		HashSet<Student> studentsLHS3 = new LinkedHashSet<>();
		LinkedHashSet<Student> studentsLHS4 = new LinkedHashSet<>();
		
		
		/*
		 * An Array List uses internally an array so it's possible to see
		 * some properties emerge from this
		 * 
		 * such as:
		 * You CAN add an Object 2 times (or more)
		 * You CAN get an item by the index
		 * The order of elements is ensured
		 * 
		 * It can get an item by item quite fastly
		 * But it can be pretty slow when you delete an item
		 */
		Collection<Student> studentsAL = new ArrayList<>();
		List<Student> studentsAL2 = new ArrayList<>();
		ArrayList<Student> studentsAL3 = new ArrayList<>();
		
		/*
		 * An Linked List is made in such a way that every item acts like an link
		 * of a chain and there are some properties that emerge from this
		 *  
		 * such as:
		 * You CAN add an Object 2 times (or more)
		 * You CAN get an item by the index
		 * The order of elements is ensured
		 * 
		 * It can delete an item by item quite fastly
		 * But it can be pretty slow when you get an item
		 */
		Collection<Student> studentsLL =  new LinkedList<>();
		List<Student> studentsLL2 = new LinkedList<>();
		LinkedList<Student> studentsLL3 = new LinkedList<>();
		
		
		/*
		 * There is also Vector, but it is old and there are better options
		 */
		Vector<Student> studentsV = new Vector<>();

	}
}
