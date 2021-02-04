package com.company;
//Abstract class and abstract method
//Watch Telusko video on abstract class in java for detailed information.

abstract class mobileOne{ //We cannot create object of abstract class because it has some incomplete functions int it.
    //Mobile One has already developed features of calling...
    public void call(){
        System.out.println("Calling...");
    }
    //But it is not able to develop feature of dancing, moving and cooking
    public abstract void dance();
    public abstract void move();
    public abstract void cook();
}

//Suppose mobile two has developed feature of dancing, but still move and cook is left so mobileTwo will also be abstract.
abstract class mobileTwo extends mobileOne{
    public void dance(){
        System.out.println("Dancing...");
    }
    public abstract void move();
    public abstract void cook();
}

class mobileThree extends mobileTwo{
    public void move(){
        System.out.println("Moving...");
    }
    public void cook(){
        System.out.println("Cooking...");
    }
}
public class class_58_abstract_class {
    public static void main(String[] args){
        mobileThree obj1=new mobileThree();
        //Since mobileThree extends mobileTwo and mobileTwo extends mobileOne.
        // So from mobileThree we can use the function of mobileOne and mobileTwo both
        obj1.call();
        obj1.move();
        obj1.cook();
        obj1.dance();
    }
}
