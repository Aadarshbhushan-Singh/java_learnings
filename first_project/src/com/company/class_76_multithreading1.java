package com.company;

class Hi extends Thread
{
	public void run()
	{
		for(int i=0; i<5; i++)
		{
			System.out.println("Hi");
			try {Thread.sleep(500);} catch(Exception e) {}
		}
	}
}
class Hello extends Thread
{
	public void run()
	{
		for(int i=0; i<5; i++)
		{
			System.out.println("Hello");
			try
			{
				Thread.sleep(1000);
			}
			catch(Exception e) {}
		}
	}
}

public class class_76_multithreading1 {
	public static void main(String[] args)
	{
		Hi obj1=new Hi();
		Hello obj2=new Hello();
		
		//We need to start the thread.
		obj1.start();
		obj2.start();
		
//		obj1.show();
//		obj2.show();
		
		//Threading always calls run() method by default. So, replace show() by run().
	}
	
}
