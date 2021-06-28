package com.company;
import java.util.Scanner;
public class class_05_practice_01 {
    public static void main (String[] args){
//        when integer is added to character, integer is returned
//        char grade='B';
//        int final_grade = grade + 8;
//        System.out.println(final_grade);

        //Problem No: 01 --- How to cast into another datatype
//        char grade='B';
//        grade = (char) (grade+8);
//        System.out.println(grade);
//
//        grade=(char) (grade-8);
//        System.out.println(grade);

        //Problem No: 02 -- Use comparison operator to find which number entered by user is greater
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the first number: ");
        int first_number=sc.nextInt();
        System.out.println("Enter the second number: ");
        int second_number=sc.nextInt();
        if (first_number>second_number){
            System.out.println(first_number+" is greater than "+second_number);
        }else if(second_number>first_number){
            System.out.println(second_number+" is greater than "+first_number);
        }else{
            System.out.println("Both numbers are equal.");
        }

    }
}
