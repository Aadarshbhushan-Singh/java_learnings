package com.company;

public class class_111_Life_Cycle_Of_Thread {
	public static void main(String[] args)
	{
		Thread t1=new Thread(new Runnable() {
			public void run()
			{
				for(int i=0; i<10; i++)
				{
					System.out.println("This is thread 1.");
				}
			}
		});
		
		Thread t2=new Thread(new Runnable() {
			public void run()
			{
				for(int i=0; i<5; i++)
				{
					System.out.println("This is thread 2.");
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
		
		
		
	}
}
