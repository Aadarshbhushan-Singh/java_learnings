package com.company;
/*
* Constructors are the function with the same name of the class.
* When object of class is made then at the same time the function in constructor is also called.
* Like function overloading constructors can also be overloaded.
* */


//Note-> Constructors never return anything
class student1{
    //This is constructor without passing any argument
    public student1(){
        System.out.println("Constructor without argument.");
    }
    //This is constructor with one argument -> int
    public student1(int rollNo){
        System.out.println("Constructor with int argument.");
        System.out.println("Roll No: "+rollNo);
    }
    //Constructor with one argument -> String
    public student1(String name){
        System.out.println("Constructor with string argument.");
        System.out.println("Name is: "+name);
    }
}

//Making constructros using getters and setters
class student2{
    private int rollNo;
    private String name;

    //Using constructor overloading for writing the values of rollNo and name
    public student2(){
        rollNo=0;
        name="NULL";
    }
    public student2(int rollNo){
        this.rollNo=rollNo;
        name="NULL";
    }
    public student2(String name){
        int rollNo=0;
        this.name=name;
    }
    public student2(String name, int rollNo){
        this.rollNo=10;
        this.name="Aadarsh";
    }

    //Using setters to write the values of rollNo and name
    public void setRollNo(int rollNo){
        this.rollNo=rollNo;
    }
    public void setName(String name){
        this.name=name;
    }

    //Using getters to print the values of rollNo and name
    public int getRollNo(){
        return rollNo;
    }
    public String getName(){
        return name;
    }
}
public class class_47_constructors_and_constructorsOverloading {
    public static void main(String[] args){
        //Class for constructor and overloading
        student1 std1=new student1();
        student1 std2=new student1(10);
        student1 std3=new student1("Aadarsh");

        //Using constructors and getters and setters together
        student2 std4=new student2();
        std4.setName("Rahul");
        std4.setRollNo(30);
        System.out.println(std4.getName());
        System.out.println(std4.getRollNo());

        //Setting prperty using constructors only
        //Default Constructor
        student2 std5=new student2();
        System.out.println(std5.getName());
        System.out.println(std5.getRollNo());

        //Constructor with int argument
        student2 std6=new student2(30);
        System.out.println(std6.getName());
        System.out.println(std6.getRollNo());

        //Constructor with string argument
        student2 std7=new student2("Srisant");
        System.out.println(std7.getName());
        System.out.println(std7.getRollNo());

        //Constructor with both string and int
        student2 std8=new student2 ("Sashwat", 40);
        System.out.println(std8.getName());
        System.out.println(std8.getRollNo());


    }
}
