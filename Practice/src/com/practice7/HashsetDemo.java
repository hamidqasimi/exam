package com.practice7;

import java.util.HashSet;
import java.util.Iterator;

public class HashsetDemo {

	public static void main(String[] args) {

		HashSet<String> set=new HashSet<>();
		set.add("Hamid");
		set.add("Jawed");
		set.add("Farid");
		set.add("Masood");
		set.add("Zabee");
		set.add("Hamza");
		
		System.out.println(set.size());
		
		Iterator<String> it=set.iterator();
		while(it.hasNext()) {
			String el=it.next();
			System.out.println(el);
		}
System.out.println("------------------------------");
		for(String ele:set) {
			System.out.println(ele);
		}
	
		
	}

}
