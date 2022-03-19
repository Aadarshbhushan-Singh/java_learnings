
public class Class_03_power_linear {
	public static void main(String[] args) {
		int n=power(3,5);
		System.out.println(n);
	}
	
	static int power(int x, int n) {
		if(n==0) {
			return 1;
		}
		int product=power(x, n-1);
		int finalP=x*product;
		return finalP;
	}
}
