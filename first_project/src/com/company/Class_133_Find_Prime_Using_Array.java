package com.company;
import java.util.*;

public class Class_133_Find_Prime_Using_Array {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Num: ");
		int num=sc.nextInt();
		
		
//		general method of finding prime till given number
//		if(num==1) {
//			System.out.println(num);
//		}else {
//			for(int i=2; i<=num; i++) {
//				boolean prime=true;
//				for(int j=2; j<i; j++) {
//					if(i%j==0) {
//						prime=false;
//						break;
//					}
//				}
//				if(prime==true) {
//					System.out.println(i+" ");
//				}
//			}
//		}
		
		//Use this array so that there will be less iteration
		ArrayList<Integer> array=new ArrayList<Integer>();	
		for(int i=2; i<=num; i++) {
			boolean prime=true;
			for(int ele: array) {
				if(i%ele==0) {
					prime=false;
					break;
				}
			}
			if(prime==true) {
				array.add(i);
			}
		}
		
		System.out.println(array);
		
		
		
		
		
		
		
	}
}
