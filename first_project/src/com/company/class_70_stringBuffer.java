package com.company;

public class class_70_stringBuffer {	
	public static void main(String[] args) {
		StringBuffer sbr=new StringBuffer("Hello");
		sbr.append("**Hi");
		System.out.println(sbr);
		sbr.replace(1, 3, "------");
		System.out.println(sbr);
		sbr.delete(3, 6);
		System.out.println(sbr);
	}
}
