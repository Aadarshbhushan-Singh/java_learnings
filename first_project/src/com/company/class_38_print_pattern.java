package com.company;

public class class_38_print_pattern {
    static void printPattern(int n){
        for (int i=1; i<=n; i++){
            for (int j=1; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    static void printPatternInverse(int n){
        for (int i=n; i>=1; i--){
            for (int j=1; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void main(String[] args){
        int n=10;
        printPattern(n);
        printPatternInverse(n);
    }
}
