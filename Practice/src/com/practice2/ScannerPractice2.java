package com.practice2;

import java.util.Scanner;

public class ScannerPractice2 {
	
	public static void main (String args[]) {
		// Ask user to enter 2 numbers and then compare which one is bigger
		
		Scanner keyboard=new Scanner(System.in);
		System.out.println("Please First Number");
		int num=keyboard.nextInt();
		System.out.println("Please Enter Secondnumber");
		int num1=keyboard.nextInt();
		if (num>num1) {
			System.out.println(num+" is larger than "+num1);
		} else if (num==num1) {
			System.out.println(num+" is equal to "+num1);
		}	
		else {System.out.println(num+ " is smaller than "+num1);
		
		
		 }	
		
		
		
		
		
	
	
	
	
	
	

}
}