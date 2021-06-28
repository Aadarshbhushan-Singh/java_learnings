package com.company;
import java.util.Scanner;
import java.io.FileWriter;

public class class_95_writing_into_file {
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		String command=sc.nextLine();
		
		if(command.startsWith("write-file"))
		{
			try {
				String fileName=command.substring(11);
				FileWriter myWriter=new FileWriter(fileName);
				String content=sc.nextLine();
				myWriter.write(content);
				myWriter.close();
				System.out.println("Successfully wrote to the file.");
			}catch (Exception e)
			{
				System.out.println("An error occured.");
			}
		}else
		{
			System.out.println("Wrong command input.");
		}
		
	}
	
}
