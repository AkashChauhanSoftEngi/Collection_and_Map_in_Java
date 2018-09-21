package com.project.java.map.api;

import java.util.concurrent.ConcurrentHashMap;

/*
 * -Implementation of ConcurrentMap interface (underlying DS is Hash table)
 * -Provides Thread safety without locking or blocking resources [but segment locking]
 * -Uses Final and Volatile variables
 * -Faster than hash table, good for Multi Thread application
 * -Read Operations: No locking mechanism, multiple threads are allowed
 * -Write/Update Operations: Bucket level locking instead of total map locking [16 threads in parallel can write/update by default]
 * -Default size: 16 buckets [Also called concurrency level{locks}]
 * -Default concurrency level: 16
 * -Uses hash buckets {List of HashEntry elements}
 * -2 threads can update the ConcurrentHashMap unless they are not in the same segment
 * -Segment size: no of buckets {depends on concurrency level, it may vary}
 * -Segment is like a mini specialized version of hashtable that contains many buckets
 * -Each segment holds a single lock, thus no two entries in the segment can be updated by more than one thread at a time.
 * -No null value for key and value
 * -Any map can be transfered as parameter and gets converted into CHM.
 * Reference: https://www.youtube.com/watch?v=IUo1Ym-Uj_I
 * */
public class ConcurrentHashMapExample {

	public static void main(String[] args) {
		ConcurrentHashMap<Integer, String> conHashMap = new ConcurrentHashMap<Integer, String>();
		conHashMap.put(1, "A");
		conHashMap.put(2, "B");
		conHashMap.put(3, "C");
		conHashMap.put(4, "D");
		
		/*Java-8 added functions*/
		conHashMap.putIfAbsent(4, "E");
		conHashMap.forEach((k,v)->System.out.println(k + "," + v));
		
		System.out.println("Map: " + conHashMap);
		System.out.println("Keys: ");
		for (Integer key: conHashMap.keySet()){
			System.out.println(key);
		}
	}
}
