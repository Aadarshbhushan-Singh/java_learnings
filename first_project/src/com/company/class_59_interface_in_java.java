package com.company;
//Interface in java
//Watch telusko interface in java video 8.21

//Note: Interface supports multiple inheritance in java
interface Abc{
    void showAbc();
}
interface Xyz{
    void showXyz();
}
class AbcImplements implements Abc, Xyz{
    public void showAbc()
    {
        System.out.println("Showing Abc...");
    }
    public void showXyz()
    {
        System.out.println("Showing xyz...");
    }
}
interface Pqr{
    void showPqr();
}

public class class_59_interface_in_java {
    public static void main(String[] args){
        AbcImplements obj1=new AbcImplements();
        obj1.showAbc();
        obj1.showXyz();

        //We cannot make an object of interface directly. But we can create an object and implement the function in main
        //method also. Eg.
        Pqr obj2=new Pqr(){
            public void showPqr(){
                System.out.println("Printing Pqr from inner declaration...");
            }
        };
        obj2.showPqr();

        //The same above code can be written in lambda expression as
        Pqr obj3=()->{
            System.out.println("Printing Pqr from inner declaration for obj3...");
        };
        obj3.showPqr();

        //If there is only one block of statement, we can write everything in one line itself
        Pqr obj4=()-> System.out.println("Printing Pqr from inner declaration for obj4...");
        obj4.showPqr();
    }
}
