package com.company;
import java.util.Scanner;
public class class_14_adding_matrix {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        //Making three matrix
        int [][]matrix1=new int[2][2];
        int [][]matrix2=new int[2][2];
        int [][]matrix3=new int[2][2];
        System.out.println("Enter the elements of first matrix: ");
        for (int i=0; i<matrix1.length; i++){
            for (int j=0; j<matrix1[0].length; j++){
                matrix1[i][j]=sc.nextInt();
            }
        }
        System.out.println("Enter the elements of second matrix: ");
        for (int i=0; i<matrix2.length; i++){
            for (int j=0; j<matrix2[0].length; j++){
                matrix2[i][j]=sc.nextInt();
            }
        }
        //Addition of matrix
        for (int i=0; i<matrix1.length; i++){
            for (int j=0; j<matrix1[0].length; j++){
                matrix3[i][j]=matrix1[i][j]+matrix2[i][j];
            }
        }
        //Display the result of matrix
        System.out.println("The result of addition of two matrix is: ");
        for (int i=0; i<matrix3.length; i++){
            for (int j=0; j<matrix3[0].length; j++){
                System.out.print(matrix3[i][i]+" ");
            }
            System.out.println();
        }

    }
}
