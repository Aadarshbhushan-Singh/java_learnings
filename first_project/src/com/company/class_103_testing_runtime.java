package com.company;
import java.io.IOException;
import java.util.Scanner;

public class class_103_testing_runtime {
	public static void main(String args[]) throws IOException	
	{
		Scanner sc=new Scanner(System.in);
		String command=sc.nextLine();
		
		if (command.equals("ipconfig"))
		{
			
			//compile
			Runtime r=Runtime.getRuntime();
			r.exec("g++ hello.cpp -o obj1.exe");
			System.out.println("Compiled.");
			
		}
	}
}
