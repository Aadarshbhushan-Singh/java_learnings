package com.company;
import java.util.Scanner;
public class class_30_practice_generate_n_matrix {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the value of n: ");
        int n=sc.nextInt();
        for (int i=0; i<n; i++){
            for (int j=0; j<n; j++){
                System.out.print(((int)Math.random())+"  ");
            }
            System.out.println();
        }
    }
}
