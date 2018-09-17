package com.project.java.collection.api;

import java.util.ArrayList;

public class HetrogeneousObjectsCollection {

	@SuppressWarnings({ "unchecked", "rawtypes" })
	public static void main(String[] args) {
		ArrayList al = new ArrayList();
		al.add(1);
		al.add("abc");
		al.add(new String("def"));
		System.out.println(al);
	}
}
