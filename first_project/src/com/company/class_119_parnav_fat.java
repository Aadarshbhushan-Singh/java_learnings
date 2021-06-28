package com.company;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class class_119_parnav_fat {
	public static void main(String[] args) {
		File obj1 = new File("file1.txt");
		int s=0;
		int char10=0;
		try {
			Scanner sc = new Scanner(obj1);
			while (sc.hasNext()) {
				String str=sc.next();
				if (str.startsWith("S"))
				{
					s+=1;
				}
				if(str.length()<10)
				{
					char10+=1;	
				}
			}
			sc.close();
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		System.out.println("Total no of countries whose name starts with s: "+s);
		System.out.println("Total no of countries whose name has length less than 10: "+char10);
	}
}
