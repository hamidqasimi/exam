package com.practice1;

import java.util.Scanner;

public class Task99 {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		  System.out.println("Enter the browser name to proceed further with execution");
		   String browser = sc.nextLine(); 
		  
		   if(browser.equalsIgnoreCase("Chrome")){
		     System.out.println("Proceed with Chrom");    
		     }else if(browser.equalsIgnoreCase("FireFOx")){
		       System.out.println("Proceed with FIreFox");
		     }else if (browser.equalsIgnoreCase("IE")){
		       System.out.println("Proceed with IE browser");
		     } else{
		       System.out.println("Bro baba elaima ko ");
		     }
		       
		  }
		
	}


