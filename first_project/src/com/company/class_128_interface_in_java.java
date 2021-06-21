package com.company;

/*
 * 1. Interface cannot have normal methods in it like abstract class.
 * 2. If we want to declare methods in interface, we have to declare it default. 
 * 3. In abstract class we can extend only one i.e abstract class doesn't support multiple inheritance.
 * 4. But in interface we can implement more than one interface in single class like in example shown below. 
 * 5. If we override default method in interface, then overridden method will be called while making objects. 
 * */

interface interface1{
	default void eat() {
		System.out.println("Eating interface...");
	};
	default void bark() {
		System.out.println("Barking Interface...");
	};
	void sleep();
}

interface interface2{
	void sayHello();
	void goodMorning();
}

class implement1 implements interface1, interface2
{
//	public void eat() {
//		System.out.println("Eating...");
//	};
	
	public void bark() {
		System.out.println("Barking...");
	}
	
	public void sleep() {
		System.out.println("Sleleping...");
	}
	
	public void sayHello() {
		System.out.println("Hello...");
	}
	
	public void goodMorning() {
		System.out.println("Good Morning...");
	}
}

public class class_128_interface_in_java {
	public static void main(String[] args) {
		implement1 obj1=new implement1();
		obj1.sleep();
		obj1.bark();
		obj1.eat();
		
		obj1.sayHello();
		obj1.goodMorning();
	}
}
