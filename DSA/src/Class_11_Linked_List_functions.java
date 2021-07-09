import java.util.*;
public class Class_11_Linked_List_functions {
	public static void main(String[] args) {
		/*
		 * add(element)
		 * addAll(Collection)
		 * get(index)
		 * set(index, value)
		 * remove(index)
		 * removeAll()
		 * clear()
		 * size()
		 * contains() checks if another substring is present in it or not
		 * isEmpty()
		 * toArray() //converts to array
		 * 
		 * */
		
		
		List<Integer> list1=new LinkedList<>();
		list1.add(30);
		list1.add(40);
		list1.add(89);
		
		System.out.println(list1);
		
		//returns array of linked list
		list1.toArray();
		
		System.out.println(list1);
		
		List<Integer> ll=new LinkedList<>(); //ll -> LinkedList
		List<Integer> al=new ArrayList<>(); //al -> ArrayList
		
		getTimeDifference(ll);
		getTimeDifference(al);
		
	}
	static void getTimeDifference(List<Integer> list)
	{
		long start = System.currentTimeMillis();
		
		for(int i=0; i<100000; i++)
		{
			list.add(0, i);
		}
		
		long end=System.currentTimeMillis();
		
		System.out.println(list.getClass().getName()+"-->"+(end-start));
		
	}
}
