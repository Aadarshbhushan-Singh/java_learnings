package com.company;
import java.util.Scanner;
/*
* https://www.hackerrank.com/challenges/sparse-arrays/problem
* */
public class class_63_sparse_string_HackerRank {
    static int n=0;
    public static void matchingStrings(String[] strings, String[] queries){
        int count=0;
        int[] finalArray=new int[queries.length];
        for(String ele1: queries){
            for(String ele2: strings){
                if(ele1.equals(ele2)){
                    count+=1;
                }
            }
            finalArray[n]=count;
            n=n+1;
            count=0;
        }

        //Printing array
        for(int i=0; i<queries.length; i++){
            System.out.println(finalArray[i]);
        }
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);

        //For strings
        int n1=sc.nextInt();
        String[] strings=new String[n1];
        for(int i=0; i<n1; i++){
            strings[i]=sc.next();
        }

        //For queries
        int n2=sc.nextInt();
        String[] queries=new String[n2];
        for(int i=0; i<n2; i++){
            queries[i]=sc.next();
        }

        matchingStrings(strings, queries);
    }
}
