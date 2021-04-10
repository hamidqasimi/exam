package com.practice4;

public class Practice21 {

	public static void main(String[] args) {

		int [] num= {0,100,300,400,500,600,700,800,900,100,110};
		
		int sum=0;
		
		for(int a=0; a<num.length;a++) {
			sum=sum+num[a];
		}
		
			System.out.println(sum);
			
			
			System.out.println("___________________________________________________-");
			
			String [] name= {"hamid","Jawed","Mike","Farid"};
			
			System.out.println(name.length);
			
			for(int g=0;g<name.length;g++) {
				System.out.print(name[g]+" ");
			}
			
			
		
	}

}
