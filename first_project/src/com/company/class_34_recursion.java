package com.company;

public class class_34_recursion {
    //Factorial using recursion
    static int factorial_recursive(int n){
        if (n==0 || n==1){
            return 1;
        }else{
            return n*factorial_recursive(n-1);
        }
    }
    //Factorial using iteration
    static int factorial_iterative(int n){
        int product=1;
        if (n==0|| n==1){
            return product;
        }else{
            for (int i=n; i>1; i--){
                product=product*i;
            }
            return product;
        }
    }

    public static void main(String[] args) {
        int n=10;

        System.out.println(factorial_recursive(6));
        System.out.println(factorial_iterative(6));
    }
}
