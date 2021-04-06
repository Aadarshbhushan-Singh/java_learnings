package com.company;

import java.util.Scanner;
class AadarshException extends Exception
{
	public AadarshException(String message)
	{
		super(message); //Use super keyword to pass message.
	}
}

public class class_108_user_defined_exception {
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		try 
		{
			int a=10;
			System.out.println("Enter the value of b: ");
			int b=sc.nextInt();
			int sum=a+b;
			
			if(sum<=20)
			{
				throw new AadarshException("This is Aadarsh Exception."); //Create own class with AadarshException name which extends Exception
			}
			
		}catch(Exception e)
		{
			System.out.println("Error: "+e.getMessage());
		}finally
		{
			System.out.println("Program executed.");
		}
	}
	
}
