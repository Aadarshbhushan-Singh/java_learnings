import java.util.Scanner;

public class Class_29_match_specific_pattern {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String dict=sc.nextLine();
		String[] a=dict.split(" ");
		String str=sc.next();
		int n=a.length;
		boolean found=false;
		for(int i=0; i<n; i++) {
			if(pat(a[i])==pat(str)) {
				System.out.print(a[i]+" ");
				found=true;
			}
		}
		if(found==false) {
			System.out.println("Null");
		}
		
	}
	
	static int pat(String s) {
		String p="";
		char[] ch=s.toCharArray();
		for(int i=0; i<s.length(); i++) {
			int c=1;
			for(int j=i+1; j<s.length(); j++) {
				if(ch[i]==ch[j] && ch[i]!='*') {
					c++;
					ch[j]='*';
				}
			}
			if(ch[i]!='*') {
				p=p+c;
			}
			
		}
		return Integer.parseInt(p);
	}
}
