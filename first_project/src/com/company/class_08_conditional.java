package com.company;
import java.util.Scanner;

public class class_08_conditional {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int day;
        System.out.println("Enter the number: ");
        day=sc.nextInt();
        switch (day){
            case 1:
                System.out.println("Sunday");
                break;
            case 2:
                System.out.println("Monday");
                break;
            case 3:
                System.out.println("Tuesday");
                break;
            case 4:
                System.out.println("Wednesday");
                break;
            case 5:
                System.out.println("Thrusday");
                break;
            case 6:
                System.out.println("Friday");
                break;
            case 7:
                System.out.println("Saturday");
                break;
            default:
                System.out.println("Wrong input of number. ");
        }
        int age;
        System.out.println("Enter the age: ");
        age=sc.nextInt();
        if (age>18 && age<100){
            System.out.println("You can give vote.");
        }else if (age>100 || age<0){
            System.out.println("Invalid Age");
        }else{
            System.out.println("You cannot vote.");
        }

    }
}
