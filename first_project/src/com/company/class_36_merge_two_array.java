package com.company;

public class class_36_merge_two_array {
	static void mergeArray(int array1[], int array2[]) {
		int lenOne=array1.length;
		int lenTwo=array2.length;
		int finalArray[]=new int[lenOne+lenTwo];
		for (int i=0; i<lenOne; i++) {
			finalArray[i]=array1[i];
		}
		for (int i=0; i<lenTwo; i++) {
			finalArray[i+lenOne]=array2[i];
		}
		for (int ele: finalArray){
			System.out.println(ele);
		}
	}
	
	public static void main(String[] args) {
		int array1[]= {1,2,3,4,5};
		int array2[]= {10,20,30,40,60};

		mergeArray(array1, array2);
		
		
	}

}
