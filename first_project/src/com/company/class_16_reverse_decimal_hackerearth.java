package com.company;
import java.util.Scanner;
public class class_16_reverse_decimal_hackerearth {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int i;
        double d;
        System.out.println("Enter a decimal number");
        double num = in.nextFloat();
        double n = Math.round(num*100)/100;
        i = (int)n;
        d = n-i;
        System.out.println(d*10+(float)i/10);
//        This is the python code for this problem.
//        n=float(input())
//        temp=1
//        while(True):
//        if(n//temp==0):
//        break
//    else:
//        temp=temp*10
//
//        new_num=int(n)/temp
//        temp=10
//
//        while(True):
//        if((n*temp)%1==0):
//        break
//    else:
//        temp=temp*10
//
//        n=n-int(n)
//                new_num=new_num+temp*n
//        print(new_num)
    }
}
