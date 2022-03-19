import java.util.*;
public class Class_20_Priority_Queue {
	public static void main(String[] args) {
		PriorityQueue<Integer> p1=new PriorityQueue<>();
		
		p1.offer(90);
		p1.offer(80);
		p1.offer(70);
		
		System.out.println(p1);
		
		//Highest priority is given to minimum element because this is implementing min heap
		p1.poll();
		
		System.out.println(p1);
		
		
		System.out.println(p1.peek());
		
		PriorityQueue<Integer> p2=new PriorityQueue<>(Comparator.reverseOrder());
		
		p2.offer(90);
		p2.offer(80);
		p2.offer(70);
		
		System.out.println(p2);
		
		//Highest priority is given to minimum element because this is implementing min heap
		p2.poll();
		
		System.out.println(p2);
		
		
		System.out.println(p2.peek());
		
		
		
		
		
		
	}
}
