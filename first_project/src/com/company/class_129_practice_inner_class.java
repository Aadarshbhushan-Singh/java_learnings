package com.company;
class UpperClass{
	int var=10;
	int var1=100;
	//Variable declared in upper class can also be used in inner class.
	void message() {
		System.out.println("Outer Class");
		System.out.println("Var: "+var);
		System.out.println("Var1: "+var);
	}
	class InnerClass{
		void message() {
			int var=20;
			System.out.println("Inner Class");
			System.out.println("Var: "+var);
			System.out.println("Var1: "+var);
		}
	}
}

public class class_129_practice_inner_class {
	public static void main(String[] args) {
		UpperClass obj=new UpperClass();
		obj.message();
		
		UpperClass.InnerClass obj1=obj.new InnerClass();
		obj1.message();
	}
}
