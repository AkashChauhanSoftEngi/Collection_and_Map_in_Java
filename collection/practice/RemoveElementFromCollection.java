package com.project.java.collection.api.practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/*
 * Whenever it finds any structural modification in the underlying data structure (ex: ArrayList in this case)
 * It will throw Runtime exception
 * 
 * */
public class RemoveElementFromCollection {
	/*
	 * This will throw run time exception anyhow public void
	 * removeFromCollection(List<Integer> marks) { for (Integer mark : marks) {
	 * if (mark < 40) // Will throw (java.util.ConcurrentModificationException)
	 * marks.remove(mark); } }
	 */

	public static void main(String[] args) {
		RemoveElementFromCollection test = new RemoveElementFromCollection();
		List<Integer> list = new ArrayList<Integer>(Arrays.asList(10, 20, 40, 50, 60));
		test.removeFromCollection(list);
		System.out.println(list);
		//Java-8
		test.removeFromCollection();
	}

	public void removeFromCollection(List<Integer> marks) {
		for (Iterator<Integer> iterator = marks.iterator(); iterator.hasNext();) {
			Integer mark = iterator.next();
			if (mark < 40)
				iterator.remove(); // ==> Safe to call remove() on Iterator
		}
	}
	
	public void removeFromCollection() {
		List<Integer> collect1 = Stream.of(10, 20, 30, 40).collect(Collectors.toList());
		collect1.removeIf(integer -> integer > 15);
		collect1.forEach(System.out::println);
		}
}
