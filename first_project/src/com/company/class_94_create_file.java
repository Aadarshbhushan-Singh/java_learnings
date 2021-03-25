package com.company;
import java.io.File;  // Import the File class
import java.io.IOException;
import java.util.Scanner;

public class class_94_create_file {
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		String command=sc.nextLine();
		if (command.startsWith("create-file"))
		{
			
			try {
				String fileName=command.substring(12);
				File myObj=new File(fileName);
				if(myObj.createNewFile()) {
					System.out.println("File Created Successfully.");
				}else
				{
					System.out.println("File already exists.");
				}
			}catch (Exception e)
			{
				System.out.println("An error occured.");
				e.printStackTrace();
			}
		}else
		{
			System.out.println("Wrong input.");
		}
		
		sc.close();
	}
	
}
