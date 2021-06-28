package com.company;
import java.util.Scanner;
import java.util.*;
public class class_09_convert_decimal_to_binary {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int decimal;
        String binary="";
        System.out.println("Enter the decimal number: ");
        decimal=sc.nextInt();
        if (decimal<0){
            System.out.println("This doesn't calculate negative numbers.");
        }else{
            while(decimal>0){
                if (decimal%2==0){
                    binary=binary+"0";
                    decimal=decimal/2;
                }else{
                    binary=binary+"1";
                    decimal=decimal/2;
                }
            }
            int index=binary.length()-1;
        System.out.print("The required binary number is: ");
        for (int i=binary.length(); i>0; i--){
            System.out.print(binary.charAt(index));
            index=index-1;
        }
        }
    }
}
