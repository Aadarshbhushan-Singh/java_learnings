import java.util.*;
public class Class_27_LearnArrayClass {
	public static void main(String[] args) {
		Integer[] numbers= {10, 23, 12, 65, 56};
		Arrays.sort(numbers);
		for(int ele: numbers) {
			System.out.println(ele);
		}
		
		List<Integer> list1=new ArrayList<>();
		list1.add(30);
		list1.add(40);
		list1.add(40);
		list1.add(120);
		list1.add(3);
		list1.add(380);
		System.out.println("Min: "+Collections.min(list1));
		System.out.println("Max: "+Collections.max(list1));
		System.out.println("Frequency of 40: "+Collections.frequency(list1, 40));
		
		Collections.sort(list1);
		System.out.println(list1);
		
		Collections.sort(list1, Comparator.reverseOrder());
		System.out.println(list1);
	}
}
