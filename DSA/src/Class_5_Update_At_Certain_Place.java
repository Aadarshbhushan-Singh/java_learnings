import java.util.Scanner;

public class Class_5_Update_At_Certain_Place {
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int[] array=new int[50];
		
		System.out.println("Enter the size of array: ");
		int size=sc.nextInt();
		
		//Take int elements as input
		for(int i=0; i<size; i++)
		{
			array[i]=sc.nextInt();
		}
		
		//Printing array before updating
		System.out.println("Before updating: ");
		for(int i=0; i<size; i++)
		{
			System.out.print(array[i]+" ");
		}
		
		//Take the place and element as input for updation
		System.out.println("\nEnter the element to be added to the array: ");
		int ele=sc.nextInt();
		
		System.out.println("Enter the place for updating: ");
		int place=sc.nextInt();
		
		if(place<0 || place>size)
		{
			System.out.println("Place is not valid!");
		}
		else
		{
			//size-place+1
			System.out.println("Entered here: ");
			for(int i=size; i>=place; i--)
			{
				array[i]=array[i-1];
			}
			array[place-1]=ele;
			
			//Printing after updating
			System.out.println("After updating: ");
			for(int i=0; i<size+1; i++)
			{
				System.out.print(array[i]+" ");
			}
		}
		
		
		
	}
}
