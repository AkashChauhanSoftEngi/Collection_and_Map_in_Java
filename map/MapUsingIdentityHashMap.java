package com.project.java.map.api;

import java.util.HashMap;
import java.util.IdentityHashMap;
import java.util.Map;

public class MapUsingIdentityHashMap {

	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static void main(String[] args) {
		// Creating HashMap and IdentityHashMap objects
		Map hm = new HashMap();
		Map ihm = new IdentityHashMap();

		System.out.println("Map: ");
		// Putting key and value in HashMap and IdentityHashMap Object
		hm.put("hmkey1", "hmvalue");
		hm.put(new String("hmkey1"), "hmvalue1");
		hm.put("hmkey1", "hmvalue");
		hm.put("hmkey2", "hmvalue");	

		ihm.put("ihmkey1", "ihmvalue");
		ihm.put(new String("ihmkey1"), "ihmvalue1");
		ihm.put("ihmkey1", "ihmvalue1");
		ihm.put("ihmkey2", "ihmvalue1");
		
		// PrintMap
		System.out.println("hm: " + hm);
		System.out.println("ihm: " + ihm);

		System.out.println("\nSize: ");
		// Print Size of HashMap and IdentityHashMap Object
		// hm.size() will print 1 since it compares the objects logically
		// and both the keys are same
		System.out.println("Size of HashMap--" + hm.size());

		// ihm.size() will print 2 since it compares the objects by reference
		System.out.println("Size of IdentityHashMap--" + ihm.size());

		
		System.out.println("\nTesting: ");
		/*----------------------------------------------------------------*/
		/* equals used by HashMap Class, same value or not*/
		if ("ABC".equals(new String("ABC"))) {
			System.out.println("True");
		} else {
			System.out.println("False");
		}

		/* "==" Use by IdentityHashMap Class, same object or not*/
		if ("ABC" == new String("ABC")) {
			System.out.println("True");
		} else {
			System.out.println("False");
		}
		/*----------------------------------------------------------------*/
	}
}
