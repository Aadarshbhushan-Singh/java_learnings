package com.company;

public class class_112_finding_class_average_using_thread {
	public static int sum=0;
	public static void main(String[] args) throws InterruptedException
	{
		int marks[]=new int[10];
		int frequency[]=new int[10];
		
		int product[]=new int[10];
		
		
		for(int i=0; i<10; i++)
		{
			marks[i]=i+1;
		}
		
		frequency[0]=3;
		frequency[1]=4;
		frequency[2]=17;
		frequency[3]=8;
		frequency[4]=23;
		frequency[5]=10;
		frequency[6]=4;
		frequency[7]=6;
		frequency[8]=5;
		frequency[9]=2;
		
		Thread t1=new Thread(new Runnable() {
			public void run()
			{
				for(int i=0; i<10; i++)
				{
					product[i]=marks[i]*frequency[i];
				}
			}
		});
		
		Thread t2=new Thread (new Runnable() {
			public void run()
			{
				for(int i=0; i<10; i++)
				{
					sum=sum+frequency[i];
				}
			}
		});
		t1.start();
		t2.start();
		t1.join();
		t2.join();
		int sumProduct=0;
		for(int i=0; i<10; i++)
		{
			sumProduct=sumProduct+product[i];
		}
		
		System.out.println("Mean: "+(sumProduct/sum));
		
	}
}
