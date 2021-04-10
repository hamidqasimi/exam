package com.practice4;

public class Task {
//	Return Type: char
//	Method Name: getChar
//	Parameters:
//	String called "word"
//	Integer called "index"
//
//	Then write your logic on getChar method to Find the character in given String at given index number 
//
//	Examples:
//	getChar("hello",1) ==> 'e'
	public static char getChar(String word,int index) {
		for (int a=0;a<word.length();a++) {
	
   word.charAt(a);
	}
	return word.charAt(index);
	}
	
	public static void main (String[]arsg) {
		System.out.println(getChar("Hello",1));
	}
	
	
}