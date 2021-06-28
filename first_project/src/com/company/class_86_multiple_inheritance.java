package com.company;

class C{
	public void showC()
	{
		System.out.println("This is showC() method of class C.");
	}
}
class D extends C{
	public void showD()
	{
		System.out.println("This is showD() method of class D.");
	}
}
class E extends D{
	public void showE ()
	{
		System.out.println("This is showE method of class E.");
	}
}
public class class_86_multiple_inheritance {
	public static void main(String[] args)
	{
		System.out.println("This is class C.");
		C obj1=new C();
		obj1.showC();
		
		System.out.println("\nThis is class D.");
		D obj2=new D();
		obj2.showC();
		obj2.showD();
		
		System.out.println("\nThis is class E.");
		E obj3=new E();
		obj3.showC();
		obj3.showD();
		obj3.showE();
	}
}
