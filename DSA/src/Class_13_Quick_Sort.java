
public class Class_13_Quick_Sort {
	public static void main(String[] args) {
		int[] arr= {4, 2, 6, 9, 12, 10, 8, 3, 2, -9};
		quickSort(arr, 0, arr.length-1);
		
		for(int ele: arr) {
			System.out.print(ele+" ");
		}
	}
	static void swap(int[] arr, int i, int j) {
		int temp=arr[i];
		arr[i]=arr[j];
		arr[j]=temp;
	}
	
	static int partition(int[] arr, int s, int e) {
		int pIndex=s;
		int pivot=arr[e];
		for(int i=s; i<e; i++)
		{
			if(arr[i]<=pivot)
			{
				swap(arr, i, pIndex);
				pIndex++;
			}
		}
		swap(arr, pIndex, e);
		return pIndex;
	}
	
	static void quickSort(int[] arr, int s, int e) {
		if(s<e) {
			int pivot=partition(arr, s, e);
			quickSort(arr, s, pivot-1);
			quickSort(arr, pivot, e);
		}
	}
}
