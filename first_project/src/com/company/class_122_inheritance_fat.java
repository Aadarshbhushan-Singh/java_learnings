package com.company;

class dealer{
	String dealerName;
	String dealerAdress;
	public void getConsession() {
		
	}
}


class twoWheeler extends dealer{
	String modelName;
	String modelNumber;
	int price; 
	int addOn=100;
	@Override
	public void getConsession()
	{
		price=(int) (price*0.05);
	}
	public void printEstimate() {
		price=price+addOn;
		System.out.println("Price: "+price);
	}
}

class fourWheeler extends dealer{
	String modelName; 
	String modelNumber;
	int price; 
	int addOn;
	String fuelType;
	public void getConsession()
	{
		price=(int) (price*0.1);
		
	}
	public void printEstimate() {
		price=price+addOn;
		System.out.println("Price: "+price);
	}
}
public class class_122_inheritance_fat {
	public static void main(String[] args) {
		twoWheeler obj1=new twoWheeler();
		obj1.modelName="Model1";
		obj1.modelNumber="111A";
		obj1.price=10000;
		obj1.getConsession();
		obj1.printEstimate();
		
		fourWheeler obj2=new fourWheeler();
		obj2.modelName="Model2";
		obj2.modelNumber="111B";
		obj2.price=10000;
		obj2.getConsession();
		obj2.printEstimate();
		
	}
}
