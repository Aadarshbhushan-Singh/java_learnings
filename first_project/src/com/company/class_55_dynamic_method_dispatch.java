package com.company;
//Note --> Object is created during runtime of program.

/*We can make a reference with superclass and obj as subclass.
* Suppose superclass -> Phone and Derived Class -> smartPhone
* we can make object like this: Phone obj = new smartPhone(); --> But not reverse is possible.
*
*/
class one{
    public void greet(){
        System.out.println("Good Morning from class one method greet.");
    }

    public void name(){
        System.out.println("My name is java in class one method name.");
    }
}

class two extends one{
    public void sayHi(){
        System.out.println("Good Morning from class two method sayHi.");
    }

    public void name(){
        System.out.println("My name is java in class two method name.");
    }
}
public class class_55_dynamic_method_dispatch {
    public static void main(String[] args){
//        one obj1=new one();
//        obj1.name();
//        obj1.greet();

        one obj2=new two();
        obj2.greet(); //No problem in running because there is only one greet function.
//        obj2.sayHi(); //can't access sayHi
        obj2.name(); // In method overriding the method of subclass is run.


    }
}
