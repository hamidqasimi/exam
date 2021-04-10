package com.practice4;

import java.util.Scanner;

public class Taks2 {

	public static void main(String[] args) {
		
		 Scanner input=new Scanner(System.in);
		 System.out.println("Are you thirsty?");
		  boolean bo=input.nextBoolean();
		  System.out.println("Are you sleepy?");
		  boolean bo1=input.nextBoolean();
		  if (bo==true && bo1==false){
		    System.out.println(" Water");
		  }  else if (bo==true && bo1==true){
		    System.out.println("Coffee");
		  } else if (bo==false && bo1==true){
		    System.out.println("Tea");
		  } else {
		  
		     System.out.println("Looks like you need no drink " ); 
		  
		  }
	}


      ///// the way teacher did it 
	{
Scanner scan;
boolean sleepy;
boolean thirsty;
String drink;

scan = new Scanner(System.in);
System.out.println("Are you thirsty?");
thirsty=scan.nextBoolean();
System.out.println("Are you sleepy?");
sleepy=scan.nextBoolean();

if (thirsty && !sleepy) {
	drink="Water";
}else if (thirsty && sleepy){
	drink="Coffee";
}else if (!thirsty && sleepy){
	drink="Tea";
}else {
	drink="Nothing";
}
System.out.println("Looks like you need to drink "+drink);
}
}
		  

