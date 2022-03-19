import java.util.*;

public class String_print_permutations {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		String str = scn.next();
		System.out.println(str);
		
		printPermutation(str, "");
	}
	
	static void printPermutation(String ques, String ans) {
		if(ques.length() == 0) {
			System.out.println(ans);
			return;
		}
		for(int i = 0; i < ques.length(); i++) {
			char ch = ques.charAt(i);
			String lqp = ques.substring(0, i);
			String rqp = ques.substring(i+1);
			String roq = lqp + rqp;
			printPermutation(roq, ans + ch);
		}
	}

}
