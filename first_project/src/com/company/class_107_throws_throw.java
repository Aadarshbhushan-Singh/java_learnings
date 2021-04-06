package com.company;
import java.io.IOException;
import java.util.Scanner;

//throws is used to suppress error or exception and is always written after the method

public class class_107_throws_throw {
	public static void main(String[] args) throws IOException
	{
		Scanner sc=new Scanner(System.in);
		int a=10;
		int b;
		System.out.println("Enter the value of B: ");
		b=sc.nextInt();
		
		try {
			int sum=a+b;
			if(sum<=20)
			{
				throw new ArithmeticException();
			}else {
				System.out.println("Sum is: "+sum);
			}
		}catch(ArithmeticException e)
		{
			System.out.println("The output is less than 20.");
		}finally
		{
			System.out.println("Program terminated.");
		}
	}
	
}
