package com.company;
//Inheritance in java
class base{
    private int x;

    //setter
    public void setX(int x){
        this.x=x;
    }
    public int getX(){
        System.out.println("This is base class.");
        return x;
    }
}

class derived extends base{
    private int y;

    //setter
    public void setY(int y){
        this.y=y;
    }

    //getter
    public int getY(){
        System.out.println("This is derived class.");
        return y;
    }
}
public class class_51_inheritance_in_java {
    public static void main(String[] args){
        //Creating object of base class
        base b=new base();
        b.setX(54);
        System.out.println(b.getX());

        //Creating object of derived class
        derived d=new derived();
        d.setY(100);
        System.out.println(d.getY());

        //calling base class function from derived class object
        d.setX(90);
        System.out.println(d.getX());
    }
}
