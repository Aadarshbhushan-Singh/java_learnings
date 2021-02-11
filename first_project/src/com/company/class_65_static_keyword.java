package com.company;

//If I want to call the function by making an instance

class staticKeyword{
    public void printThis(){
        System.out.println("This is printing by making isntance.");
    }
}

//If I want to call the function by making an instance
class staticKeyword2{
    static int x=20;
    //We cannot use a non static variable in a static method.
    public static void printThis(){
        System.out.println("This is printing without making isntance."+x++);
    }
}
public class class_65_static_keyword {
    public static void main(String[] args) {
        staticKeyword obj1=new staticKeyword();
        obj1.printThis();

        staticKeyword2.printThis();
        System.out.println("Calling x without making any class: "+staticKeyword2.x);
        staticKeyword2.printThis();
        System.out.println("Calling x without making any class: "+staticKeyword2.x);
    }
}
