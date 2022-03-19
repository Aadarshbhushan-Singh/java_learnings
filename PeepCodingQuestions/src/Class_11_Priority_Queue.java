import java.util.PriorityQueue;
public class Class_11_Priority_Queue {
	public static void main(String[] args) {
//		PriorityQueue<String> pq=new PriorityQueue<>();
//		
//		//Adding elements 
//		pq.add("Aadarsh");
//		pq.add("Pranjal");
//		pq.add("Deepak");
//		pq.add("Sunny");
//		
//		System.out.println(pq);
//		
//		System.out.println(pq.remove());
//		System.out.println(pq.remove());
//		System.out.println(pq.remove());
//		System.out.println(pq.remove());
		

		PriorityQueue<Integer> pq1=new PriorityQueue<>();
		
		pq1.add(100);
		pq1.add(102);
		pq1.add(99);
		pq1.add(902);
		
		//Priority is not sorted
		System.out.println(pq1);
		
		//They are removed on the basis of priority
		System.out.println(pq1.remove());
		System.out.println(pq1.remove());

		System.out.println(pq1.poll());
		
		
		
		
	}
}
