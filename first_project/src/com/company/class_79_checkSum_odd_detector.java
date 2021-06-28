package com.company;
import java.util.Scanner;

public class class_79_checkSum_odd_detector {
	static String complement(String s) {
		String str="";
		for(int i=0; i<s.length(); i++) {
			char a=s.charAt(i);
			if(a=='1') {
				str=str+"0";
			}else {
				str=str+"1";
			}
		}
		return str;
	}
	
	static boolean checkOne(String s) {
		int temp=0;
		for(int i=0; i<s.length(); i++) {
			char a=s.charAt(i);
			if(a=='1') {
				temp=0;
			}else {
				temp=1;
				break;
			}
		}
		if(temp==0) {
			return true;
		}else {
			return false;
		}
		
	}
	
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);

		System.out.println("*********** Sender's Side *************");
		System.out.println("Enter the bits from sender side: ");
		String inputBit=sc.next();
		
		//Take input the number of bits
		System.out.println("Enter the number of elements in each bits: ");
		int m=sc.nextInt();

		//Number of parts
		int n=inputBit.length()/m;
		
		//Make array of size n+1 (n is including intCheckSum because 0 index will manage it)
		int[] str=new int[n+1];
		
		//First of all change string to integer then to binary and append to the array.
		//intCheckSum is the integer value of sum of all the numbers
		//preCheckSum is the value of checksum without complementing.
		int temp=0;
		int intCheckSum=0;
		for(int i=0; i<inputBit.length(); i=i+m) {
			String part=inputBit.substring(i, i+m);
			int intPart=Integer.parseInt(part);
			Integer.toBinaryString(intPart);
			int decPart=Integer.parseInt(part,2);
			intCheckSum+=decPart;
			str[temp]=intPart;
			temp++;
		}
		
		System.out.println("Value after segmenting: ");
		for(int i=0; i<n; i++) {
			System.out.println(str[i]);
		}
		
		String preCheckSum=Integer.toBinaryString(intCheckSum);
		System.out.println("Value of sum of binary parts is: "+preCheckSum);
		if(preCheckSum.length()>m) {
			String extraBit=preCheckSum.substring(0,preCheckSum.length()-m);
			System.out.println("Extra bit to be added to LSB is: "+extraBit);
			int intExtraBit=Integer.parseInt(extraBit,2);
			String remainingBit=preCheckSum.substring(preCheckSum.length()-m);
			int intCheckSum2=Integer.parseInt(remainingBit,2);
			int finalPreCheckSum=intCheckSum2+intExtraBit;
			String strFinalPreCheckSum=Integer.toBinaryString(finalPreCheckSum);
			System.out.println("Value of preCheckSum without complement is: "+strFinalPreCheckSum);
			str[n]=Integer.parseInt(complement(strFinalPreCheckSum));
			System.out.println("Value of checksum is: "+complement(strFinalPreCheckSum));
		}else {
			System.out.println("No extra bit obtained in the sum.");
			System.out.println("Value of checksum without complement is: "+preCheckSum);
			str[n]=Integer.parseInt(complement(preCheckSum));
			System.out.println("Value of checksum is: "+complement(preCheckSum));
		}
		
		//Add the value of complemented preCheckSum to the string
		System.out.println("*********** Reveiver's Side *************");
		System.out.println("Segments received from sender side is: ");
		for(int i=0; i<n+1; i++) {
			System.out.println(str[i]);
		}
		
		//Create another array of strings segment for receiver.
		String[] strRec=new String[n+1];
		for(int i=0; i<n+1; i++) {
			strRec[i]=String.valueOf(str[i]);
		}
		
		int sum=0;
		//Convert all the string of strRec to integer and again to string
		for(int i=0; i<n+1; i++) {
			sum=sum+Integer.parseInt(strRec[i],2);
		}
		
		String receivedCheckSum=Integer.toBinaryString(sum);
		if(receivedCheckSum.length()>m) {
			String extraBit2=receivedCheckSum.substring(0, receivedCheckSum.length()-m);
			String remainingBit2=receivedCheckSum.substring(receivedCheckSum.length()-m);
			System.out.println("Extra bit is: "+extraBit2);
			System.out.println("Remaining bit is: "+remainingBit2);
			int intExtraBit2=Integer.parseInt(extraBit2,2);
			int intCheckSum3=Integer.parseInt(remainingBit2,2);
			int finalCheckSum2=intExtraBit2+intCheckSum3;
			String strFinalCheckSum2=Integer.toBinaryString(finalCheckSum2);
			System.out.println("Received message is: "+strFinalCheckSum2);
			if(checkOne(strFinalCheckSum2)) {
				System.out.println("Received message is correct.");
			}else {
				System.out.println("Received message is not correct.");
			}
		}else {
			if(checkOne(receivedCheckSum)) {
				System.out.println("Received message is correct.");
			}else {
				System.out.println("Received message is not correct.");
			}
		}
		
		
		
		
	}
}
