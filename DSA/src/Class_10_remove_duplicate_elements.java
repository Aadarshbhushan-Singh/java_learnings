
//We will be given a shorted array...We have to find the duplicate element and remove it from the array.

public class Class_10_remove_duplicate_elements {
	public static void main(String[] args) {
		int a[]= {1, 2, 2, 3, 4, 5, 5, 5, 6, 7, 9, 10};
		int size=a.length;
		
		int[] newArray=new int[size];
		int ind=0;
		for(int i=0; i<size-1; i++)
		{
			if(a[i]!=a[i+1])
			{
				newArray[ind]=a[i];
				ind++;
			}
		}
		
		for(int i=0; i<newArray.length; i++)
		{
			if(newArray[i]!=0)
				System.out.print(newArray[i]+" ");
			else
				break;
		}
		
	}
}
