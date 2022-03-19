package com.company;

public class Class_130_convert_int_str {
	public static void main(String[] args) {
		int n=1004;
		String str=String.valueOf(n);
		System.out.println(str);
		String repStr=str.replace('0','5');
		
		System.out.println("Replaced: "+repStr);
		
		int num=Integer.parseInt(repStr);
		System.out.println("Number: "+num);
		
	}
}
