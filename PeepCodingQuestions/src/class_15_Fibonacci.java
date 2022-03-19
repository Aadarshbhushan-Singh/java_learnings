import java.util.*;
public class class_15_Fibonacci {
	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		System.out.println("Number: ");
		int n=scn.nextInt();
		int fibn=Fibonacci(n, new int[n+1]);
		System.out.println(fibn);
		
	}
	
	static int Fibonacci(int n, int[] qb) {
		if(n==0 || n==1) {
			return n;
		}
		if(qb[n]!=0) {
			return qb[n];
		}
		int a=Fibonacci(n-1, qb);
		int b=Fibonacci(n-2, qb);
		int c=a+b;
		qb[n]=c;
		
		return c;
	}
}
