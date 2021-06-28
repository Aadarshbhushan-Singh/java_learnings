package com.company;
import java.util.Scanner;

public class class_113_parctice_Multi_threading {
	public static int counter;	
	public static void main(String[] args) throws Exception
	{
		Scanner sc=new Scanner(System.in);
		Thread t1=new Thread(new Runnable() {
			public void run()
			{
				//Print 0-9
				for(int i=0; i<10; i++)
				{
					System.out.println(i);
					counter++;
				}	
			}
		});
		
	
		
		//print 10-19
		
		Thread t2=new Thread(new Runnable() {
			public void run()
			{
				for(int i=10; i<20; i++)
				{
					System.out.println(i);
				}
				
				
			}
		});
		
		t2.start();
		
		
		t1.start();
		
		t1.join();
		
//		for(int i=0; i<5; i++)
//		{
//			int maxT=sc.nextInt();
//			for(int i=0; i<maxT; i++)
//			{
//				t1.start();
//				t2.start();
//				t3.start();
//			}
//		}
		
	
		
	}
}
