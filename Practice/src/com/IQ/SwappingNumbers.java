package com.IQ;

public class SwappingNumbers {
	public static void main(String[]args) {
	int a=10;
	int b=20;
	System.out.println(a);
	System.out.println(b);
	a=a+b;
	b=a-b;
	a=a-b;
	System.out.println(a);
	System.out.println(b);
	String x="You";
	String y="Love";
	System.out.println(x);
	System.out.println(y);
	   x=x+y;
	   y=x.substring(0,x.length()-y.length());
	   x=x.substring(y.length());
	   
		System.out.println(x);
		System.out.println(y);

	
	
	 
}
}
