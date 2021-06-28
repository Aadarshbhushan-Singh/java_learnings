package com.company;
import java.sql.SQLOutput;
import java.util.Scanner;
public class class_28_practice_valid_password {
    static int checkDigit(String password){
        int count=0;
        for (int i=0; i<password.length(); i++){
            if (Character.isDigit(password.charAt(i))){
                count+=1;
            }
        }
        return count;
    }
    static boolean checkValidity(String password){
        String regex="[a-zA-Z0-9]+";
        if (password.length()<8){
            return false;
        }else if (!password.matches(regex)){
            return false;
        }else if(checkDigit(password)<2){
            return false;
        }
        return true;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the password: ");
        String password=sc.next();
        if (!checkValidity(password)){
            System.out.println("Invalid!");
        }else if (checkValidity(password)){
            System.out.println("Valid!");
        }
//        System.out.println(checkDigit("a345asd1af"));
    }
}
