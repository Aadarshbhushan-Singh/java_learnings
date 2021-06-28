/* Write a java program, by creating a base class number with a method calculate() to get the sum of the given digits.
 * Derive the base class to a subclass quadratic, to find the real and imaginary solutions for the given quadratic 
 * equation by overriding the method calculate(). Again derive the base class number , to another subclass called sos ,
 * to find the sum of square of the given number by overriding the method calculate().
 * */

package com.company;
import java.util.Scanner;

class number{
	int a,b,c;
	public void getNumbers(int a, int b, int c){
		this.a=a;
		this.b=b;
		this.c=c;
	}
	public void calculate() {
		int sum=a+b+c;
		System.out.println("The sum is: "+sum);
		System.out.println();
	}
}

class quadratic extends number
{
	public void calculate()
	{
		double d= b * b - 4.0 * a * c;
		if (d> 0.0)   
		{  
		double r1 = (-b + Math.pow(d, 0.5)) / (2.0 * a);  
		double r2 = (-b - Math.pow(d, 0.5)) / (2.0 * a);  
		System.out.println("The roots are " + r1 + " and " + r2);
		System.out.println();
		}   
		else if (d == 0.0)   
		{  
		double r1 = -b / (2.0 * a);  
		System.out.println("The root is " + r1); 
		System.out.println();
		}   
		else   
		{  
		System.out.println("Roots are not real."); 
		System.out.println();
		}  
	}
}

class sos extends number
{
	public void calculate() {
		int as=a*a;
		int bs=b*b;
		int cs=c*c;
		int sums=as+bs+cs;
		System.out.println("The sum of square of number is: "+sums);
		System.out.println();
	}
}

public class class_83_rohit_practice_javaClass {
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter 3 numbers: ");
		int a, b, c;
		a=sc.nextInt();
		b=sc.nextInt();
		c=sc.nextInt();
		
		System.out.println("Calculate method from number class:");
		number obj1=new number();
		obj1.getNumbers(a, b, c);
		obj1.calculate();
		
		System.out.println("Calculate method from quadratic class:");
		quadratic obj2=new quadratic();
		obj2.getNumbers(a,b,c);
		obj2.calculate();
		
		System.out.println("Calculate method from sos class:");
		sos obj3=new sos();
		obj3.getNumbers(a, b, c);
		obj3.calculate();
		
		sc.close();
	}
}
