package com.company;
import java.util.Scanner;
import java.lang.Math;
//Employee1 gets salary and prints details
//Square gets length and prints area and perimeter
//Circle gets radius and prints area and perimeter
class employee1{
    Scanner sc=new Scanner(System.in);
    String name;
    int salary;
    public void getSalary(){

        System.out.println("Enter the salary: ");
        salary=sc.nextInt();
    }
    public void getName(){
        System.out.println("Enter the name: ");
        name=sc.next();
    }
    public void printName(){
        System.out.println("The name entered is: "+name);
    }
    public void printSalary(){
        System.out.println("The salary entered is: "+salary);
    }
}
class square{
    Scanner sc=new Scanner(System.in);
    int length;
    public void getSide(){
        System.out.println("Enter the side of square: ");
        length=sc.nextInt();

    }
    public void printArea(){
        double area=Math.pow(length,2);
        System.out.println("Area: "+area);
    }
    public void printPerimeter(){
        int perimeter=4*length;
        System.out.println("Perimeter: "+perimeter);
    }
    public void changeLengthValue(){
        length=length*10;
        System.out.println("New value of length: "+length);
    }

}

class circle{
    Scanner sc=new Scanner(System.in);
    int radius;
    public void getRadius(){
        System.out.println("Enter the radius of circle: ");
        radius=sc.nextInt();
    }
    public void printArea(){
        double area=Math.PI*Math.pow(radius, 2);
        System.out.println("Area of circle is: "+area);
    }
    public void printPerimeter(){
        double perimeter=2*Math.PI*radius;
        System.out.println("Perimeter of circle is: "+perimeter);
    }
}
public class class_45_practice_classes {
    public static void main(String[] args){
//        employee1 aadarsh1=new employee1();
//        aadarsh1.getName();
//        aadarsh1.getSalary();
//        aadarsh1.printName();
//        aadarsh1.printSalary();

//        square sqr1 = new square();
//        sqr1.getSide();
//        sqr1.printArea();
//        sqr1.printPerimeter();
//        sqr1.changeLengthValue();

        circle circle1=new circle();
        circle1.getRadius();
        circle1.printArea();
        circle1.printPerimeter();

    }
}
