
public class Class_04_Power_Logarithmic {
	public static void main(String[] args) {
		int n1=power(3, 45);
		int n2=power(3,44);
		System.out.println(n1+" "+n2);
	}
	
	static int power(int x, int n) {
		if(n==0) {
			return 1;
		}
		int p=power(x, n/2);
		int result=p*p;
		
		if(x%2==0) {
			return result;
		}else {
			return result*x;
		}
	}
}
