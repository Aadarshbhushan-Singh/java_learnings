package firstPackage;
import firstPackage.class03;
//import sciencePackage.organicChemistry; --> This is not allowed because the class is not public.
//We can't access the class which is not public from outside the package.
import sciencePackage.chemistry;
class class01{
    private int x=10;
    public int y=20;
}

class class02 extends class01{
    public void printClass02(){
        System.out.println("The value of y from class 02 is: "+y);
        //System.out.printf("The value of x from class02 is: "+ x); --> Can't access private property of class.
    }
}
public class Main {

    public static void main(String[] args) {
        System.out.println("Hello world!");
        class02 obj1=new class02();
        obj1.printClass02();

        class03 obj2=new class03();
        obj2.printClass03();

        chemistry obj3=new chemistry();
        obj3.chemistryMain();
    }
}
