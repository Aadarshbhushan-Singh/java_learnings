import java.util.*;

/*
 * hash.add(int);
 * hash.contain(element);
 * hash.remove(element);
 * hash.isEmpty(); returns true or false
 * hash.size();
 * 
 * */

public class Class_15_hashing {
	public static void main(String[] args) {
		HashSet<Integer> hash1=new HashSet<>();
		hash1.add(5);
		hash1.add(20);
		hash1.add(30);
		
		//Prints the set
		System.out.println(hash1);
		
		if(hash1.contains(20)) {
			System.out.println("Yes 20 is present.");
		}else {
			System.out.println("No, 20 is not present.");
		}
		
		hash1.remove(30);
		System.out.println(hash1);
		
		System.out.println("Empty or not: "+hash1.isEmpty());
		
		System.out.println("Size of hash: "+hash1.size());
		
		hash1.clear(); //clears the hash
		System.out.println("Empty or not: "+hash1.isEmpty());
		
		
	}
}
