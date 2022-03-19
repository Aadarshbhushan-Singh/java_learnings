import java.util.*;
public class Array_check_if_given_string_is_suffled_or_not {
	public static void main(String[] args) {
		String str="1YX2";
		String first="13";
		String second="XY";
		String checkStr=first.concat(second);
		
		ArrayList<Character> arr1=new ArrayList<>();
		ArrayList<Character> arr2=new ArrayList<>();
		
		if(str.length()!=checkStr.length()) {
			System.out.println("Not matched!");			
		}else {
			for(int i=0; i<str.length(); i++) {
				char ele=str.charAt(i);
				arr1.add(ele);
				
				char ele2=checkStr.charAt(i);
				arr2.add(ele2);
			}
			
			Collections.sort(arr1);
			Collections.sort(arr2);
			
			
			if(arr1.equals(arr2)) {
				System.out.println("Matched");
			}else {
				System.out.println("Not Matched");
			}
			
		}
	}
}
