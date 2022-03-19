import java.util.*;
public class Class_12_Print_all_SubArray {
	public static void main(String args[]) {
		
		int[] arr1= {1,2,3,4,5};
		
		for(int i=0; i<arr1.length; i++) {
			for(int j=i; j<arr1.length; j++) {
				for(int k=i; k<=j; k++) {
					System.out.print(arr1[k]+" ");
				}
				System.out.println();
			}
		}
		
	}
}
