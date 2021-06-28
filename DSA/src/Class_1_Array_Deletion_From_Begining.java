import java.util.Scanner;

public class Class_1_Array_Deletion_From_Begining {
	public static void main(String[] args) {
		//Take the size of array from user
		//Use for loop to take input
		Scanner sc=new Scanner(System.in);
		int size;
		System.out.println("Enter the size of array: ");
		size=sc.nextInt();
		int[] array=new int[size];
		
		System.out.println("Enter the elements: ");
		for(int i=0; i<size; i++)
		{
			array[i]=sc.nextInt();
		}
		
		//Print Array before deleting
		System.out.println("Before deleting: ");
		System.out.println("Size: "+size);
		for(int i=0; i<size; i++)
		{
			System.out.print(array[i]+" ");
		}
		
		
		//Deleting from beginning
		for(int i=0; i<size-1; i++)
		{
			array[i]=array[i+1];
		}
		if(size>0)
		{
			size--;
		}
		
		//Print Array before deleting
		System.out.println("\nAfter deleting: ");
		System.out.println("Size: "+size);
		for(int i=0; i<size; i++)
		{
			System.out.print(array[i]+" ");
		}
	}
}
