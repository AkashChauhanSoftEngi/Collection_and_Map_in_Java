package com.project.java.collection.api;

import java.util.ArrayList;
import java.util.List;

/* {List}
 * Duplicates are allowed
 * Multiple Null Values are allowed
 * Preserve Insertion Order
 * 
 * {ArrayList}
 * Arrays.copyOf(elementData, newCapacity), the new array with double the capacity is created 
 * In Java-8, new capacity 1.5 times the older capacity 
 * - int newCapacity = oldCapacity + (oldCapacity >> 1);
 * - right shifting an integer by 1 is equivalent to division by 2.
 * */
public class ListUsingArrayList {

	public static void main(String[] args) {
		// Creating a list
		List<Integer> l1 = new ArrayList<Integer>();
		l1.add(0, 1); // adds 1 at 0 index
		l1.add(1, 2); // adds 2 at 1 index
		l1.add(2, 2);
		l1.add(3, null);
		l1.add(4, null);
		
		System.out.println(l1);

		// Creating another list
		List<Integer> l2 = new ArrayList<Integer>();
		l2.add(3);
		l2.add(4);
		l2.add(5);

		// Will add list l2 from 5 index
		l1.addAll(5, l2);
		System.out.println(l1);

		// Removes element from index 1
		l1.remove(2);
		System.out.println(l1);

		// Prints element at index 3
		System.out.println(l1.get(3));

		// Replace 0th element with 5
		l1.set(0, 5);
		System.out.println(l1);
	}

}
