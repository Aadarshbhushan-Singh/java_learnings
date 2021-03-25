package com.company;
import java.io.*;
import java.util.Scanner;

public class class_97_getting_file_info {
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		String command=sc.nextLine();
		
		if(command.startsWith("file-info"))
		{
			try {
				String fileName=command.substring(10);
				File myObj=new File(fileName);
				if(myObj.exists()) {
					System.out.println("File name: "+myObj.getName());
					System.out.println("Absolute path: "+myObj.getAbsolutePath());
					System.out.println("Writable: "+myObj.canWrite());
					System.out.println("Readable: "+myObj.canRead());
					System.out.println("File size in bytes: "+myObj.length());
				}else
				{
					System.out.println("No such file exists.");
				}
				
			}catch(Exception e)
			{
				System.out.println(e);
			}
		}
	}
	
	
}
