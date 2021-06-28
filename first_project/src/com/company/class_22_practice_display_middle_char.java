package com.company;
import java.util.*;
public class class_22_practice_display_middle_char {
    static void getMiddle(String str){
        int len=str.length();
        if (len%2==0){
            System.out.println(str.charAt(len/2-1)+" "+str.charAt(len/2));
        }else if (len%2!=0){
            System.out.println(str.charAt(len/2));
        }
    }

    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String str;
        System.out.println("Enter the string: ");
        str=sc.next();
        getMiddle(str);
    }
}
