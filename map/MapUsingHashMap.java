package com.project.java.map.api;

import java.util.HashMap;
import java.util.Map;

/*
 * Implementations classes: HashMap<String, Integer>();
 * No duplicates, overwrite with latest value
 * Multiple null values are allowed
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
