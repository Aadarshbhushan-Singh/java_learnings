import java.util.*;
import java.math.*;
public class Class_13_check_if_subarray_is_perfect_square {
	public static void main(String args[]) {
		Scanner scn=new Scanner(System.in);
	    int n=scn.nextInt();
	    int[] arr=new int[n];
	    for(int i=0; i<n; i++){
	        arr[i]=scn.nextInt();
	    }
	    int count=0;

	    for(int i=0; i<n; i++){
	        for(int j=i; j<n; j++){
	            if(checkSquare(arr, i, j)==true){
	                count++;
	            }
	        }
	    }

	    System.out.println(count);


	}
	
	public static boolean checkSquare(int[] arr, int s, int e){
	    int sum=0;
	    for(int i=s; i<=e; i++){
	        sum+=arr[i];
	    }
	
	    double sq=Math.sqrt(sum);
	    
	    if(sq-Math.floor(sq)==0){
	        return true;
	    }
	    return false;
	}
}
