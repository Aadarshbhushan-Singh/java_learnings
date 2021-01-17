package com.company;

public class class_39_repeat_a_number_using_recursion {
    static void repeatNumber(int x, int n){
        if(n>=1){
            System.out.println(x);
            n=n-1;
            repeatNumber(x, n);
        }
    }
    public static void main(String[] args) {
        repeatNumber(4,6);
        repeatNumber(2,3);
    }
}
