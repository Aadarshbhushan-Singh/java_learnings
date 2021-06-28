package com.company;
import java.util.Scanner;
public class class_80_practice_string {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter first name: ");
		String firstName=sc.next();
		System.out.println("Enter last name: ");
		String lastName=sc.next();
		String fullName=firstName.concat(lastName);
		System.out.println("Your Full Name is: "+fullName);
		
		System.out.println("Character at 5th place of Full Name is: "+fullName.charAt(4));
		
		System.out.println("\nString Comparison: ");
		System.out.println("Enter the strings: ");
		String str1=sc.next();
		String str2=sc.next();
		int bool=str1.compareTo(str2);
		System.out.println("String equal: "+bool);
		
		System.out.println("---Comparison using ignoring case---");
		String str3="apple";
		String str4="APPLE";
		System.out.println("Comparison of "+str3+" and "+str4+" "+ " ignoring case: "+str3.compareToIgnoreCase(str4));
		
		System.out.println("Index of: A in string is: "+str4.indexOf('E'));
		
		System.out.println("Length of \""+str3+"\" is "+ str3.length());
		
		System.out.println("Replace \"A\" with \"H\": "+str4.replace('A', 'H'));
		
		System.out.println("Substring is: "+str4.substring(0, 3));
		
		System.out.println("Converting to lowercase: "+str4.toLowerCase());
		System.out.println("Converting to uppercase: "+str3.toUpperCase());
		
		
		
		
		
		
		
	}
}
