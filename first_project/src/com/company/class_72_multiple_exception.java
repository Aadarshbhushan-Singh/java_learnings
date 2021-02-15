package com.company;

public class class_72_multiple_exception {
	public static void main(String[] args) {
		int i=10;
		int j=0;
		int rem=0;
		int[] array1=new int[4];
		try {
			rem=j/i;
			for(int c=0; c<=4; c++) {
				array1[c]=c+1;
			}
		}
		catch(ArithmeticException e) {
			System.out.println("Error: divide by zero: "+e);
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("Error: index out of bounds: "+e);
		}
		finally{
			System.out.println("This will be called even if exception doesnot occur or it occurs.");
		}
		System.out.println("The value of rem is: "+rem);
	}
}
