package com.project.java.map.api;

import java.util.AbstractMap;
import java.util.TreeMap;

public class MapUsingTreeMap {

	// This function prints ordering of all elements 
    static void insertAndPrint(AbstractMap<Integer, String> map) 
    {  
        int[] array= {1, -1, 0, 2,-2, -2, -1}; 
        for (int x: array)  
        {  
            map.put(x, Integer.toString(x));  
        }  
        for (int k: map.keySet()) 
        { 
            System.out.print(k + ", ");  
        } 
    }  
  
    // Driver method to test above method 
    public static void main (String[] args) 
    { 
        TreeMap<Integer, String> map = new TreeMap<Integer, String>(); 
        insertAndPrint(map); 
    } 

}
