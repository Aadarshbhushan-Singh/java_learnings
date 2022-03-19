
public class Class_08_Find_Substring {
	public static void main(String[] args) {
		String str="abbcc";
		
		for(int i=0; i<str.length(); i++) {
			for(int j=i; j<str.length(); j++) {
				String str2=str.substring(i, j+1);
				System.out.println(str2);
				System.out.println(checkPalindrome(str2));
			}
			System.out.println();
		}
		
		
	}
	
	
	static boolean checkPalindrome(String str) {
		for(int i=0, j=(str.length()-1); i<str.length()/2; i++, j--) {
			if(str.charAt(i)!=str.charAt(j)) {
				return false;
			}
		}
		
		return true;
	}
}
