package com.company;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class class_96_reading_files {
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		String command=sc.nextLine();
		if(command.startsWith("read-file"))
		{
			try {
				String fileName=command.substring(10);
				File myObj=new File(fileName);
				Scanner myReader=new Scanner(myObj);
				while(myReader.hasNextLine())
				{
					String data=myReader.nextLine();
					System.out.println(data);
				}
				myReader.close();
			}catch(Exception e)
			{
				System.out.println("No such file exists.");
//				e.printStackTrace();
			}
		}
		sc.close();
	}
	
}
