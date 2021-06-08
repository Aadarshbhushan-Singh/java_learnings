package com.company;
import java.io.*;
import java.util.Scanner;
public class class_119_lab_fat_java {
    static void validate(String input)throws InvalidException{  
     
    try{ 
            int n=Integer.parseInt(input); 
            if(n<1) {
                throw new InvalidException("not valid");    
            } 
            System.out.println(input + " is a valid integer"); 
    }
    catch (NumberFormatException e)  
    { 
            System.out.println(input + " is not a valid integer"); 
    }
       
   }
   
    
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        String input;
        try{  
         System.out.println("Enter the value of N: ");
        validate(input=sc.next());
        int n=Integer.parseInt(input);
        int[] array1;
        array1=new int[n];
        int sum=0;
        System.out.println("Enter n numbers: ");
        for(int i=0; i<n; i++)
        {
            array1[i]=sc.nextInt();
            sum=sum+array1[i];
        }
        System.out.println("Average is: "+sum/n);
        
      }catch(InvalidException m){System.out.println("Exception occured: "+m);}  
  
        
  }
       
    }

class InvalidException extends Exception{  
 InvalidException(String s){  
  super(s);  
 }  
}  
