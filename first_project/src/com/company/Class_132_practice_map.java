package com.company;
import java.util.*;

public class Class_132_practice_map {
	public static void main(String[] args) {
		Map<String, Integer> map1=new HashMap<String, Integer>();
		
		map1.put("Aadarsh", 20);
		map1.put("Pranjal", 21);
		
		System.out.println(map1);
		
		System.out.println(map1.get("Aadarsh"));
		System.out.println(map1.get(21)); //If key is not available, it will show null.
		
		Map<String, String> map2=new HashMap<String, String>();
		
		map2.put("Aadarsh", "Singh");
		map2.put("Pranjal", "Gupta");
		map2.put("Sassy", "Boy");
		map2.put("Aadarsh", "Bhushan"); //If value is already present, it is updated
		
		System.out.println(map2);
		
		System.out.println(map2.get("Aadarsh"));
		
		//Printing map key in proper way
		Set<String> set1=map2.keySet();
		for(String keys: set1) {
			System.out.println(keys+" "+map2.get(keys));
		}
		
		
	}
}
