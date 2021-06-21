
package com.company;
import java.io.*;

abstract class Animal1{
    void run()
    {
        System.out.println("Running.....");
    }
    
    abstract void bark();
    abstract void eat();
    abstract void hunt();
}

abstract class Animal2 extends Animal1{
    void bark()
    {
        System.out.println("Barking...");
    }
    
    abstract void eat();
    abstract void hunt();
}

class Animal3 extends Animal2{
    void eat(){
        System.out.println("Eating");
    }
    void hunt(){
        System.out.println("Hunting...");
    }
    
}

public class class_126_practice_abstract_class {
   
    
    public static void main(String[] args) throws IOException
    {
        Animal3 obj1=new Animal3();
        obj1.eat();
        obj1.bark();
        obj1.hunt();
        
        try{
            throw new MyException(10);
//            printHello();
        }catch(Exception e)
        {
            
        }
        
    }
    static void printHello() throws NumberFormatException{
            
    }
}
class MyException extends Exception{
   int a;
   MyException(int b) {
     a=b;
   }
   public String toString(){
     return ("Exception Number =  "+a) ;
  }
}