package com.practice3;

import java.util.Scanner;

public class homework1 {
public static void main (String args[]) {
	
	
	
	Scanner chen = new Scanner(System.in);
  	System.out.print("In:");
  	String name = chen.nextLine();
  	//DO NOT CHANGE ABOVE CODE!  Write your code below
  String name1=chen.nextLine ();
   
  	if (name.equals("Chen")) { System.out.println("Teacher"); 
  	
  	
  	} else  { System.out.println("Student");
	
  	}
	 
  	int a=400;  
	int b=250;  
	int c=a+b; 
	int d=100;
	System.out.println(a>d&&b>d);
	System.out.println(c>d);
	
	
	
}
}
