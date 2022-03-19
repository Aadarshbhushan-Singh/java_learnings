import java.util.*;

public class Class_30_sorting_string {
	public static void main(String[] args) {
		//Sorting using Collections.sort(ArrayName);
		Scanner sc=new Scanner(System.in);
		String str=sc.next();
		
		ArrayList<Character> arr=new ArrayList<Character>();
		for(int i=0; i<str.length(); i++) {
			arr.add(str.charAt(i));
		}
		
		System.out.println(arr);
		
		Collections.sort(arr);
		System.out.println(arr);
		
		//Sorting using Arrays.sort
		String str2="helloworld";
		char[] ch2=str2.toCharArray();
		Arrays.sort(ch2);
		for(char ele: ch2) {
			System.out.print(ele+" ");
		}
		
	}
}
