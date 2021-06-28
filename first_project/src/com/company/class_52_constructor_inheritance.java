package com.company;
/*
* 1. If base class has a constructor and an object is made for derived class then
*   the constructor of base class will also be called which is without any argument.
* 2. If we want that the constructor having argument should be called from base class we have
*   to use keyword Super(argument)
*3. If super keyword is used the constructor with appropriate amount of argument will run from the base class.
*  Not the default one. Note: argument should be passed properly while calling the object of derived class.
* 4. Go line by line execution of code. First constructor of derived class is called the super class.
*
* Final Note: First of all constructor of grandChild is called. Then super keyword is seen. Then the constructor of
* child is called having enough argument in super keyword. Then again in child super keyword is used.
* Then the constructor of parent class is called having enough argument in super keyword.
* */

class base1{
    public base1(){
        System.out.println("This is base constructor.");
    }
    public base1(int a){
        System.out.println("This is overloaded constructro with value of a as: "+a);
    }
}

class derived1 extends base1{
    public derived1(){
//        super(10);
        System.out.println("This is derived class constructor.");
    }
    public derived1(int x, int y){
        super(x);
        System.out.println("This is derived class overloaded constructor: with value of b as: "+y);
    }
}

public class class_52_constructor_inheritance {
    public static void main(String[] args){
        base1 obj1=new base1();
        derived1 obj2=new derived1(14, 9);
    }
}
