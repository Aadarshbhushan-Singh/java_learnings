import java.util.Scanner;
public class Class_4_Array_Update_Last_and_Beginning {
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int[] array=new int[50];
		System.out.println("Enter the size of array: ");
		int size=sc.nextInt();
		
		//Take input: the elements of array
		System.out.println("Enter the elements: ");
		for(int i=0; i<size; i++)
		{
			array[i]=sc.nextInt();
		}
		
		//Printing after insertion
		System.out.println("Array before insertion of element: ");
		for(int i=0; i<size; i++)
		{
			System.out.println(array[i]+" ");
		}
		//Insert in beginning
		System.out.println("Enter the element to be inserted at beginning: ");
		int ele=sc.nextInt();
		
		//Insert the array at beginning
		for(int i=size-1; i>=0; i--)
		{
			array[i+1]=array[i];
		}
		array[0]=ele;
		
		//Printing after insertion
		System.out.println("Array after insertion of element: ");
		for(int i=0; i<size+1; i++)
		{
			System.out.println(array[i]+" ");
		}
		
		//Insert in last
		System.out.println("Enter the element to be inserted at beginning: ");
		int ele1=sc.nextInt();
		
		//Insert the element at end
		array[size+1]=ele1;
		
		//array[size]=ele should be done. But because we have already increased one element, so ele+1 is done.
		
		//Printing after insertion
		System.out.println("Array after insertion of element: ");
		for(int i=0; i<size+1; i++)
		{
			System.out.println(array[i]+" ");
		}
	}
}
