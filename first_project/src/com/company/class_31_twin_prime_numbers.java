package com.company;

public class class_31_twin_prime_numbers {
    //twin prime numbers less than 100
	static boolean checkPrime(int num){
        for (int i=2; i<num; i++){
            if (num%i==0){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args){
        for (int i=0; i<100; i++){
            if (checkPrime(i) && checkPrime(i+2)){
                System.out.println("("+i+" "+(i+2)+")");
            }
        }        
    }
}
