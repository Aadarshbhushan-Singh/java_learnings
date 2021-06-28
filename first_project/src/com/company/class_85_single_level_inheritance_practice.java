package com.company;

class A2{
	public void showA()
	{
		System.out.println("This is showA() method of class A.");
	}
}

class B2 extends A2
{
	public void showB()
	{
		System.out.println("This is showB() method of class B.");
	}
}
public class class_85_single_level_inheritance_practice {
	public static void main(String[] args)
	{
		A2 obj1=new A2();
		obj1.showA();
		
		B2 obj2=new B2();
		System.out.println("\nThis is method of A but called from object of B.");
		obj2.showA();
		obj2.showB();
	}
}
