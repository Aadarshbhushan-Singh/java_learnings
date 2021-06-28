package firstPackage;

class Mobile{
	public void ring(){
		System.out.println("Ringing...");
	}
}
public class class01{
	public static void main(String[] args){
		System.out.println("This is class 01 main method");
		Mobile obj1=new Mobile();
		obj1.ring();
	}
}