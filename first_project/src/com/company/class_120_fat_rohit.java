package com.company;

import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

public class class_120_fat_rohit {

	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
        int age;
        int year, month, day;
        year=sc.nextInt();
        month=sc.nextInt();
        day=sc.nextInt();
        LocalDate birthdate = new LocalDate (year, month, day);      //Birth date
        LocalDate now = new LocalDate();                        //Today's date
         
        Period period = new Period(birthdate, now, PeriodType.yearMonthDay());
         
        //Now access the values as below
        age=period.getYears();
        try {
       	if(age>18)
        	{
        		throw new InvalidException("Not valid");
        	}else {
        		System.out.println("You can vote.");
        	}
        }
        catch(InvalidException m)
        {
        	System.out.println("Exception occured. You cannot vote."+m);
        }
	}

}

class InvalidException extends Exception{  
 InvalidException(String s){  
  super(s);  
 }  
}
