import java.util.*;
public class Class_18_stacks {

	public static void main(String[] args) {
		Stack<String> stack1=new Stack<String>();
		
		stack1.push("Hello world");
		stack1.push("Elephant");
		stack1.push("Horse");
		stack1.push("Tiger");
		
		System.out.println(stack1);
		
		System.out.println(stack1.peek());
		
		stack1.pop();
		System.out.println(stack1);
		System.out.println(stack1.peek());
		
		//Returns 1 if present else returns -1
		System.out.println(stack1.search("Horse"));
		System.out.println(stack1.search("Horsssssssse"));

	}

}
