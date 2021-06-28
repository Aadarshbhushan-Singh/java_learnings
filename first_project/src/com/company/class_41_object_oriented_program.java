package com.company;
import java.util.Scanner;
//One java class can have only one public class
class employee{
	int id;
	String name;
	//Creating function in class
	public void printDetails(){
		System.out.println("My id is: "+id);
		System.out.println("My name is: "+name);
	}
}

class car{
	int serialNo;
	String brand;
	String adress;
	public void getDetails(){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter serial number for this object: ");
		serialNo=sc.nextInt();
		System.out.println("Enter brand for this object: ");
		brand=sc.next();
		System.out.println("Enter adress: ");
		adress=sc.next();
	}
	public void printDetails(){
		System.out.println(serialNo);
		System.out.println(brand);
		System.out.println(adress);
	}

}
public class class_41_object_oriented_program {
	public static void main(String[] args) {
		//Creating object for employee class
		employee aadarsh=new employee();

		//Setting the attribute or property for the object
		aadarsh.id=12345;
		aadarsh.name="Aadarsh";

		//Printing the attribute
		System.out.println(aadarsh.id);
		System.out.println(aadarsh.name);

		//Calling the method in class
		aadarsh.printDetails();

		//Creating another object
		employee john=new employee();
		//Setting attribute
		john.id=324;
		john.name="John";
		//Calling print function in class
		john.printDetails();

		//Creatint object of car class
		car obj1=new car();
		obj1.getDetails();
		obj1.printDetails();
	}
}
