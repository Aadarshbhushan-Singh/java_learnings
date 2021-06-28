package com.company;

public class class_21_print_unique_and_duplicate_element_in_array {

    public static void main(String[] args){
        int []array1= {12,23,45,12,23,56,78,90};
        int []unique=new int[array1.length];
        int []duplicate=new int[array1.length];
        for (int i=0; i<array1.length; i++){
            int element=array1[i];
            int count=0;
            for (int j=0; j<array1.length; j++){
                if (array1[j]==element){
                    count=count+1;
                }
            }
            if (count==1){
                System.out.println("Unique element: "+element);
            }else if(count>1){
                int length_duplicate=duplicate.length;
                System.out.println("Duplicate element: "+element);
            }
        }


    }
}
