package com.company;
import java.io.*;
import java.util.Scanner;

class Donor
{
	Scanner sc=new Scanner(System.in);
	
	String name;
	int age;
	String adress;
	String bloodGroup;
	String date;
	
	public void getDetails()
	{
		System.out.println("Enter details: ");
		name=sc.next();
		age=sc.nextInt();
		adress=sc.next();
		bloodGroup=sc.next();
		date=sc.next();
	}
}

public class class_116_practice_file_handling {
	public static void main(String[] args) throws Exception {
		Donor[] array=new Donor[2];
		 try {
		      File myObj = new File("filename.txt");
		      if (myObj.createNewFile()) {
		        System.out.println("File created: " + myObj.getName());
		      } else {
		        System.out.println("File already exists.");
		      }
		    } catch (IOException e) {
		      System.out.println("An error occurred.");
		      e.printStackTrace();
		    }
		FileWriter f2=new FileWriter("Demofile.txt");
		f2.write("Hello world");
		/*for(int i=0; i<2; i++)
		{
			array[i]=new Donor();
			array[i].getDetails();
			f2.write(array[i].name);
			f2.write(array[i].age);
			f2.write(array[i].adress);
			f2.write(array[i].bloodGroup);
			f2.write(array[i].date);
			
		}*/
		

	}
}
