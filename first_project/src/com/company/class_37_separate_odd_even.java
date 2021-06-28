package com.company;

public class class_37_separate_odd_even {
	//Printing array
	static void printArray(int []arrayInput) {
		System.out.println("New array from here: ");
		for (int j : arrayInput) {
			System.out.println(j);
		}
	}
	//Sepraate the array
	static void separate(int []arrayMixed, int x, int y) {
		int []arrayEven=new int[x];
		int []arrayOdd=new int[y];
		int countEven = 0;
		int countOdd = 0;
		for (int j : arrayMixed) {
			if (j % 2 == 0) {
				arrayEven[countEven] = j;
				countEven += 1;
			} else {
				arrayOdd[countOdd] = j;
				countOdd += 1;
			}
		}
		printArray(arrayEven);
		printArray(arrayOdd);
				
	}
	
	public static void main(String[] args) {
		int []arrayMixed= {1,2,3,4,5,10,12,13,14,45,78,98,69};
		int x=0,y=0;
		//Count the number of odds and even
		for (int j : arrayMixed) {
			if (j % 2 == 0) {
				x += 1;
			} else {
				y += 1;
			}
		}
		System.out.println("X: "+x+" Y: "+y);
		separate(arrayMixed,x,y);
		
	}

}
