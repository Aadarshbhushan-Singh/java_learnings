
public class Class_8_ReverseArray {
	public static void reverse(int[] array)
	{
		for(int i=0,  j=array.length-1; j>i; i++,j-- )
		{
			int temp=array[i];
			array[i]=array[j];
			array[j]=temp;
		}
		printArray(array);
	}
	
	public static void printArray(int[] array)
	{
		System.out.println("Reverse array is: ");
		for(int i=0; i<array.length; i++)
		{
			System.out.println(array[i]+" ");
		}
	}
	public static void main(String[] args) {
		int[] array= {10,20,30,40,50,60,70};
		int[] array2= {21,31,41,51,61,71};
		
		reverse(array);
		reverse(array2);
		
	}
}
