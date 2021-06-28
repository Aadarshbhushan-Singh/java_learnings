package com.company;
/*
* Method overriding is used in following circumstances.
* If same method is present in child and parent class both. Then if the the object of child class is made then
* method of child class is called. If the object of parent class is made then method of parent class is called.
*
* If we don't use override annotations then also method overriding will work.
* But still we use this to avoid confusion for other coders. This is recommended, not compulsory.
*
* While method overriding, both method name and argument should be same type.
* */

class A{
    public void method1(){
        System.out.println("This is method1 of class A");
    }
}
class B extends A{
    @Override
    public void method1(){
        System.out.println("This is method 1 of class B");
    }

    public void method2(){
        System.out.println("This is method 2 of class B");
    }

}
public class class_54_method_overriding {
    public static void main(String[] args){
        A obj1=new A();
        obj1.method1();

        B obj2=new B();
        obj2.method2();
        obj2.method1();
    }
}
