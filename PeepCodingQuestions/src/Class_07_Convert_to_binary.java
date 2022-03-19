import java.util.*;

public class Class_07_Convert_to_binary {
	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		
		int n=scn.nextInt();
		
		for(int i=0; i<n; i++) {
			String binary=convertBinary(i, n);
			System.out.println(binary);
		}
	}
	
	public static String convertBinary(int n, int size) {
		int[] a=new int[size];
		
		String s="";
		for(int i=0; i<size; i++) {
			int rem=n%2;
			n=n/2;
			a[i]=rem;
		}
		
		for(int i=size-1; i>=0; i--) {
			s=s+a[i];
		}
		
		return s;
	}
}
