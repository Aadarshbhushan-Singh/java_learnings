package com.company;
import java.util.Scanner;
public class class_43_find_sorted_array {
    static void printArray(int[] array){
        System.out.println("Printing array: ");
        for (int j : array) {
            System.out.println(j);
        }
    }

    static boolean findDecreasing(int[] array){
        boolean sorted=true;
        for(int i=0; i<array.length-1; i++){
            if(array[i]>array[i+1]){
                sorted=true;
            }else{
                sorted=false;
                break;
            }
        }
        return sorted;
    }
    static boolean findIncreasing(int[] array){
        boolean sorted=true;
        for(int i=0; i<array.length-1; i++){
            if(array[i]<array[i+1]){
                sorted=true;
            }else{
                sorted=false;
                break;
            }
        }
        return sorted;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of elements in array: ");
        int n=sc.nextInt();
        int []array=new int[n];
        for(int i=0; i<n; i++){
            array[i]=sc.nextInt();
        }
        printArray(array);

        System.out.println(findDecreasing(array));
        System.out.print(findIncreasing(array));

        if(!findDecreasing(array) && !findIncreasing(array)){
            System.out.println("\nNot Sorted!");
        }else{
            System.out.println("\nSorted!");
        }
    }
}
