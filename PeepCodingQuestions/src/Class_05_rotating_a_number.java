import java.util.*;

public class Class_05_rotating_a_number {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int k=sc.nextInt();
		
		int noD=0;
		int num=n;
		while(num>0) {
			num=num/10;
			noD++;
		}
		
		k=k%noD;
		if(k<0) {
			k=noD+k;
		}
		
		int num1=1;
		int num2=1;
		for(int i=0; i<noD; i++) {
			if(i<k) {
				num1=num1*10;
			}else {
				num2=num2*10;
			}
		};
		int rem=n%num1;
		n=n/num1;
		int rotN=(rem*num2)+n;
		System.out.println(rotN);
		
		
	}
}
