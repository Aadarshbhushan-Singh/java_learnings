package com.company;
import java.util.Scanner;
public class class_35_fibonacci_series {
    static int m1=0,m2=1,m3=0;
    static void printFibonacci(int count){
        if(count>0){
            m3 = m1 + m2;
            m1 = m2;
            m2 = m3;
            System.out.print(" "+m3);
            printFibonacci(count-1);
        }
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n=sc.nextInt();
        int count=n;


        //Fibonacci series using iteration
        int n1=1;
        int n2=1;
        int n3=0;
        System.out.print(n1+" "+n2+" ");
        for (int i=0; i<n; i++){
            n3=n1+n2;
            System.out.print(n3+" ");
            n1=n2;
            n2=n3;
        }

        //Fibonacci series using recursion
        System.out.println();
        System.out.print(m2);//printing 0 and 1
        printFibonacci(count+1);//n-2 because 2 numbers are already printed
    }
}
