package com.practice4;

import java.util.Scanner;

public class Task1 {

	public static void main(String[] args) {
		
		
		/*For you to do:
          Prompt user to input two strings : "Please enter two strings"and two integers: "Please enter two numbers"  
          and make the comparisons:
          if int1 and int2 are equal and word1 and word2 are equal, output "AND"
          if int1 and int2 are equal or word1 and word2 are equal, output "OR"
          if int1 and int2 are not equal and word1 and word2 are not equal, output "NONE"
		 */
		
		Scanner wor;
		  wor=new Scanner(System.in);
		  System.out.println("Please enter two strings name");
		  
		  String name=wor.nextLine();
		  String name1=wor.nextLine();
		  System.out.println("Please enter two numbers");
		  int num=wor.nextInt();
		  int num1=wor.nextInt();
		
		if (num==num1 && name.equals(name1)) {
			System.out.println("AND");
		}else if (num==num1 ||name.equals(name1)) {
			System.out.println("OR");
		} else if (!(name.equals(name1) && num!=num1) ){
			System.out.println("NONE");
		} 
	}
	{

		
		/// the way teacher has done it 
Scanner scan;
int int1, int2;
String word1, word2;

scan = new Scanner(System.in);
System.out.println("Please enter two strings");
word1=scan.nextLine();
word2=scan.nextLine();

System.out.println("Please enter two numbers");
int1=scan.nextInt();
int2=scan.nextInt();

	if(word1.equals(word2) && int1==int2) {
		  System.out.println("AND");
	}else if (word1.equals(word2) || int1==int2){
	  System.out.println("OR");
	}else if (!(word1.equals(word2)) && int1!=int2){
	  System.out.println("NONE");
	}
	}
	}
		
		
		
	


