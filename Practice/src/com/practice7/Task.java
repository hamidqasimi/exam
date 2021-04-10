package com.practice7;


	import java.util.*;
	class Task {
	public static void main(String[]args){
	  List<Boolean> listA=new ArrayList<>();
	  listA.add(true);
	  listA.add(false);
	  listA.add(false);
	  
	  List<Boolean> listB=new ArrayList<>();
	  for(int a=0;a<2;a++){
	    for(int b=0;b<listA.size();b++){
	      listB.add(listA.get(b));
	    }
	  }
	  System.out.println(listB);
	}
	}
