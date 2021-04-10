package com.practice2;

import java.util.ArrayList;

public class Main {

	 public static void main (String [] args){
		    
		 ArrayList<String>car=new ArrayList<>();
		 car.add("Nissan");
		 car.add("Honda");
		 car.add("Acura");
		 car.add("Luxus");
		 
		 for(String cars:car) {
			 System.out.println(cars);
		 }
		 System.out.println("----------------");
		 for(int a=0;a<car.size();a++) {
			 System.out.println(car.get(a));
		 }
			 
		 
		  }
		}