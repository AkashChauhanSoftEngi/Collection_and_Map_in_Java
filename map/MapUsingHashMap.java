package com.project.java.map.api;

import java.util.HashMap;
import java.util.Map;

/*
 * Implementations classes: HashMap<String, Integer>();
 * No duplicates, overwrite with latest value
 * One Null key and Multiple null values are allowed
 * 
 * Inside Map Interface, there is a another interface called EntrySet<K,V> which is responsible for storing individual pair
 * Map Interface, there is a method called entrySet(), which returns Set<Map.Entry<K, V>>
 * Map Interface, there is a method called keySet(), which return keys {Non-Duplicates} into a Set<K>
 * getKey(), and getValue(), to get individual key and values
 * size grows in power of 2, when capacity * loadfactor reaches to threshold
 * */

public class MapUsingHashMap {

	public static void main(String[] args) {
		Map<String, Integer> map = new HashMap<>(); 
        
        print(map); 
        map.put("vishal", 10); 
        map.put("sachin", 30); 
        map.put("vaibhav", 20);
        map.put("vishal", 40);
        map.put("Vikash", null);
        map.put("gaurav", null);
        map.put(null, 20);//Allow one null key and multiple null values
        map.put(null, 30);//Allow one null key and multiple null values
          
        System.out.println("Size of map is:- " + map.size()); 
      
        print(map); 
        if (map.containsKey("vishal"))  
        { 
            Integer a = map.get("vishal"); 
            System.out.println("value for key \"vishal\" is:- " + a); 
        }  
        print(map);
        map.clear();
        print(map);
	}
	
	public static void print(Map<String, Integer> map)  
    { 
        if (map.isEmpty())  
        { 
            System.out.println("map is empty"); 
        } 
          
        else
        { 
            System.out.println(map); 
        } 
    } 

}
