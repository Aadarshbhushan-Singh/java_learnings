package com.company;
import java.util.Scanner;
class circle1{
    Scanner sc=new Scanner(System.in);
    public int radius;
    public void takeRadius(){
        System.out.println("Enter radius: ");
        radius=sc.nextInt();
    }
    public void findArea(){
        System.out.println("Area of circle is: "+Math.PI*radius*radius);
    }
}

class cylinder1 extends circle1{
    Scanner sc=new Scanner(System.in);
    public int height;
    public void takeHeight(){
        System.out.println("Enter the height of cylinder: ");
        height=sc.nextInt();
    }

    public void findVolume(){
        System.out.println("Volume of cylinder is: "+2*Math.PI*radius*height);
    }
}
public class class_57_inheritance_practice {
    public static void main(String[] args){
        cylinder1 obj1=new cylinder1();
        obj1.takeRadius();
        obj1.takeHeight();
        obj1.findVolume();
        obj1.findArea();
    }
}
