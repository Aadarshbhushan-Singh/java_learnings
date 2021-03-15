package com.company;
class declearGeneric<X,Y,Z>
{
	X x;
	Y y;
	Z z;
	public declearGeneric(X x, Y y, Z z)
	{
		this.x=x;
		this.y=y;
		this.z=z;
	}
	public void showValues()
	{
		System.out.println("X: "+x+" Y: "+y+" Z: "+z);
	}
}
public class class_91_generic2 {
	
	
	public static void main(String[] args)
	{
		declearGeneric<String, Integer, Boolean> obj1=new declearGeneric("Aadarsh", 21, true);
		declearGeneric<String, Double, Float> obj2=new declearGeneric("Mohan", 32.4d, 43.5f);
		
		obj1.showValues();
		obj2.showValues();
	}
	
}
