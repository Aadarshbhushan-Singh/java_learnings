package com.company;

//Static block executes before main block doesn't matter how many static block are there
//And also position of static block doesn't matter
public class class_67_static_block {
	
	static 
	{
		System.out.println("In static 01.");
	}
	static String s="";
	static
	{
		s="Hello world";
	}
	public static void main(String[] args)
	{
		System.out.println("In main.");
		System.out.println("The value of s is: "+s);
	}
	
	static 
	{
		System.out.println("In static 02.");
	}
	
	//To initialize static variable we use static block
	
}
