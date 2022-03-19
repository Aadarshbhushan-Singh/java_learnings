import java.util.*;
public class String_count_duplicate_char {
	public static void main(String[] args) {
		String str="geeksforgeeks";
		
//		int[] count=new int[256];
//		
//		for(int i=0; i<str.length(); i++) {
//			count[str.charAt(i)+0]++;
//		}
//		
//		for(int i=0; i<256; i++) {
//			if(count[i]>0) {
//				System.out.println((char)i+" count is "+count[i]);
//			}
//		}
		
		Map<Character, Integer> map1=new HashMap<>();
		for(int i=0; i<str.length(); i++) {
			if(map1.containsKey(str.charAt(i))) {
				
				int val=map1.get(str.charAt(i));
				map1.put(str.charAt(i), (++val));
			}else {
				map1.put(str.charAt(i), 1);
			}
		}
		
		System.out.println(map1);
	}
}
