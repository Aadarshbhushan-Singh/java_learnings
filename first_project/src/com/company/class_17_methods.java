package com.company;
import java.util.Scanner;

//If the function is outside of the class, it is called function. If it is inside of
//a class, it is called method.

public class class_17_methods {
    static void addition(int a, int b){
      int sum;
      sum=a+b;
      System.out.println("Sum of "+a+" and "+b+" is: "+sum);
    };
    static void difference(int a, int b){
        int difference;
        if(a>b){
            difference=a-b;
        }else{
            difference=b-1;
        }
        System.out.println("The difference of "+a+" and "+b+" is: "+difference);
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int a, b;
        System.out.println("Enter the value of a and b: ");
        a=sc.nextInt();
        b=sc.nextInt();
        addition(a,b);
        difference(a,b);
        addition(34, 56);
        difference(10225, 54478);
    }
}
