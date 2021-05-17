import java.util.Scanner;

public class Class_6_Linear_Search {
	public static void linearSearch(int ele, int[]array)
	{
		boolean found=false;
		for(int i=0; i<array.length; i++)
		{
			if(array[i]==ele)
			{
				System.out.println("\nElement found at index: "+i+" position: "+(i+1));
				found=true;
			}
		}
		if(!found)
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
		
		linearSearch(40, array);
		linearSearch(100, array);
		
	}
}
