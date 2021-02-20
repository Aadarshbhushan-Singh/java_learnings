package com.company;

class Hi2 implements Runnable
{
	public void run()
	{
		for(int i=0; i<5; i++)
		{
			System.out.println("Hi");
			try {
				Thread.sleep(500);
			}catch(Exception e) {}
		}
	}
}

class Hello2 implements Runnable
{
	public void run()
	{
		for(int i=0; i<5; i++)
		{
			System.out.println("Hello");
			try {Thread.sleep(500);}catch(Exception e) {}
		}
	}
}

public class class_77_multithreading_running_interface {
	public static void main(String[] args)
	{
		Hi2 obj1=new Hi2();
		Hello2 obj2=new Hello2();
		
		obj1.run();
		obj2.run();
	}
}
