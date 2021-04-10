package com.practice1;

public class Car {
	String carMake;
	String carModel;
	int carDoors;
	int carSpeed;
	double carPrice;
	Car(String make,String model,int doors,int speed,double price){
	  carMake=make;
	  carModel=model;
	  carDoors=doors;
	  carSpeed=speed;
	  carPrice=price;
	}
	Car(String make,String model,int speed,double price){
		carMake=make;
		  carModel=model;
		  carDoors=4;
		  carSpeed=speed;
		  carPrice=price;
	}  
	Car(int doors,int speed,double price){
	  carMake="unknown";
	  carModel="unknown";
	  carDoors=doors;
	  carPrice=price;
	}
	  Car(String make,String model,int doors){
	    carMake=make;
	  carModel=model;
	  carDoors=doors;
	  carPrice=0;
	  carSpeed=90;
	  }
	  void display(){
	    System.out.println(carMake+" "+carModel+" "+carDoors+" "+carSpeed+" "+carPrice);
	  }
	  
	}
	  
	  
	  
	  


