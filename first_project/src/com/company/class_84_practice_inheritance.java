package com.company;
import java.util.Scanner;
class getNumber
{
	Scanner sc=new Scanner(System.in);
	int a, b;
	public void inputNumbers(){
		System.out.println("This is base class.");
		System.out.println("Enter two numbers: ");
		a=sc.nextInt();
		b=sc.nextInt();
	}
}

class add extends getNumber
{
	public void addNumbers() {
		int sum=a+b;
		System.out.println("The sum is: "+sum);
		System.out.println("This is child class.");
	}
}

class subtract extends getNumber
{
	public void subtractNumbers(){
		int diff=a-b;
		System.out.println("The difference is: "+diff);
		System.out.println("Thsi is child class.");
	}
}
public class class_84_practice_inheritance {
	public static void main(String[] args)
	{
		
		System.out.println("Object of add class.");
		add obj1=new add();
		obj1.inputNumbers();
		obj1.addNumbers();
		
		
		System.out.println("\nObject of subtract class.");
		subtract obj2=new subtract();
		obj2.inputNumbers();
		obj2.subtractNumbers();
	}
	
}
