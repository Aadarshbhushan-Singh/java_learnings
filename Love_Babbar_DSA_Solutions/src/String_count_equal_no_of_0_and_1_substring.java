import java.util.*;
public class String_count_equal_no_of_0_and_1_substring {
	public static void main(String[] args) {
		String str = "0100110101" ;
		int count=0;
		for(int i=0; i<str.length(); i++) {
			for(int j=i; j<str.length(); j++) {
				String ele=str.substring(i, j+1);
				System.out.println(ele);
				if(checkBalanced(ele)==true) {
					System.out.println(checkBalanced(ele));
					count++;
				}
			}
		}
		
		System.out.println(checkBalanced("0001111"));
		
		System.out.println(count);
	}
	
//	static boolean checkEuqalNoOfZerosAndOne(String str) { // This function simply checks the equal no of zeros and ones.
//		int nZero=0;
//		int nOne=0;
//		
//		for(int i=0; i<str.length(); i++) {
//			if(str.charAt(i)=='0') {
//				nZero++;
//			}else {
//				nOne++;
//			}
//		}
//		
//		if(nZero==nOne) {
//			return true;
//		}
//		
//		
//		return false;
//	}
	
	static boolean checkBalanced(String str) { // This function checks equal no of zeros and ones and also whether it is balanced or not eg: 01, 0011
		int x=str.length();
		if(x%2!=0) {
			return false;
		}
		for(int i=0; i<x/2; i++) {
			if(str.charAt(i)!='0') {
				return false;
			}
		}
		
		for(int i=x/2; i<x; i++) {
			if(str.charAt(i)!='1') {
				return false;
			}
		}
		
		return true;
	}
}
