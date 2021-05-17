
public class Class_9_Find_max_min {
	public static void findMax(int[] array)
	{
		int max=array[0];
		for(int i=0; i<array.length; i++)
		{
			if(array[i]>max)
					max=array[i];
		}
		System.out.println("Max: "+max);
	}
	
	public static void findMin(int[] array)
	{
		int min=array[0];
		for(int i=0; i<array.length; i++)
		{
			if(array[i]<min)
				min=array[i];
		}
		System.out.println("Min: "+min);
	}
	
	public static void main(String[] args) {
		int [] array= {10,23,9,52,63,14,55,52,63,-1,100};
		findMax(array);
		findMin(array);
	}
}
