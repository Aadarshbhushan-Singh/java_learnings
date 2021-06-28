package com.company;
import java.util.Scanner;
public class class_13_multidimentional_array {
    public static void main(String[] args){
        //Take input from the user and print in the form of matrix
        int []marks; //1-D array
        int [][]score; //2-D array
        score=new int[2][3];
        Scanner sc=new Scanner(System.in);
        for (int i=0; i<score.length; i++){
            for (int j=0; j<score[0].length; j++){
                score[i][j]=sc.nextInt();
            }
        }
        for (int i=0; i<score.length; i++){
            for (int j=0; j<score[0].length; j++){
                System.out.print(score[i][j]+" ");
            }
            System.out.println();
        }

    }
}
