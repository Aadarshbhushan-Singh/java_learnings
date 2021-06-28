package com.company;
import java.util.Scanner;
public class class_23_find_vowel_and_consonant_count {
    static void count(String str){
        char []vowel={'a','e','i','o','u'};
        int vowel_count=0, consonant_count=0;
        for (int i=0; i<str.length(); i++){
            char ele=str.charAt(i);
            for (int j=0; j<5; j++){
                if (ele==vowel[j]){
                    vowel_count+=1;
                }
            }
        }
        System.out.println("Vowel: "+vowel_count +" "+"Consonant: "+(str.length()-vowel_count));

    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the string: ");
        String str=sc.next();
        count(str);

    }
}
