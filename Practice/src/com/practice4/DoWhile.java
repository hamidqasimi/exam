package com.practice4;

import java.util.Scanner;

public class DoWhile {

	public static void main(String[] args) {
		/*let's ask user to enter if it is raining or not (true or false)
		 * as long as there is rain let is tell user to take an umbrella
		 * as long as there is not rain -->  you can go to the park
		 * 
		 */
		 
		Scanner scan=new Scanner(System.in);
		boolean ra=true;
		
		 do {
			 System.out.println("Is it Raning?");
			 ra=scan.nextBoolean();
		 }   while (ra); 
			 System.out.println("you can go out now ");
		 }
		 
		 }
	

		 
		 
