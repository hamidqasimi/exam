package com.practice6;

import java.util.Scanner;

public class Main {
		
	 public static void main(String[] args){
		 Main ob=new Main();
		 ob.number();
		 
		}    
//		       Create a final method. the final method should have no return type.
//				 What i want for you to do is in the final method create logic to reverse 2 numbers.
//				 for instance a=12 and b =10. i want b to have the value of 12 and a to have the value of 10.
//				 DO NOT REASSIGN the values, you must create logic where they both swap numbers
//				 THIS IS A SCANNER INPUT.
		 
		 
		 public final void number() {
			 
			 Scanner sc=new Scanner(System.in);
			 int a=sc.nextInt();
			 int b=sc.nextInt();
			 
			 a=a+b;
			 b=a-b;
			 a=a-b;
		 
		 System.out.println("assing number for a is "+a);
		 System.out.println("asing number for is is "+b);
		 
		 
		 
		 
		 
		 
		 
		 
	 }}