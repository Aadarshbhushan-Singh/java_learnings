
public class Class_02_Factorial {
	public static void main(String[] args) {
		System.out.println(findFactorial(5));
		
	}
	
	static int findFactorial(int n) {
		if(n==1) {
			return 1;
		}
		int f1=findFactorial(n-1);
		int f2=n*f1;
		return f2;
	}
}
