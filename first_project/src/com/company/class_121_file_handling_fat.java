package com.company;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class class_121_file_handling_fat {
	public static void main(String[] args) throws IOException {
		Scanner sc=new Scanner(System.in);
		String name1, name2, name3, name4;
		name1=sc.next();
		name2=sc.next();
		name3=sc.next();
		name4=sc.next();
		
		try {
	      FileWriter myWriter = new FileWriter("filename.txt");
	      myWriter.write(name1);
	      myWriter.write(name2);
	      myWriter.write(name3);
	      myWriter.write(name4);
	      myWriter.close();
	      System.out.println("Successfully wrote to the file.");
	    } catch (IOException e) {
	      System.out.println("An error occurred.");
	      e.printStackTrace();
	    }
		
		try {
	      File myObj = new File("filename.txt");
	      Scanner myReader = new Scanner(myObj);
	      while (myReader.hasNextLine()) {
	        String data = myReader.nextLine();
	        if (data.startsWith(data, 'a') || data.startsWith(data, 'e'))
	        {
	        	try {
	        	FileWriter myWriter = new FileWriter("filename2.txt");
	  	      	myWriter.write(data);
	        	}catch(Exception e)
	        	{
	        		System.out.println("Exception occured. ");
	        	}
	        }else
	        {
	        	try {
	        	FileWriter myWriter = new FileWriter("filename3.txt");
		  	     myWriter.write(data);
	        	}
	        	catch(Exception e2)
	        	{
	        		System.out.println("Exception occured. ");
	        	}
	        }
	      }
	      myReader.close();
	    } catch (FileNotFoundException e) {
	      System.out.println("An error occurred.");
	      e.printStackTrace();
	    }
		
	}
}
