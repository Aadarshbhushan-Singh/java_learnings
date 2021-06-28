package com.company;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class class_117_FAT_Sample_Question {
	
		public static int total1=0, total2=0, total3=0, total4=0;
		public static int Result1=0, Result2=0;
		public static boolean isPrime(int x) {
		    if (x==1) {
		        return true;
		    } else {
		        for(int i=2;i<=Math.sqrt(x);i++) {
		            if (x%i==0) return false;   
		        }
		    }
		    return true;
		}
		public static void main(String[] args) throws FileNotFoundException, InterruptedException {
			sums sum1 = new sums();
			sums sum2 = new sums();
			sums sum3 = new sums();
			
			
			Thread tr1 = new Thread(new Runnable() {
				
				@Override
				public void run() {
					File obj1 = new File("file1.txt");
					try {
						Scanner sc = new Scanner(obj1);
						while (sc.hasNext()) {
							int temp1 = sc.nextInt();
							if (Integer.toString(temp1).contains("7") || Integer.toString(temp1).contains("9")) {
								total1 = total1 + temp1;
							}
						}
						sc.close();
						sum1.sum(total1);
					} catch (FileNotFoundException e) {
						e.printStackTrace();
					}
				}
			});
			Thread tr2 = new Thread(new Runnable() {
				
				@Override
				public void run() {
					File obj2 = new File("file2.txt");
					try {
						Scanner sc = new Scanner(obj2);
						while (sc.hasNext()) {
							int temp2 = sc.nextInt();
							if (temp2 % 9 == 0 || temp2 % 11 == 0) {
								total2 = total2 + (temp2 * temp2);
							}
						}
						sc.close();
						sum2.sum(total2);
					} catch (FileNotFoundException e) {
						e.printStackTrace();
					}
				}
			});
			Thread tr3 = new Thread(new Runnable() {
				
				@Override
				public void run() {
					File obj3 = new File("file3.txt");
					try {
						Scanner sc = new Scanner(obj3);
						while (sc.hasNext()) {
							int temp3 = sc.nextInt();
							if (Integer.toString(temp3).length() == 4 && (Integer.toString(temp3)).charAt(3) == '8') {
								total3 = total3 + temp3;
							}
						}
						sc.close();
						sum3.sum(total3);
					} catch (FileNotFoundException e) {
						e.printStackTrace();
					}
				}
			});
			Thread tr4 = new Thread(new Runnable() {
				
				@Override
				public void run() {
					File obj4=new File("file4.txt");
					try {
						Scanner sc=new Scanner(obj4);
						while(sc.hasNext())
						{
							int temp4=sc.nextInt();
							if(isPrime(temp4))
							{
								total4=total4+temp4;
							}
						}
						
					}catch(Exception e)
					{
						e.printStackTrace();
					}
				}
			});
			
			Thread tr5=new Thread(new Runnable() {
				@Override
				public void run()
				{
					try {
						Result1=total1/total2;
						Result2=total3/total4;
					}catch(Exception e4){
						e4.getMessage();
					}
				}
			});
			tr1.start();
			tr2.start();
			tr3.start();
			tr1.join();
			tr2.join();
			tr3.join();
			tr4.start();
			tr4.join();
			tr5.start();
			tr5.join();
			
			
			
		}

	}

	

	class sums {
		int t;

		public sums() {
			this.t = 0;
		}

		public void sum(int total) throws FileNotFoundException {
			this.t = total;
		}

		public int d() {
			return (t);
	}
}
