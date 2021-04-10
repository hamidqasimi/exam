package com.practice4;

import java.util.Scanner;

public class Task3 {

		  
	public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);
        System.out.println("Do you need a loan?");
        boolean loan = scan.nextBoolean();
        String eligi;
        int score;
        
        if (loan) {
            System.out.println("What is your credit score?");
            score = scan.nextInt();
            
            if (score<600) {
                eligi = "Not eligible";
           } else if (score>=600 &&score<=700) {
                eligi = "Maybe eligible";
            } else if (score >700 && score<=800) {
                eligi = "Eligible";
            } else if (score >800) {
                eligi = "Definitely eligible";
            } else {
                eligi = "Not eligible";
            }
	        } else {
            eligi = "Unknown";        
	        } System.out.println("The eligibility is " +eligi);
        
    }
}        