package com.company;
import java.util.Scanner;

/*
* #####
*  ####
*   ###
*    ##
*     #
*
* */
public class class_58_pranjal_challenge_pattern {

    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=0; i<n; i++){
            for(int j=0; j<i; j++){
                System.out.print(" ");
            }
            for(int j=n; j>i; j--){
                System.out.print("#");

            }
            System.out.println();
        }
    }
}
