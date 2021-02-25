package com.company;
import java.util.Scanner;
/*
 * Find the sum upto n terms of series:
 * 1-2+3-5+7-11... 
 */
public class class_78_sum_of_sequence {
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int plus=0;
		int sum=0;
		for(int i=0; i<(n*2+1); i++)
		{
			if(i%2!=0)
			{
				if(plus==0)
				{
					sum=sum+i;
					plus=1;
				}else
				{
					sum=sum-i;
					plus=0;
				}
			}
		}
		System.out.println("The sum upto " + n + " terms is: "+sum);
	}
	
}
