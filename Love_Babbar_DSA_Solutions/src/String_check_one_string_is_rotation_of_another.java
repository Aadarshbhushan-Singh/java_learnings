import java.util.*;
public class String_check_one_string_is_rotation_of_another {
	public static void main(String[] args) {
		String str1="ABCD";
		String str2="CDAG";
		
		String temp=str1.concat(str1); //abcdcdab
		
		for(int i=0; i<=(temp.length()-str2.length()); i++) {
			if(temp.substring(i, i+4).equals(str2)) {
				System.out.println("Yes");
				break;
			}
		}
		
			
		
		
	}
}
