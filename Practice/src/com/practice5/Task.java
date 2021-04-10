package com.practice5;

import java.util.Scanner;

public class Task {



	String breed,color,name;
	
	 void bark() {
	    	System.out.println(breed+" can bark ");
	    }
	    
	   void run() {
		   System.out.println(breed+ "can run");
	   }
	   void play() {
		   System.out.println(breed+" can play ");
	   
	   }
	     
	  
	  public static void main(String [] arge){
	    
	    Task dog=new Task();
	    dog.breed="Husky";
	    dog.color="Black";
	    dog.name="Shankar";
	   dog.bark();
	   dog.run();
	   dog.play();
	    
	    Task dog1=new Task();
	    dog1.breed="Buldog";
	    dog1.color="White";
	    dog1.name="Mard";
	  
	    dog1.bark();
		   dog1.run();
		   dog1.play();
	  
	     
	     Task dog2=new Task();
	     dog2.breed="Labrador";
	     dog2.color="Yellow";
	    dog2.name="Anjo";
	    
	    dog2.bark();
		   dog2.run();
		   dog2.play();
	   
	  }}
	    
	    
	    