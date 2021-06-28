package com.company;
import java.util.Scanner;
public class class_40_cyclic_right_shift {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        //Make array and take input
        System.out.println("Enter the number of elements in array1: ");
        int n=sc.nextInt();
        int[] array1=new int[n];
        for (int i=0; i<n; i++){
            array1[i]=sc.nextInt();
        }
        //Take m input
        System.out.println("Enter the shift number: ");
        int m=sc.nextInt();
        int[] array2=new int[n];
        //Cyclic right shift
        int i=0;
        int count=0;
        for(i=0; i<n; i++){
            if(i<n-m){
                array2[i+m]=array1[i];
            }else{
                array2[count]=array1[i];
                count+=1;
            }
        }
        for(int ele: array2){
            System.out.println(ele);
        }

    }
}
