package com.company;
import java.io.*;
import java.nio.file.Files;
import java.util.Scanner;

public class class_99_copy_file {
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		String command=sc.nextLine();
		
		if(command.startsWith("copy-file"))
		{
			try{
				String fileName=command.substring(10);
				File originalFile=new File(fileName);
				if(originalFile.exists())
				{
					File copiedFile=new File("copied_"+fileName);
					Files.copy(originalFile.toPath(), copiedFile.toPath());
					System.out.println("File copied successfully.");
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
