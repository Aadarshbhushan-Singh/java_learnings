package com.company;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class class_73_try_with_resources {
	public static void main(String[] args) throws Exception{
		BufferedReader bfr=null;
		try {
			String str="";
			bfr=new BufferedReader(new InputStreamReader(System.in));
			System.out.println("Enter the text: ");
			str=bfr.readLine();
		}
		catch(Exception e) {
			System.out.println(e);
		}
		finally{
			bfr.close();
		}
		
		
		
		bfr.close();
	}
}
