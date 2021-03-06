package com.project.java.collection.api;

import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

/* {Set}
 * No Duplicates
 * at most one null element
 * 
 * {LinkedHashset}
 * It uses doubly-linked list
 * Preserve insertion order 
 * */

public class SetUsingLinkedHashset {

	public static void main(String[] args) {
		// Set demonstration using HashSet
		Set<String> hash_Set = new LinkedHashSet<String>();

		hash_Set.add("Geeks");
		hash_Set.add("For");
		hash_Set.add("Geeks");
		hash_Set.add("Example");
		hash_Set.add("Set");
		hash_Set.add(null);
		hash_Set.add(null);/*It would not make sense, as at most one null element is allowed*/
		
		System.out.print("Set output without the duplicates");

		System.out.println(hash_Set);

		// Set demonstration using TreeSet
		// No null value is allowed in the set, so remove it
		hash_Set.remove(null);
		
		System.out.print("Sorted Set after passing into TreeSet");
		Set<String> tree_Set = new TreeSet<String>(hash_Set);
		System.out.println(tree_Set);
	}

}
