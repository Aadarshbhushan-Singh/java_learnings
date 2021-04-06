package com.company;

/*
 * Static method or block is called when the class is loaded. So we main the main method static.
 * Static method is called only once when the class is loaded.
 * We cannot call non static datatype in static method from outside.
 * */

class A10{
	int id;
	String name;
	static String ceo="";
	
	static //will be called when class is loaded.
	{
		ceo="CEO";
		System.out.println("In static block.");
	}
	
	public A10()  //will be called when an object of class is made.
	{
		System.out.println("Inside constructor.");
	}
	
	public void show()
	{
		System.out.println("Id: "+id+" Name: "+name);
	}
}

public class class_106_static_keyword {
	public static void main(String[] args)
	{
		A10 obj1=new A10();
		obj1.id=10;
		obj1.name="Aadarsh";
		obj1.show();
		
		A10 obj2=new A10();
		obj2.id=11;
		obj2.name="Niraj";
		obj2.show();
		
		
	}
}
