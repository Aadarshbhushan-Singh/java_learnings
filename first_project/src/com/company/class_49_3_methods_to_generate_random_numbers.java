package com.company;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;


// 3 methods to generate random numbers;
// Note: Use method 1 if you have upperbound from 0
// Use method 2 if you have both upperbound and lowerBound
//Use method 3 if you have to generate any random numbers

public class class_49_3_methods_to_generate_random_numbers {
    public static void main(String[] args) {
        // 1. Method using random Class and importing java.util.Random

        //Make a instance of class Random
        Random rand=new Random();
        int upperBound=20; //Generates random values from 0 to (upperBound-1)
        int int_random=rand.nextInt(upperBound);
        double double_random=rand.nextDouble(); //nextDouble() generates random double between 0.0 to 1.0
        float float_random=rand.nextFloat(); //nextFloat() generates random float between 0.0 to 1.0

        //Printing the values
        System.out.println("Random value between 0 to "+upperBound+" : "+int_random);
        System.out.println("Random double between 0.0 to 1.0: "+double_random);
        System.out.println("Random float between 0.0 to 1.0: "+float_random);

        // 2. Using Math.random()
        //Use the formula Math.random() * (max - min + 1) + min to generate values with the min value inclusive and the max exclusive.
        int min=50, max=100;
        //Generate random value from 50 to 100
        double double_random2=Math.random() * (max-min+1)+min;
        System.out.println("Random value between "+min+" and "+max+" :"+double_random2);
        int int_random2=(int)(Math.random()*(max-min+1)+min);
        System.out.println("Random value between "+min+" and "+max+" :"+int_random2);


        // 3. Using ThreadLocalRandom
        //Generate random int
        int int_random3=ThreadLocalRandom.current().nextInt();
        //Generate random double
        double double_random3=ThreadLocalRandom.current().nextDouble();
        //Generate random float
        float float_random3=ThreadLocalRandom.current().nextFloat();

        //Printing the random values
        System.out.println("Using ThreadLocalRandom.current(): "+int_random3);
        System.out.println("Using ThreadLocalRandom.current(): "+float_random3);
        System.out.println("Using ThreadLocalRandom.current(): "+double_random3);

    }
}
