package com.company;
import java.util.Scanner;

class TestDetails
{
	Scanner sc=new Scanner(System.in);
	
	static int count=0;
	static int count1=0;
	float[][] marks=new float[5][7];
	
	void storeMarks(int n)
	{
		for(int i=0; i<n; i++)
		{
			marks[count][i]=sc.nextFloat();
		}
		count++;
	}
	
	void displayMarks()
	{
		for(int i=0; i<7; i++)
		{
			if(marks[count1][i]!=0)
			{
				System.out.print(marks[count1][i]+" ");
			}else {
				break;
			}
		}
		count1++;
	}
}

class NoticePeriod extends TestDetails
{
	static int count2=0;
	static int count3=0;
	int[] noticeIndex=new int[5];
	void notice()
	{
		int less=0;
		for(int i=0; i<7; i++)
		{
			if(marks[count2][i]!=0 && marks[count2][i]>=50)
			{
				less++;
			}else
			{
				break;
			}
			
		}
		if(less<3)
		{
			noticeIndex[count3]=count2+1;
			count3++;
		}
		count2++;
		
	}
	void printNotice()
	{
		System.out.println("\nStudents in Notice Period are: ");
		for(int ele=0; ele<noticeIndex.length; ele++)
		{
			if(noticeIndex[ele]!=0)
			{
				System.out.println(noticeIndex[ele]-1);
			}
			
			
		}
	}
	
	
}

public class class_88_java_assessment_03 {
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		NoticePeriod obj2=new NoticePeriod();
		for(int i=0; i<5; i++)
		{
			System.out.println("Enter the number of tests: ");
			int n=sc.nextInt();
			obj2.storeMarks(n);
		}
		
		for(int i=0; i<5; i++)
		{
			System.out.print("\nMarks of student "+(i+1)+" is: ");
			obj2.displayMarks();
		}
		
		//Printing Notice
		
		for(int i=0; i<5; i++)
		{
			obj2.notice();
		}
		
		obj2.printNotice();
		sc.close();
	}
}
