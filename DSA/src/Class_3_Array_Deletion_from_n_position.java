import java.util.Scanner;
public class Class_3_Array_Deletion_from_n_position {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int size;
		System.out.println("Enter the size: ");
		size=sc.nextInt();
		
		int[] array=new int[size];
		System.out.println("Enter the elements: ");
		for(int i=0; i<size; i++)
		{
			array[i]=sc.nextInt();
		}
		
		//Printing array before deletion:
		for(int i=0; i<size; i++)
		{
			System.out.print(array[i]+" ");
		}
		
		//Take input the position of element to be deleted
		System.out.println("\nEnter the position to be deleted: ");
		int pos=sc.nextInt();
		
		//Check if the position is within the size of array or not
		if(pos<=0 || pos>size)
		{
			System.out.println("Invalid position.");
		}else
		{
			for(int i=pos-1; i<size-1; i++)
			{
				array[i]=array[i+1];
			}
			//Printing the array after deletion
			System.out.println("Array after deleting at pos: "+pos);
			for(int i=0; i<size-1; i++)
			{
				System.out.println(array[i]);
			}
		}
	}
}
