package com.arraylist.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class LamdaEx {
	public static void main(String[] args) {
		
	/*	List<Integer> num=Arrays.asList(1,2,3,4,5);
	    System.out.println(num);
		int sum=num.stream().reduce(0,(a,b)->a+b);
		System.out.println(sum);*/
	//	==================================================================
//		List<String> fruits=Arrays.asList("mango","grapes","oranges","melons");
//		List<Integer>len= fruits.stream().map(s->s.length()).collect(Collectors.toList());
//		System.out.println(len);
		//==================================================
//		Runnable r=()->{ // 
//			for(int i=0;i<10;i++) {
//				System.out.println("hello world");
//			}
//		};
//		Thread t= new Thread(r);
//		t.start();
//	
//     ===================================================================
//		List<Integer>num= Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
//         List<Integer> evenum=num.stream().filter(i->i%2==0).collect(Collectors.toList());
//         System.out.println(evenum);
		
		List<String> list= Arrays.asList("apple","banana","oranges","melons","grapes");
		list.sort((s1,s2)->s1.compareTo(s2));
		System.out.println(list);
		System.out.println("Hello");
	}		
}
