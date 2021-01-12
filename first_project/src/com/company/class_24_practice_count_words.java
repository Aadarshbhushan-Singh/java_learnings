package com.company;
import java.util.Scanner;
public class class_24_practice_count_words {
    static void countWords(String sentence){
        int count=0;
        for (int i=0; i<sentence.length(); i++){
            char ele=sentence.charAt(i);
            if (ele==' '){
                count+=1;
            }
        }
        System.out.println("Number of words is: "+(count+1));

    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the sentence: ");
        String sentence=sc.nextLine();
        countWords(sentence);
    }
}
