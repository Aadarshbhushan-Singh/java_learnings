package com.company;
import java.util.Scanner;

abstract class book
{
	Scanner sc=new Scanner(System.in);
	String title;
	abstract void setTitle(String s);
	String getTitle()
	{
		System.out.println("Enter the name of book: ");
		String title=sc.next();
		return title;
	}
}

class book1 extends book{
	void setTitle(String s)
	{
		System.out.println("Book Title: "+s);
	}
}
public class class_87_pranaw_exam {
	public static void main(String[] args) {
		book1 obj1=new book1();
		String s=obj1.getTitle();
		obj1.setTitle(s);
		
	}
}
