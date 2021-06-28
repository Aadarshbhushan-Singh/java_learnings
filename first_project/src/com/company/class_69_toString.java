package com.company;

public class class_69_toString {
	public static void main(String[] args) {
		learnString obj1=new learnString(12, "Aadarsh");
		System.out.println(obj1); //When we try to print an object automatically toString() method is called from class Object.
	}

}

class learnString{ /* Every class automatically extends to class Object which has toString() method.*/
	int rollNo;
	String name;
	public learnString(int rollNo, String name) {
		this.rollNo=rollNo;
		this.name=name;
	}
	@Override
	public String toString() {
		return rollNo+" : "+name;
	}
	
	
}
