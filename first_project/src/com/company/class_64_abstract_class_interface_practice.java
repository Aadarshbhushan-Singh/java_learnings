package com.company;

/*
* 1. Create an abstract class pen with method write() and refill() in it as abstract methods.
* 2. Use pen to make concrete class fountain and add additional method changeNib().
*
* 3. Create a class monkey with jump() and bite() method.
* 4. Make a class human with speak() method which inherits monkey class and
*  implements basicAnimal interface with eat() and sleep() method.
* */

//Point no: 1
abstract class pen{
    abstract void write();
    abstract void refill();
}

//Point no: 02
class fountainPen extends pen {
    void write(){
        System.out.println("Writing...");
    }
    void refill(){
        System.out.println("Refilling...");
    }
    public void changeNib(){
        System.out.println("Changing nib...");
    }
}

//Point no: 3
class monkey{
    public void jump(){
        System.out.println("Jumping...");
    }
    public void bite(){
        System.out.println("Biting...");
    }
}

interface basicAnimal{
    void eat();
    void sleep();
}

class human extends monkey implements basicAnimal{
    public void speak(){
        System.out.println("Speaking...");
    }
    @Override
    public void eat(){
        System.out.println("Eating...");
    }

    @Override
    public void sleep(){
        System.out.println("Sleeping...");
    }

}
public class class_64_abstract_class_interface_practice {
    public static void main(String[] args) {
        fountainPen pen1=new fountainPen();
        pen1.write();
        pen1.refill();
        pen1.changeNib();

        //Create human object which is all money, human and basic animal
        human hum1=new human();
        hum1.eat();
        hum1.speak();
        hum1.bite();

        //create human which is monkey
        monkey mon1=new human();
        mon1.bite();
        mon1.jump();
        //mon1.sleep() //Not allowed because reference is monkey which doesn't have sleep method

        //create a human which is basicAnimal
        basicAnimal basic1=new human();
        basic1.eat();
        basic1.sleep();
        //basic1.jump() //Not allowed because reference is of basicAnimal which doesn't have jump() method

    }
}
