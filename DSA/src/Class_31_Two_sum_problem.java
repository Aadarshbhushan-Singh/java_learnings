import java.util.*;
public class Class_31_Two_sum_problem {
	public static void main(String[] args) {
		int[] arr=new int[] {1, 23, 21, 10, 5, 3, 6, 15, 24, 25, 0};
		int sum=25;
		
		
		//Solving with brute force method
//		for(int i=0; i<arr.length; i++) {
//			for(int j=i; j<arr.length; j++) {
//				if(arr[i]+arr[j]==25) {
//					System.out.println("Pair found: "+arr[i]+" "+arr[j]);
//				}
//			}
//		}

		//Solving with two pointer algorithm
		Arrays.sort(arr);
		int start=0;
		int end=arr.length-1;
		while(start<end) {
			if(arr[start]+arr[end]<25) {
				start++;
			}else if(arr[start]+arr[end]>25) {
				end--;
			}else {
				System.out.println("Pair found: "+arr[start]+" "+arr[end]);
				start++;
				end--;
			}
		}
	}
}
