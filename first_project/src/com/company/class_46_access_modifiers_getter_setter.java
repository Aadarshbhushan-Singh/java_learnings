package com.company;
import java.util.Scanner;

/*
* There are four types of modifiers in java:
* 1) Default
* 2) Private
* 3) Protected
* 4) Public
* Note: See java document from oracle for more details
* */
class student{
    //When we use private access modifiers in class we have to use getters and setters
    private int rollNo;
    private String name;

    //setters
    public void setName(String name){
        this.name=name;
    }
    public void setRollNo(int rollNo){
        this.rollNo=rollNo;
    }

    //getters --> These returns the values
    public String getName(){
        return name;
    }
    public int getRollNo(){
        return rollNo;
    }

}
public class class_46_access_modifiers_getter_setter {
    public static void main(String[] args){
        student std1=new student();
        std1.setName("Aadarsh");
        std1.setRollNo(10);
        System.out.println(std1.getName());
        System.out.println(std1.getRollNo());
    }
}
