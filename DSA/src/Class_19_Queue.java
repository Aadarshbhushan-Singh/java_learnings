import java.util.*;

public class Class_19_Queue {
	public static void main(String[] args) {
		Queue<Integer> queue1=new LinkedList<Integer>();
		
		queue1.offer(30);
		queue1.offer(20);
		queue1.offer(20);
		queue1.offer(60);
		queue1.offer(50);
		
		System.out.println(queue1);
		
		//Also returns the element after removing it
		System.out.println(queue1.poll());
		
		System.out.println(queue1);
		
		System.out.println(queue1.peek());
		System.out.println(queue1);
		
		System.out.println(queue1.element() );
	
	}
}
