package com.arraylist.example;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class MapExample {
	public static void main(String[] args) {
		Map<String, Integer> map= new HashMap<>();
		map.put("apple", 1);
		map.put("banana", 2);
		map.put("orange", 3);
	
		//System.out.println(map.entrySet());
		
		for(Map.Entry<String, Integer>entry: map.entrySet()) {
			String keyString=entry.getKey();
			int value=entry.getValue();
			System.out.println(keyString +" "+value);
		}
		System.out.println("---------------------------------");
		
		boolean containsKey=map.containsKey("apple");
		System.out.println(containsKey);
		
		System.out.println("====================================");
		
		boolean containsValue=map.containsValue(3);
		System.out.println(containsValue);
		
		map.put("melons", 4);
		map.put("grapes", 5);
		map.put("figs",6);
		
		int rem=map.remove("figs");
		System.out.println(map);
		
		int size=map.size();
		System.out.println(size);
	}
}
