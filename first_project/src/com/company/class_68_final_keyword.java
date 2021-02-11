package com.company;

public class class_68_final_keyword {
	public static void main(String[] args) {
		learnFinal obj1=new learnFinal();
		obj1.show();
		obj1.show2();
	}
}

class learnFinal{
	
	//Final datatype
	final int i=10; //Once we declare final, the value of i cannot be changed
	//i=i+9;  --> This is now allowed
	public void show() {
		System.out.println("The value of i is: "+i);
	}
	
	//final method
	public final void show2() {
		System.out.println("This is show 2 of learnFinal.");
	}
	
}

class learnFinal2 extends learnFinal{
	//Not allowed because show2() is decleared final in superclass.
//	public void show2() {
//		System.out.println("This is show2 of learnFinal2.");
//	}
	
}

final class learnFinal3{
	public void show() {
		System.out.println("This is show from learnFinal3.");
	}
}

//class learnFinal4 extends learnFinal3{} --> Note allowed because class learnFinal3 is declared final