package com.company;

public class class_20_swapping_of_variables {
    public static void main(String[] args) {
        int a=10, b=20, c=30;
        System.out.println("Before Swapping: ");
        System.out.println("A:"+a+" B:"+b+" C:"+c);
        int temp;
        temp=a;
        a=b;
        b=c;
        c=temp;
        System.out.println("After Swapping: ");
        System.out.println("A:"+a+" B:"+b+" C:"+c);
        /* *
        *
        * Use this for swapping any kind of number
        * t=a;
        * a=b;
        * b=c;
        * c=d;
        * d=e;
        * e=t;
        * Code to swap 'x' and 'y'
        * x = x + y; -> x now becomes 15
        * y = x - y; -> y becomes 10
        * x = x - y; -> x becomes 5
        *
        * */
    }
}
