package com.company;
import java.util.Scanner;

class Telephone{
	Scanner sc=new Scanner(System.in);
	
	long mobile_id;
	String model_name;
	int available_quantity;
	
	public void get() {
		System.out.println("Enter details for Telephone: ");
		System.out.println("Mobile_id: ");
		mobile_id=sc.nextLong();
		
		System.out.println("Model Name: ");
		model_name=sc.next();
		
		System.out.println("Available Quantity: ");
		available_quantity=sc.nextInt();		
	}
	
	public void sort_mobile_id() {
		
	}
	
	void display() {
		
		System.out.println("Mobile_id: "+mobile_id);
		System.out.println("Model_name: "+model_name);
		System.out.println("Available Quantity: "+available_quantity);
		
	}
}

class SmartPhone{
	Scanner sc=new Scanner(System.in);
	
	long mobile_id;
	boolean enable_5G;
	boolean foldable;
	boolean dual_screen;
	
	void get() {
		System.out.println("Enter details for Smart Phone: ");
		System.out.println("Mobile_id: ");
		mobile_id=sc.nextLong();
		
		System.out.println("Enable 5G: ");
		enable_5G=sc.nextBoolean();
		
		System.out.println("Foldable: ");
		foldable=sc.nextBoolean();
		
		System.out.println("Dual Screen: ");
		dual_screen=sc.nextBoolean();
	}
	
	void display() {
		System.out.println("Mobile_id: "+mobile_id);
		System.out.println("Enable 5G: "+enable_5G);
		System.out.println("Foldable: "+foldable);
		System.out.println("Dual Screen: "+dual_screen);
	}
}

public class Class_131_Rohit_Friend_Qeustion {
	public static void main(String[] args) {
		Telephone[] obj=new Telephone[5];
		try {
			for(int i=0; i<5; i++) {
				obj[i]=new Telephone();
				obj[i].get();
				obj[i].display();
			}
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
		
		
		SmartPhone[] obj2=new SmartPhone[5];
		try {
			for(int i=0; i<5; i++) {
				obj2[i]=new SmartPhone();
				obj2[i].get();
				obj2[i].display();
			}
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
		
		
		
	}
}
