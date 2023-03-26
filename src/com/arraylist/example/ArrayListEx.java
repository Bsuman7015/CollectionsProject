package com.arraylist.example;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Currency;
import java.util.Iterator;
import java.util.LinkedList;

public class ArrayListEx  {
	public static void main(String[] args) {
		LinkedList<Integer> list= new LinkedList<>();
		list.add(10);
		list.add(60);
		list.add(80);
		list.add(55);
		list.add(66);
		
		System.out.println(list);
		System.out.println("********************");
		
		for(Object obj:list) 
			System.out.println(obj);
		System.out.println("*********1111*************");
		list.remove(66);
		System.out.println(list);
		System.out.println("*********2222*****************");
		Iterator iterator= list.iterator();
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		 
		
		
	}
		
}


