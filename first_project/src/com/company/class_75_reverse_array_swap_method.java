package com.company;
import java.util.Scanner;

public class class_75_reverse_array_swap_method {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of elements in array: ");
		int n=sc.nextInt();
		int[] array=new int[n];
		
		//Taking array element input
		for(int i=0; i<n; i++) {
			array[i]=sc.nextInt();
		}
		
		//Pass array into function
		reverseArray(array);
		printArray(array);
		
		sc.close();
		
	}
	static void reverseArray(int[] array) {
		int len=array.length;
		int temp, ind=0, swapInd=len-1;
		while(ind<=swapInd) {
			temp=array[ind];
			array[ind]=array[swapInd];
			array[swapInd]=temp;
			ind++;
			swapInd--;
		}
	}
	static void printArray(int[] array) {
		System.out.println("Reversed Array: ");
		for(int i=0; i<array.length; i++) {
			System.out.println(array[i]);
		}
	}
}
