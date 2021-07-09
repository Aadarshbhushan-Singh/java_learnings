
public class Class_12_Linked_List_Implementation {
	static class Node{
		int data;
		Node next;
		
		Node(int data)
		{
			this.data=data;
			next=null;
		}
	}
	static Node head;
	static void add(int data)
	{
		Node toAdd=new Node(data);
		toAdd.next=null;
		
		if(isEmpty())
		{
			head=toAdd;
			return; 
		}
		
		Node temp=head;
		while(temp.next!=null)
		{
			temp=temp.next;
		}
		temp.next=toAdd;
	}
	static boolean isEmpty()
	{
		return head==null;
	}
	
	static void print()
	{
		Node temp=head;
		while(temp!=null)
		{
			System.out.println(temp.data);
		}
	}
	
	public static void main(String[] args)
	{
		add(10);
		add(20);
		
		print();
	}
}
