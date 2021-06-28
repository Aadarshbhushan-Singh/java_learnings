package com.company;

public class class_11_array {
    public static void main(String[] args){
        //Declear a new array
        int [] marks=new int[5]; //Declearing the size of array as 5 is the memory allocation
        marks[0]=1;
        marks[1]=3;
        marks[2]=56;
        marks[3]=89;
        marks[4]=90;
        System.out.println(marks[3]);

        //Memory allocation can be done later-on also like this
        int []marks2;
        marks2=new int[4];

        //Array can also be created by directly allocating the values
        int []marks3={1,2,3,4,5};
        System.out.println(marks3[3]);

    }
}
