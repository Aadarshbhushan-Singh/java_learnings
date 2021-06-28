package com.company;

class Outside
{
	int a=10;
	
	class Inside
	{
		int b=20;
	}
	
	static class staticInside
	{
		int c=30;
	}
}

public class class_109_inner_class {
	public static void main(String[] args) {
		
		//General method of calling nested class.
		Outside o=new Outside();
		Outside.Inside i=o.new Inside();
		System.out.println(o.a+" "+i.b);
		
		//but if we have static class in class, the process of calling class is different.
		
		Outside.staticInside i2=new Outside.staticInside();
		System.out.println("i: "+i2.c);
		
	}
}
