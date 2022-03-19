package com.company;
interface newInterface{
	void eat();
}
public class class_130_practice_inner_class_interface {
	public static void main(String[] args) {
		System.out.println("Hello world");
		newInterface obj2=new newInterface() {
			public void eat(){
				System.out.println("Eating...");
			}
		};
		
		obj2.eat();
	}
}
