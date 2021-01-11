package com.company;
import java.util.*;
public class class_22_function_practice_max_min_average_three_numbers {
    static void maximum(int x, int y, int z){
        if (x>y & x>z){
            System.out.println(x + " is Maximum.");
        }else if(y>x & y>z){
            System.out.println(y + " is Maximum.");
        }else if(z>y & z>x){
            System.out.println(z+" is Maximum");
        }else{
            System.out.println("No absolute Maximum found!");
        }
    }

    static void minimum(int x, int y, int z){
        if (x<y & x<z){
            System.out.println(x + " is Minimum.");
        }else if(y<x & y<z){
            System.out.println(y + " is Minimum.");
        }else if(z<y & z<x){
            System.out.println(z+" is Minimum");
        }else{
            System.out.println("No absolute Minimum found!");
        }
    }

    static int average(int x, int y, int z){
        return x+y+z/3;
    }

    public static void main(String[] args){
        maximum(10,30,43);
        minimum(23,45,67);
        maximum(10,6,10);
        minimum(10,10,23);
        System.out.println("Average is: "+ average(45,10,56));

    }
}
