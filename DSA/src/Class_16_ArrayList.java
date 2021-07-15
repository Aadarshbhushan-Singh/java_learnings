import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Class_16_ArrayList {
	public static void main(String[] args) {
		ArrayList<Integer> array1=new ArrayList<>();
		array1.add(30);
		array1.add(50);
		array1.add(100);
		array1.add(120);
		array1.add(4);
		array1.add(2);
		array1.add(3);
		
		
		System.out.println(array1);
		
		array1.remove(1);
		array1.remove(Integer.valueOf(30));
		
		System.out.println(array1);
			
		array1.removeIf(n -> n>20);
		System.out.println(array1);
		
		array1.add(0, 100);
		System.out.println(array1);
		
		ArrayList<Integer> array2=new ArrayList<>();
		array2.add(1001);
		array2.add(1002);
		array2.add(1003);
		
		array1.addAll(array2);
		System.out.println(array1);
		
		ArrayList<Integer> array3=new ArrayList<>();
		array3=(ArrayList<Integer>) array2.clone();
		System.out.println(array3);
		
		System.out.println(array1.contains(30));
		System.out.println(array1.containsAll(array2));
		
		
		array1.set(3, 10000);
		System.out.println(array1);
		
		//Classical method
		for(int i=0; i<array1.size(); i++) {
			System.out.println("Element is: "+array1.get(i));
		}
		
		//Not working like this
		for(Integer element:array1) {
			element=(element*2);
		}
		System.out.println(array1);
		
		
		//Traverse through iterator
		Iterator<Integer> it=array1.iterator();
		while(it.hasNext()) {
			System.out.println("Iterator element: "+it.next());
		}
		
		
		
	}
}
