package com.company;
public class class_26_practice_pentagonal_number {
    static void pentagonal(int num){
        num=1;
        while(num<51){
            System.out.print((num*(3*num-1)/2)+" ");
            if (num%10==0){
                System.out.println();
            }
            num+=1;
        }
    }
    public static void main(String[] args){
        //Printing first 50 pentagonal number
        int num=50;
        pentagonal(num);
    }
}
