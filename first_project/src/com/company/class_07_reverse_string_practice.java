package com.company;
import java.util.Scanner;
public class class_07_reverse_string_practice {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the string: ");
        String word=sc.next();
        int length=word.length();	
        int index=length-1;
        System.out.println("Reversed word is: ");
        for (int i=length; i>0; i--){
            System.out.print(word.charAt(index));
            index=index-1;
        }



    }
}
