package com.arraylist.example;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.jar.Attributes.Name;

public class MapExx {
	public static void main(String[] args) {

		ConcurrentHashMap<String , Integer>cMap= new ConcurrentHashMap<>();
		cMap.put("a", 1);
		cMap.put("b", 2);
		cMap.put("c", 3);
		cMap.put("d", 4);
		cMap.put("e", 5);
		cMap.put("f", 6);
		cMap.put("g", 7);
		cMap.put("h", 8);
		cMap.put("i", 9);
		
		System.out.println(cMap);
	boolean a1=cMap.containsKey("e");
	boolean a2=cMap.containsValue(6);
	boolean a3=cMap.containsValue(55);
	
	System.out.println(a1);
	System.out.println(a2);
	System.out.println(a3);
	System.out.println("*****************");
	
	

	
	cMap.forEach((name,age)->{
		System.out.println(name+" is "+ age +" years old");
	});
	System.out.println("++++++++++++++++++++++++++");
	
 
	
	
	
	

}
}