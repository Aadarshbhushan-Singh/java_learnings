import java.util.Scanner;

public class Class_7_Binary_Search {
	public static void binarySearch(int ele, int[]array)
	{
		int left=0;
		int right=array.length-1;
		
		
		
		while(left<right)
		{
			int mid=((left+right)/2);
			if(ele==array[left])
			{
				System.out.println("\nElement found at: "+(left+1));
				break;
			}else if(ele==array[right])
			{
				System.out.println("\nElement found at: "+(right+1));
				break;
			}else if(ele==array[mid]){
				System.out.println("\nElement found at : "+(mid+1));
				break;
			}else
			{
				if(ele>array[mid])
					left=mid+1;
				else if(ele<array[mid])
					right=mid-1;
			}
			
		}
		if(left>=right)
		{
			System.out.println("\nElement not found.");
		}
		
	}
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int[] array= {10,20,30,40,50,60};
		
		//Printing array
		System.out.println("Array is: ");
		for(int i=0; i<array.length; i++)
		{
			System.out.print(array[i]+" ");
		}
		
		binarySearch(40, array);
		binarySearch(10, array);
		binarySearch(100, array);
		
	}
}
