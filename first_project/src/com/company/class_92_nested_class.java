package com.company;
class outer
{
	public void show()
	{
		System.out.println("This is outer class and show method.");
	}
	class inner
	{
		public void display()
		{
			System.out.println("This is inner class.");
		}
	}
}

class outer1
{
	static int a=10;
	public static void show1()
	{
		System.out.println("A: "+a);
		System.out.println("Inside outer class");
	}
	static class inner1
	{
		public static void display()
		{
			System.out.println("A: "+a);
			System.out.println("Inside outer class");
		}
	}
}

class outer2
{
	void myMethod()
	{
		int num=25;
		class inner2
		{
			public void print()
			{
				System.out.println("This is inner class with num: "+num);
			}
		}
		inner2 ob=new inner2();
		ob.print();
	}
}
public class class_92_nested_class {
	public static void main(String[] args)
	{
		outer obj1=new outer();
		outer.inner obj2=obj1.new inner();
		obj2.display();
		
		outer1 obj3=new outer1();
		outer1.inner1 obj4=new outer1.inner1();
		obj4.display();
		
		outer2 obj5=new outer2();
		obj5.myMethod();
	}
}
