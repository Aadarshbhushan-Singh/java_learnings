package com.company;
import java.util.ArrayList;
import java.util.List;

public class class_89_collection_framework {
	public static void main(String[] args)
	{
		//Without generics
//		ArrayList fruits=new ArrayList();
//		fruits.add("Mango");
//		fruits.add(23);
//		System.out.println(fruits);
		
		//With generics
//		ArrayList <String> fruits=new ArrayList();
//		fruits.add("Apple");
//		fruits.add("Mango");
//		fruits.add("34");
//		System.out.println(fruits);
		
		ArrayList <Integer> marks=new ArrayList();
		marks.add(93);
		marks.add(85);
		marks.add(56);
		marks.add(98);
		marks.add(70);
		
		System.out.println(marks);
		
		List <Integer> grades=new ArrayList();
		grades.add(90);
		grades.add(78);
		grades.add(56);
		
		marks.addAll(grades);
		
		System.out.println("New marks: "+marks);
		System.out.println(marks.get(2)); //Integer inside brackets returns value at that index.
		
		marks.set(2, 526); //Replaces element at particular index.
		System.out.println(marks.get(2));
		
		marks.remove(2); //Removes element at particular index.
		System.out.println(marks.get(2));
		
		int a=marks.size();
		System.out.println("Size of marks is: "+a);
		
		marks.removeAll(grades); //This will remove the elements of grade from marks.
		System.out.println(marks);
		
		System.out.println(marks.contains(98)); //Will return true because 98 is in marks.
		System.out.println(marks.contains(900)); //Will return false because 900 is not in marks. 
		
		System.out.println(marks.isEmpty()); //Will return false because marks is not empty. 
		
		marks.clear(); //Deletes all the elements from ArrayList.
		int b=marks.size();
		System.out.println("Size of marks is: "+b);
		
		System.out.println(marks.isEmpty()); //Will return true because marks is empty. 
		
		//This code was written while practising generic class. 
//		class_90_generic<String, Integer> obj1=new class_90_generic("Aadarsh", 87);
//		class_90_generic<Boolean, Integer> obj2=new class_90_generic(true, 876);
//		
//		obj1.getDiscription();
//		obj2.getDiscription();
//		
//		Boolean x=false;
//		System.out.println(x);
		
		
		List <String> vegetables=new ArrayList<String>();
		vegetables.add("Brinjal");
		vegetables.add("Pumpkin");
		vegetables.add("Potato");
		
		String temp[] =new String[vegetables.size()];
		vegetables.toArray(temp);
		
		for(String e: temp)
		{
			System.out.println(e);
		}
		
	}
}
