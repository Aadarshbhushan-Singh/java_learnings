
package com.company;

class classA1{
    classA1()
    {
        System.out.println("This is classA1 constructor.");
    }
}

class classB1 extends classA1{
    classB1(){
        super();
        System.out.println("This is classB1 constructor.");
        
    }
}



public class class_125_super_constructor {
    public static void main(String[] args)
    {
              
        classB1 obj2=new classB1();
        
    }
}
