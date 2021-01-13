package com.company;

public class class_33_varArgs {
    //...arr can take all the input arguments as array
    static int sum(int ...arr){
        //If we want that any argument is compulsory we can use this
        //static int sum(int x, int ...arr)
        int sum=0;
        for (int a: arr){
            sum+=a;
        }
        return sum;
    }
    public static void main(String[] args) {
        System.out.println(sum(3,4,5,6));
        System.out.println(sum(1,2));
        System.out.println(sum());
        System.out.println(sum(1));

    }
}
