import java.util.*;

class Node{
	int data;
	ArrayList<Node> children = new ArrayList<>();
}


public class Class_16_Generic_Tree {
	
	//Displaying all the nodes of a generic tree -- first method is shown in Peepcoding, 2nd method is self done
	static void displayTree(Node root) {
//		String str = root.data + "-> ";
//		for(Node child: root.children) {
//			str = str + child.data + " , ";
//		}
//		
//		str = str + " - ";
//		
//		System.out.println(str);
//		
//		for(Node child: root.children) {
//			displayTree(child);
//		}
		
		
		
		System.out.print(root.data + " -> ");
		for(Node child: root.children) {
			System.out.print(child.data + " ");
		}
		System.out.println("-");
		for(Node child: root.children) {
			displayTree(child);
		}	
	}
	
	
	//Finding size of a generic tree
	static int size(Node root) {
		int size = 0;
		for(Node child: root.children) {
			int s = size(child);
			size = size + s;
		}
		
		size++;
		
		return size;
	}
	
	
	//Finding maximum of a generic tree
	static int maximum(Node root) {
		int max = root.data;
		
		for(Node child: root.children) {
			int temp = maximum(child);
			if(max < temp) {
				max = temp;
			}
		}
		
		return max;
	}
	
	
	//Finding the height of the tree
	public static int heightTree(Node root) {
		int ht = -1;
		
		for(Node child: root.children) {
			int ch = heightTree(child);
			ht = Math.max(ch,  ht);
		}
		
		ht+=1;
		
		return ht;
	}
	
	public static void main(String[] args) {
		int[] arr = {10, 20, -1, 30, 50, -1, 60, -1, -1, 40, -1, -1};
		
		Stack<Node> st = new Stack<>();
		
		Node root = new Node();
		for(int i = 0; i < arr.length; i++) {
			if(st.size() == 0) {
				root.data = arr[i];
				st.push(root);
			}else {
				if(arr[i] == -1) {
					st.pop();
				}else {
					Node temp = new Node();
					temp.data = arr[i];
					st.peek().children.add(temp);
					st.push(temp);
				}
			}
		}
		
		displayTree(root);
		
		System.out.println(size(root));
		
		System.out.println(maximum(root));
		
		System.out.println("Height of tree: " + heightTree(root));
		
	}
}
