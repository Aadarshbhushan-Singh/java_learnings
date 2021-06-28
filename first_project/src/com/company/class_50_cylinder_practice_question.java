package com.company;
import java.util.Scanner;
/*
1.create a class cylinder and use getter and setters to set its radius and height
2.use ➊ to calculate surface and volume of the cylinder
*/

class cylinder{
    private int radius, height;

    //setters
    public void setRadius(int radius){
        this.radius=radius;
    }
    public void setHeight(int height){
        this.height=height;
    }
    //getters
    public int getRadius(){
        return radius;
    }
    public int getHeight(){
        return height;
    }

    //Calculate surface and volume
    public double calculateSurface(){
        return 2*Math.PI*radius*height;
    }
    public double calculateVolume(){
        return Math.PI*radius*radius*height;
    }
}
public class class_50_cylinder_practice_question {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        cylinder cyl1=new cylinder();
        System.out.println("Enter the radius: ");
        cyl1.setRadius(sc.nextInt());
        System.out.println("Enter the height: ");
        cyl1.setHeight(sc.nextInt());

        System.out.println("Surface Area is: "+cyl1.calculateSurface());
        System.out.println("Volume is: "+cyl1.calculateVolume());

    }
}
