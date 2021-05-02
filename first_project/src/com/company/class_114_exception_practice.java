package com.company;

public class class_114_exception_practice {
	private static final Exception IllegalArgumentException = null;

	public static void main(String[] args) {
		String mobNo;
		String panNo;
		
		try {
			int i=3;
			throw new IllegalArgumentException();
//			if(mobNo.length()<9)
//			{
//				
//			}
		}catch(IllegalArgumentException e1){
			
			System.out.println(e1.getMessage());
			System.out.println("Mobile no is less than length 10");
		}
		
		try {
			throw new NumberFormatException();
		}catch(NumberFormatException e2)
		{
			System.out.println(e2.getMessage());
		}
		finally {
			System.out.println("Hello world");
		}
		
	}
	
}
