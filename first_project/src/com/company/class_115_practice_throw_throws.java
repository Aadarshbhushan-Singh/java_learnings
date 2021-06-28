package com.company;

public class class_115_practice_throw_throws {
	public static void main(String[] args) throws Exception {
		int i=10;
		try {
			i=i/2;
			throw new ArithmeticException();
		}catch(ArithmeticException e1)
		{
			System.out.println("Exception handled.");
		}
		show();
	}
	public static void show() throws Exception
	{
		int a=10;
		System.out.println("This is show method.");
		a=a/0;
	}
}
