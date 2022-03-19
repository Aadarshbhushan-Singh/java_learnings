import java.util.*;
class Node1{
	Node1 left;
	Node1 right;
	int data;
	
	public Node1(int data) {
		this.data=data;
	}
}

public class Practice {
	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) {
		System.out.println("Started: ");
		Node1 root=createTree();
	}
	
	static Node1 createTree() {
		Node1 root=null;
		
		System.out.println("Enter the data: ");
		int data=sc.nextInt();
		
		if(data==-1) {
			return null;
		}
		
		System.out.println("Enter the left of "+data);
		Node1 left=createTree();
		
		System.out.println("Enter the right of "+data);
		Node1 right=createTree();
		
		return root;
	}
}
