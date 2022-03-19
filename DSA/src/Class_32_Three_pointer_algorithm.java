import java.util.*;
public class Class_32_Three_pointer_algorithm {
	public static void main(String[] args) {
		int[] arr=new int[] {1, 23, 2, 21, 10, 5, 3, 6, 15, 24, 25, 0};
		int sum=25;
		int n=arr.length;
		//By using brute force
		for(int i=0; i<n; i++) {
			for(int j=i+1; j<n; j++) {
				for(int k=j+1; k<n; k++) {
					if(arr[i]+arr[j]+arr[k]==25) {
						System.out.println("Numbers found: "+arr[i]+" "+arr[j]+" "+arr[k]);
					}
				}
			}
		}
		
		System.out.println();
		
		
		//Using two pointer algorithm
		Arrays.sort(arr);
		int start=0;
		while(start<n) {
			int middle=start+1;
			int end=n-1;
			while(middle<end) {
				if(arr[middle]+arr[end]<(25-arr[start])) {
					middle++;
				}else if(arr[middle]+arr[end]>(25-arr[start])) {
					end--;
				}else {
					System.out.println("Numbers found: "+arr[start]+" "+arr[middle]+" "+arr[end]);
					middle++;
					end--;
				}
			}
			start++;
		}
		
		
	}
}
