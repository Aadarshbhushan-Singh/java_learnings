import java.util.*;
public class Class_22_Set {
	public static void main(String[] args) {
		//HashSet doesnot maintains order, LinkedHashSet does
		
		//HashSet O(1), LinkedHashSet O(n), TreeSet O(logn)
		
		Set<Integer> set1=new HashSet<>();
		
		set1.add(34);
		set1.add(21);
		set1.add(90);
		set1.add(12);
		set1.add(34);
		
		System.out.println(set1);
		
		set1.remove(34);
		
		System.out.println(set1);
		
		System.out.println(set1.contains(34));
		System.out.println(set1.contains(12));
		
		set1.clear();
		System.out.println(set1);
		
		
		
	}
}
