package com.company;

import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;

public class class_118_mohan_fat {
	public static String str1;
	public static int count=0;
	public static void main(String[] args) throws InterruptedException
	{
		Scanner sc=new Scanner(System.in);
		Thread tr1 = new Thread(new Runnable() {
			
			@Override
			public void run() {
				System.out.println("Started");
				str1=sc.next();
				str1=str1+str1.toUpperCase();
				System.out.println(str1);
			}
		});
		
		Thread tr2 = new Thread(new Runnable() {
			
			@Override
			public void run() {
				try {
				for (int i=0 ; i<str1.length(); i++){
			         char ch = str1.charAt(i);
			         if(ch == 'a'|| ch == 'e'|| ch == 'i' ||ch == 'o' ||ch == 'u'|| ch == 'A'|| ch == 'E'|| ch == 'I' ||ch == 'O' ||ch == 'U'){
			            count ++;
			         }
			     }
				FileWriter myWriter = new FileWriter("filename.txt");
			    myWriter.write("Files in Java might be tricky, but it is fun enough!");
			    myWriter.close();
				}catch(Exception e)
				{
					e.getMessage();
				}
			}
		});
		
		
		tr1.start();
		tr1.join();
		tr2.start();
		tr2.join();
	}
}
