package com.company;
import java.util.Scanner;
public class class_81_palindrome_string {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the string: ");
		String str1=sc.next();
		String str2="";
		for(int i=str1.length()-1; i>=0; i--) {
			str2=str2+str1.charAt(i);
		}
		System.out.println("Reverse string is: "+str2);
		
		if(str2.compareTo(str1)==0) {
			System.out.println("It is palindrome.");
		}else {
			System.out.println("It is not palindrome.");
		}
	}
}
