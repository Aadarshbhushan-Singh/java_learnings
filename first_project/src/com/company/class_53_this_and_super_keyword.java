package com.company;
/*
* If the name of the variable is same, then this keyword is used.
* If you want pass an object to a method inside the same object then this keyword is used.
*
* Super refers to immediate parent class constructor. This is used to invoke custom constructor. Not default.
* */

class thisInJava{
    private int a;
    public void setA(int a){
        this.a=a;
    }
    public void printA(){
        System.out.println("The value of a is: "+a);
    }

    public thisInJava(int x){
        System.out.println("This is constructor and value of a is: "+x);
    }
}

class derivedSuperInJava extends thisInJava{
    public derivedSuperInJava(){
        super(10);
        System.out.println("This is derived class.");
    }
}
public class class_53_this_and_super_keyword {
    public static void main(String[] args){
        thisInJava obj1=new thisInJava(20);
//        obj1.setA(10);
//        obj1.printA();

        derivedSuperInJava obj2=new derivedSuperInJava();



    }
}
