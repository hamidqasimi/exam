package com.practice1;

public class p7 {
	public static void main (String[]args) {
		
		int age = 18;
		 
		if (age>=18) {
			System.out.println(" You are eligible to vote ");
		}else  {
			System.out.println("Please enter your name ");
			if (age<=18) {
				System.out.println("you are not eligible to vote ");
			} else {
				System.out.println("please enter your name ");
			}
		}
		/*  we need to check if the student completed the quiz 
		 * if yes --> good job, if not --> not good 
		 * if they completed we will check the score :
		 * if more than 90--> you got A 
		 * if more than 80 --> you got a B 
		 * anything below --> you should study more */
		 boolean quiz=true;
		 int score=89;
		 if (quiz) {
			 System.out.println("Good job");
		 } else { 
			 System.out.println("not good!!!");
		 }
		
		
		
		
		
		
		
	}
}