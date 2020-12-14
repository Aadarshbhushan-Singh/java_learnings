package com.company;
//Import this class to include System.in
import java.util.Scanner;

public class class_03_getting_user_input {
    public static void main(String[] args){
        System.out.println("hello aadarsh");
        System.out.println("Adding two integers: ");
        //making an object sc of Scanner class
        Scanner sc=new Scanner(System.in);

        //For Integer use nextInt()
        System.out.println("Enter first number: ");
        int a=sc.nextInt();
        System.out.println("Enter second number: ");
        int b=sc.nextInt();
        int sum=a+b;
        System.out.println("The sum of a and b is: "+sum);

        //For float use nextFloat()
        System.out.println("Enter first float number: ");
        float c=sc.nextFloat();
        System.out.println("Enter second number: ");
        float d=sc.nextFloat();
        float sumFloat=c+d;
        System.out.println("The sum of float is: "+sumFloat);

        //hasNextInt() is used to check whether the input in integer or not

        //For stirng
        System.out.println("Enter your name: ");
        String name=sc.next(); //Next returns only the first word and ignores after sapce
        //use nextLine() for reading whole sentence along with space
        System.out.println("Your name is: "+name);

    };
};
