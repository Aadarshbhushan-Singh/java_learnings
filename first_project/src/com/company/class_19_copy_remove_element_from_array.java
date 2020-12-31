package com.company;
import java.util.ArrayList;
public class class_19_copy_remove_element_from_array {
    public static void main(String[] args){
        int []array1={1,2,3,4,5};
        int []array2=new int[array1.length];
        for (int i=0; i<array1.length; i++){
            array2[i]=array1[i];
        }
        System.out.println("Second array which has been copied: ");
        for (int i=0; i<array2.length; i++){
            System.out.print(array2[i]+" ");
        }

    }
}
