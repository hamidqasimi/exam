package com.practice4;

import java.util.Scanner;

public class Taks38 {

	public static void main(String[] args) {
		
		 // Prompt user with a question: "Is it weekend?"
		 //If it is not a weekend --> subject="Manual testing"
			//Otherwise --> subject="Java"


		 Scanner scan=new Scanner(System.in);
		  System.out.println("Is it weekend?");
		  
		  int num=5;
	
		  num=scan.nextInt();
		  if(num==7){
		    System.out.println("Manual testing");
		  } else if (num<7) {
			  System.out.println("Java");
		  } else {
			  System.out.println("Today you will be learning Java");
		  }
	}

}
