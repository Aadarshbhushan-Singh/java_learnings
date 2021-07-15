
public class Class_14_selection_sort {
	public static void main(String[] args) {
		int[] arr= {5, 2, 4, 10, 23, 11};
		selectionSort(arr);
		for(int ele: arr)
		{
			System.out.print(ele+" ");
		}
	}
	static void swap(int[] arr, int i, int j)
	{
		int temp=arr[i];
		arr[i]=arr[j];
		arr[j]=temp;
	}
	static void selectionSort(int[] arr) {
		for(int i=0; i<arr.length-1; i++) 
		{
			int max=arr[i];
			int jIndex=i;
			for(int j=i+1; j<arr.length; j++) 
			{
				if(arr[j]>max) 
				{
					max=arr[j];
					jIndex=j;
				}
			}
			swap(arr, i, jIndex);
		}
	}
}
