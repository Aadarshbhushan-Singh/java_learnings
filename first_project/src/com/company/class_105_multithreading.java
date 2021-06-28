package com.company;
/*
 * There is one class called Thread.
 * For creating we have to override a method called run() in Thread class.
 * we need to call method start() to initiate the thread.
 * Always use Thread.sleep() in try catch block because it can throw exception.
 * 
 * */
class truck extends Thread
{
	public void run()
	{
		for(int i=0; i<5; i++)
		{
			System.out.println("Truck");
			try{
				Thread.sleep(300);
			}catch(Exception e)
			{
				
			}
		}
		
	}
}

class bus extends Thread
{
	public void run()
	{
		for(int i=0; i<5; i++)
		{
			System.out.println("Bus");
			try{
				Thread.sleep(200);
			}catch(Exception e)
			{
				
			}
		}
		
	}
}



public class class_105_multithreading {
	public static void main(String[] args)
	{
			truck obj1=new truck();
			bus obj2=new bus();
			
			obj1.start();
			obj2.start();
			
			System.out.println("Executed print statement."); //This statement will be executed first because there is delay in
															 // run() method of class car and bus. obj1, obj2 and main method all are thread.
															 // So all three can run side by side. (Analogous) 
	}
}
