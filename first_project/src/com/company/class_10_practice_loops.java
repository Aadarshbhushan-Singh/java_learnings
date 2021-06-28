package com.company;
import java.util.Scanner;

public class class_10_practice_loops {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        //Practice Question. 01 -- Printing pattern
//        int num;
//        System.out.println("Enter the number of lines: ");
//        num=sc.nextInt();
//        for (int i=num; i>0; i--){
//            for (int j=0; j<i; j++){
//                System.out.print("*");
//            }
//            System.out.print("\n");
//        }

        //Practice Question. 02 -- Sum of first n even numbers
//        int n;
//        System.out.println("Enter the number: ");
//        n=sc.nextInt();
//        int sum=0;
//        for (int i=0; i<n*2; i=i+2){
//            sum=sum+i;
//        }
//        System.out.println("Sum is: "+sum);

        //Practice Question: 03 -- Print the multiplication of given number n
//        int n;
//        System.out.println("Enter number to print multiplication table: ");
//        n=sc.nextInt();
//        for (int i=1; i<11; i++){
//            System.out.println( n + " * " + i +  " = "+ n*i);
//        }

        //Practice Question: 04 -- Find the factorial of the given number.
        int n;
        System.out.println("Enter the number for factorial: ");
        n=sc.nextInt();
        int factorial=1;
        //For loop
//        if (n==0 || n==1){
//            System.out.println("Factorial is 01.");
//        }else{
//            for (int i=n; i>1; i--){
//                factorial=factorial*i;
//            }
//        }
//        System.out.println("Factorial is: "+factorial);

        //While Loop
        while(n>1){
            factorial=factorial*n;
            n--;
        }
        System.out.println("Factorial is: "+factorial);
    }
}
