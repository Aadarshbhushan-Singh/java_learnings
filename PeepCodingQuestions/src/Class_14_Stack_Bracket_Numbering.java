import java.util.Scanner;
import java.util.*;
public class Class_14_Stack_Bracket_Numbering {
	public static void main(String[] args) {
		// Input : (a+(b*c))+(d/e)
		// Output : 1 2 2 1 3 3
		
		String eqn="(a+(b*c))+(d/e)";
		Stack<Integer> st=new Stack<>();
		
		int count=0;
		for(int i=0; i<eqn.length(); i++) {
			char c=eqn.charAt(i);
			if(c=='(') {
				count++;
				System.out.println(count);
				st.push(count);
			}else if(c==')') {
				System.out.println(st.pop());
			}
		}
		
		
		
	}
}
