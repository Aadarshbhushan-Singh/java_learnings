
public class Class_01_Print_Decreasing_Increasing {
	public static void main(String[] args) {
		//Print decreasing 5 4 3 2 1
//		printDecreasing(5);
//		printIncreasing(5);
//		
//		printDecreasingIncreasing(10);
		printIncreasingDecreasing(10);
	}
	
	
	//Print Decreasing
	static void printDecreasing(int n) {
		if(n==0) {
			return;
		}
		System.out.println(n);
		printDecreasing(n-1);
	}
	
	static void printIncreasing(int n) {
		if(n==0) {
			return;
		}
		printIncreasing(n-1);
		System.out.println(n);
	}
	
	static void printDecreasingIncreasing(int n) {
		if(n==0) {
			return;
		}
		System.out.println(n);
		printDecreasingIncreasing(n-1);
		System.out.println(n);
		
	}
	
	static void printIncreasingDecreasing(int n) {
		if(n==0) {
			return;
		}
		
		
	}
}
