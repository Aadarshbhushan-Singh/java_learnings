import java.util.Arrays;

public class Class_33_Seive_Of_Eratosthenes {
	public static void main(String[] args) {
		boolean[] isPrime=sieve_of_Eratosthenes(100);
		for(int i=0; i<isPrime.length; i++) {
			if(isPrime[i]==true) {
				System.out.println(i+" ");
			}
		}
	}
	
	static boolean[] sieve_of_Eratosthenes(int n) {
		boolean[] isPrime=new boolean[n+1];
		Arrays.fill(isPrime, true);
		isPrime[0]=false;
		isPrime[1]=false;
		
		for(int i=2; i*i<n; i++) {
			for(int j=2*i; j<n; j+=i) {
				isPrime[j]=false;
			}
		}
		
		
		
		return isPrime;
	}
}
