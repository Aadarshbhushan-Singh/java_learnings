package com.company;
import java.util.Scanner;
public class class_61_palindrome {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int check=num;
        int r,s=0;
        while(num>0){
            r=num%10;
            num=num/10;
            s=s*10+r;
        }
        if(check==s){
            System.out.println("Palindrome Number!");
        }else{
            System.out.println("Not Palindrome Number!");
        }
    }
}
