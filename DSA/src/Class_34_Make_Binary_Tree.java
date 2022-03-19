import java.util.*;

class Node{
	Node left, right;
	int data;
	public Node(int data) {
		this.data=data;
	}
}


public class Class_34_Make_Binary_Tree {
	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) {
		System.out.println("Started: ");
		Node root=createTree();
		System.out.println("InOrder: ");
		inOrder(root);
		System.out.println("PreOrder: ");
		preOrder(root);
		System.out.println("PostOrder: ");
		postOrder(root);
		
		
	}	
	
	static Node createTree() {
		Node root=null;
		
		System.out.println("Enter the data: ");
		int data=sc.nextInt();
		
		if(data==-1) {
			return null;
		}
		root=new Node(data);
		System.out.println("Enter the left of "+data);
		Node left=createTree();
		
		System.out.println("Enter the right of "+data);
		Node right=createTree();
		
		return root;
	}
	
	static void inOrder(Node root) {
		if(root==null) return;
		
		inOrder(root.left);
		System.out.print(root.data+" ");
		inOrder(root.right);
	}
	
	static void preOrder(Node root) {
		if(root==null) return; 
		
		System.out.println(root.data+" ");
		preOrder(root.left);
		preOrder(root.right);
	}
	
	static void postOrder(Node root) {
		if(root==null) return; 
		
		postOrder(root.left);
		postOrder(root.right);
		System.out.println(root.data+ " ");
	}
}
