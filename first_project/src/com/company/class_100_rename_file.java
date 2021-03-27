package com.company;
import java.io.*;
import java.nio.file.Files;
import java.util.Scanner;

public class class_100_rename_file {
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		String command=sc.nextLine();
		
		if(command.startsWith("rename-file"))
		{
			try{
				String fileName=command.substring(12);
				File originalFile=new File(fileName);
				if(originalFile.exists())
				{
					System.out.println("Enter new name: ");
					String newName=sc.nextLine();
					File renamedFile=new File(newName);
					if(originalFile.renameTo(renamedFile))
					{
						System.out.println(originalFile.getName()+" renamed to "+renamedFile.getName());
					}else {
						System.out.println("File renameing failed.");
					}
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
