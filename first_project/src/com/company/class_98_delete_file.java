package com.company;
import java.io.*;
import java.util.Scanner;

public class class_98_delete_file {
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		String command=sc.nextLine();
		
		if(command.startsWith("delete-file"))
		{
			
			try{
				String fileName=command.substring(12);
				File myObj=new File(fileName);
				if(myObj.delete())
				{
					System.out.println("File deleted successfully.");
				}else {
					System.out.println("No such file exists.");
				}
			}catch(Exception e)
			{
				System.out.println("An error occured.");
			}
			
		}
	}
	
}
