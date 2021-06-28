package com.company;

public class class_18_sum_and_average_of_elements_in_array {
    public static void main(String[] args){
        int []array={12,34,32,56,78,65,45};
        int sum=0;
        for (int i=0; i<array.length; i++){
            sum=sum+array[i];
        }
        float average=(float)sum/array.length;
        System.out.println("The sum of array is: "+sum+" and average is: "+average);
        //Find if element is present in array or not
        int find=3400;
        boolean found=false;
        for (int i=0; i<array.length; i++){
            if(array[i]==find){
                found=true;
                break;
            }
        }
        System.out.println("Found: "+found);
    }
}
