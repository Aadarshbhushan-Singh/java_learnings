import java.util.Scanner;

public class Class_31_Binary_Array_Sorting {
	public static void main(String[] args) {
//		Scanner sc=new Scanner(System.in);
		int[] A= new int[]{1, 0, 1, 0, 0, 1, 0, 0, 0};
		binSort(A, A.length);
		
		for(int ele: A) {
			System.out.print(ele+" ");
		}
		System.out.println("Hello");
	}
	static void binSort(int A[], int N)
    {
        int start=0;
        int end=N-1;
        while(start<end){
            if(A[start]==1 && A[end]==1){
                end--;
            }else if(A[start]==0 && A[end]==1){
                start++;
                end--;
            }else if(A[start]==0 && A[end]==0){
                start++;
//            }else(A[start]==1 && A[0]==0){
            }else {
                swap(A, start, end);
                start++;
                end--;
            }
        }
    }
    
    static void swap(int[] A, int i, int end){
        int temp=A[i];
        A[i]=A[end];
        A[end]=temp;
    }
}
