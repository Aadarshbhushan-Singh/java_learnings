package com.company;
/*
Throwable class 
		- extended by Exception class (That can be handled.)
				- checked Exception (Editor knows and will tell this is the exception.)
				 		- IOException
				 		- SQLException
				- unchecked Exception (Editor also doesn't know about the exception.)
						- Runtime Exception
						      - FileNotFound
						      - ArrayIndexOutOfBound etc...
		- extended by Error (That cannot be handled.)
 */
public class class_71_exception1 {
	public static void main(String[] args) {
		int i=10;
		int j=0;
		//Unchecked Exception
		try {
			int rem=i/j;
		}
		catch(Exception a) {
//			System.out.println("Exception found: "+a);
			System.out.println("Exception found: Cannot Divide by Zero.");
		}
		
		System.out.println("Remainder is: ");
	}
}
