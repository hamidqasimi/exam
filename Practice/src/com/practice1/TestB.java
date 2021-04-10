package com.practice1;

import java.util.Iterator;
import java.util.LinkedList;


public class TestB {

	public static void main(String[] args) {

LinkedList<String>list=new LinkedList<>();
	
	list.addFirst("Hamid");
	list.add("Jawed");
	list.add("Mandolak");
	list.add("Samandolak");
	System.out.println(list);
	list.add(1,"Jigarak");
	list.set(0, "Qandolak");
	System.out.println(list);
	System.out.println("================first way");
	
	String str=list.get(2);
		System.out.println(str);
		System.out.println("================second way");
		for(int a=0;a<list.size();a++) {
			System.out.print(list.get(a)+" ");
			System.out.println("================third way");
			for(String str1:list) {
				System.out.println(str1);
				System.out.println("======================");
				Iterator<String> it= list.iterator();
				while(it.hasNext()) {
					System.out.println(it.next());
				}
				
			}
			
		}
	}
	}