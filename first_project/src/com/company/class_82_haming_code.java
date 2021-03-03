package com.company;
import java.util.Scanner;
public class class_82_haming_code {
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		
		int c1, c2, c3;
		int[] a=new int[8];
		int[] b=new int[8];
		
		System.out.println("Enter 4 bits: ");
		a[3]=sc.nextInt();
		a[5]=sc.nextInt();
		a[6]=sc.nextInt();
		a[7]=sc.nextInt();
		
		a[1]=a[3]^a[5]^a[7];
		a[2]=a[3]^a[6]^a[7];
		a[4]=a[5]^a[6]^a[7];
		
		System.out.println("Data along with parity and database is: ");
		for(int i=1; i<8; i++)
		{
			System.out.print(a[i]+"\t");
		}
		
		System.out.println("\nEnter the data received for checking: ");
		for(int i=1; i<8; i++)
		{
			b[i]=sc.nextInt();
		}
		
		c1=b[1]^b[3]^b[5]^b[7];
		c2=b[2]^b[3]^b[6]^b[7];
		c3=b[4]^b[5]^b[6]^b[7];
		
		int dec=c1*1+c2*2+c3*4;
		
		if(dec==0)
		{
			System.out.println("There is no error in the code.");
		}else{			
			System.out.println("There is error in position: "+dec);
			if(b[dec]==0) {
				b[dec]=1;
			}else {
				b[dec]=0;
			}
			System.out.println("Data after correcting error is: ");
			for(int i=1; i<8; i++)
			{
				System.out.print(b[i]+"\t");
			}
			
		}
		sc.close();
		
	}
	
}
