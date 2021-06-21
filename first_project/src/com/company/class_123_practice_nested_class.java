package com.company;
final class OuterClass{
	int x=10;
	
	void printOuter()
	{
		System.out.println("This is outer class.");
		final int z=30;
		System.out.println("Z: "+z);
		
	}
	
	class InnerClass{
		int y=20;
		void printInner()
		{
			System.out.println("This is inner class.");
		}
	}
	
}


class newClass extends OuterClass{
	
}

public class class_123_practice_nested_class {
	public static void main(String[] args) {
		OuterClass obj1=new OuterClass();
		System.out.println("X: "+obj1.x);
		obj1.printOuter();
		
		OuterClass obj3=new OuterClass();
		obj3.printOuter();
		
		OuterClass.InnerClass obj4=obj3.new InnerClass();
		obj4.printInner();
		
		
		OuterClass.InnerClass obj2=obj1.new InnerClass();
		System.out.println("Y: "+obj2.y);
		obj2.printInner();
		
		
	}
}
