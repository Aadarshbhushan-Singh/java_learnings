import java.util.*;
public class Class_21_ArrayDeque {
	public static void main(String[] args) {
		
		ArrayDeque<Integer> dq=new ArrayDeque<>();
		
		//offer() and offerLast() adds at last
		dq.offer(30);
		dq.offer(50);
		
		dq.offerFirst(40);
		dq.offerFirst(20);
		
		
		System.out.println(dq);
		
		dq.peek();
		System.out.println(dq);
		
		dq.peekFirst();
		System.out.println(dq);
		
		dq.peekLast();
		
		dq.poll();
		System.out.println(dq);
		
		dq.pollFirst();
		System.out.println(dq);
		
		dq.pollLast();
		System.out.println(dq);
		
		
		
	
	}
}
