package com.company;
import java.util.Scanner;
public class class_25_display_sum_of_digits {
    static boolean checkInt(String str){
        if (str==null){
            return false;
        }
        try {
            double d = Double.parseDouble(str);
        } catch (NumberFormatException nfe) {
            return false;
        }
        return true;
    }
    static void getSum(String str){
        int sum=0;
        for (int i=0; i<str.length(); i++){
            char ele=str.charAt(i);
            sum=sum+Character.getNumericValue((ele));
        }
        System.out.println("Sum is: "+sum);
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number: ");
        String str=sc.next();
        if (checkInt(str) == true){
            getSum(str);
        }else{
            System.out.println("Invalid Input!");
        }
    }
}
