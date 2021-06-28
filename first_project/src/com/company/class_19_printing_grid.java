package com.company;
import java.util.Scanner;
public class class_19_printing_grid {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n;
        System.out.println("Enter the number of line: ");
        n=sc.nextInt();
        for(int i=0; i<n; i++){
            for (int j=0; j<20; j++){
                System.out.print("- ");
            }
            System.out.println();
        }
    }
}
