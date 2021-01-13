package com.company;

public class class_27_practice_printing_characters {
    static void printChar(char char1, char char2, int n){
        for (int i=0; char1<=char2; i++, char1++){
            System.out.print(char1+" ");
            if (i%n==0){
                System.out.println();
            }
        }
    }
    public static void main(String[] args){
        printChar('(', 'z', 20);
    }
}
