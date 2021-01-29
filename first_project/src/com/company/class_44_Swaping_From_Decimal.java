package com.company;
import java.sql.SQLOutput;
import java.util.Scanner;
public class class_44_Swaping_From_Decimal {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the float number: ");
        float n=sc.nextFloat();
        String nString=Float.toString(n);
        String[] arrOfStr=nString.split("\\.",0);
        System.out.println(arrOfStr[1]+"."+arrOfStr[0]);



    }
}
