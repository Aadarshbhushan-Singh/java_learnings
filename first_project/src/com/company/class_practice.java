package com.company;
class apple{
	int i=10;
    static int a=10;
    public void displayA(){
    	a=30;
        System.out.println("A: "+(++a));
        System.out.println("I: "+(++i));
    }
    public void show() {
    	i=20;
    	System.out.println("The value of a in show is: "+(++i));
    }
    public void show2() {
    	System.out.println("The value of a in show is: "+(++i));
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
        obj1.show();
        obj1.show2();

        ball obj2=new ball();
        obj2.displayA();
    }
}
