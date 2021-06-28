package com.company;
import java.util.Scanner;

public class class_74_encrypting {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of element: ");
		int num=sc.nextInt();
		int[] array=new int[num+1];
		int sum=0;
		//Take array input
		for(int i=0; i<num; i++) 
		{
			int ele=sc.nextInt();
			sum=sum+ele;
			array[i]=ele;
		}
		System.out.println("Sum is: "+sum);
		int display_sum=sum;
		int final_sum=0;
		while(sum>0) {
			final_sum=final_sum+(sum%10);
			sum=sum/10;
		}
		for(int i=0; i<num; i++)
		{
			array[i]=array[i]+final_sum;
		}
		array[num]=display_sum;
		System.out.println(final_sum);
		printArray(array);
		sc.close();
	}
	static void printArray(int[] array) {
		for(int i=0; i<array.length; i++)
		{
			System.out.println("Element is: "+array[i]);
		}
	}
}
