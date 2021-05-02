package com.company;

class counter
{
	int count;
	public synchronized void increment()
	{
		count++;
	}
}

public class class_110_synchronization {
	public static void main(String[] args) throws Exception
	{
		counter c1=new counter();
		
		Thread t1=new Thread(new Runnable() {
			public void run()
			{
				for(int i=0; i<1000; i++)
				{
					c1.increment();
				}
			}
		});
		
		Thread t2=new Thread(new Runnable() {
			public void run()
			{
				for(int i=0; i<1000; i++)
				{
					c1.increment();
				}
			}
		});
		
		t1.setPriority(3);  
        t2.setPriority(7);  
        // print the user defined priority   
        System.out.println("Priority of thread t1 is: " + t1.getPriority()); //4  
        System.out.println("Priority of thread t2 is: " + t2.getPriority()); //7 
        
		t1.start();
		t2.start();
		t1.join();
		t2.join();
		System.out.println("Count: "+c1.count);
	}
}
