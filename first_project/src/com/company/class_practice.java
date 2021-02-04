package com.company;
class apple{
    static int a=10;
    public void displayA(){
        System.out.println("A: "+(++a));
    }
}

class ball extends apple{
    public void displayA(){
        System.out.println("A from ball: "+(++a));
    }
}
public class class_practice {
    public static void main(String[] args){
        apple obj1=new apple();
        obj1.displayA();

        ball obj2=new ball();
        obj2.displayA();
    }
}
