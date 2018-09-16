package com.project.java.collection.api;

import java.util.Set;
import java.util.TreeSet;

/*
 * {Set}
 * No Duplicates
 * At most one null value
 * 
 * {TreeSet}
 * Sorted
 * No null, not even one
 * */
public class SetUsingTreeSet {

	public static void main(String[] args) {
		// Set demonstration using HashSet
		Set<String> tree_Set = new TreeSet<String>();

		tree_Set.add("Geeks");
		tree_Set.add("For");
		tree_Set.add("Geeks");
		tree_Set.add("Example");
		tree_Set.add("Set");
		try {
			tree_Set.add(null);
		} catch (Exception e) {
			System.out.println("TreeSet would not allow to store null values, not even one!");
		}
		
		System.out.print("Set output without the duplicates");
		System.out.println(tree_Set);
	}

}
