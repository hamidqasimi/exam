package com.IQ;

import java.util.Arrays;

public class FindLargestNumberInArray {

	public static void main(String[] args) {
		// write a java program to find the second largest in the array? Maximum and
		// minimum number in the array?
		int [] num= {20,70,80,95,45};
		Arrays.sort(num);
		System.out.println(num[num.length-1]);
		
		// find the largest and the second largest number in the array !
		int[] array = { 1500, 20000, 250, 300, 35, 400, 50000 };
		int l=0;
		int s=0;
		for(int a=0;a<array.length;a++) {
			if(array[a]>l) {
				s=l;
				l=array[a];
				
			}else if (array[a]>s) {
				s=array[a];
				
			}
		}
		System.out.println("The Largest number =" + l + " and second Largest =" + s);
		
		// find the maximum and minimum number in the array!
		
		int [] arr= {-5,40,45,50,555,-3,60,70};
		Arrays.sort(arr);
		int mini=arr[0];
		int maxi=arr[arr.length-1];
		
		System.out.println("The mini num is "+mini+ " and the maxi num is "+maxi);
		
		// Find the number largest and the smallest number in the array 
		
		int [] ar= {-1,2,3,1,4,5000,-6,7,8,1000};
		
		int la=ar[0];
		int sm=ar[0];
		for (int b=0;b<ar.length;b++) {
			if(ar[b] > la) {
				la=ar[b];
				
			}else if (ar[b]<sm) {
				sm=ar[b];
			}
		}
		
		System.out.println("The largest num is "+la+ " and the smallest num is "+sm);
		
		
		
		
		
		

	}
}