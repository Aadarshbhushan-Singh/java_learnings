package com.company;

public class class_12_for_each_loop {
    public static void main(String[] args){
        int []marks={23,34,56,67,78};
        System.out.println(marks[3]);

        //Find the length of array
        System.out.println("Length of array: "+marks.length);

        //Array of different datatypes
        int []marks2={1,2,3,4,5}; //Integer
        float []marks3={3,4,5.6f,7.8f}; //Float
        String []marks4={"one","two","three"}; //String
        System.out.println(marks4[1]);

        //Display the elements of array
        //Naive Method --> Simply each element is printed by using index
        System.out.println(marks4[0]+" "+marks4[1]+" "+marks4[2]);
        //Array Traversal
        for (int i=0; i<marks3.length; i++){
            System.out.println(marks3[i]); //Array Traversal
        }

        //Displaying the array in reverse order
        for (int i=marks3.length-1; i>=0; i--){
            System.out.println(marks3[i]);
        }

        //For each
        //The work of for each loop in java is to iterate through all elements. It is not necessary that it will
        //traverse in order. Traversing may be random also.
        System.out.println("Printing using for each loop:");
        for(int element:marks){
            System.out.println(element);
        }

    }
}
