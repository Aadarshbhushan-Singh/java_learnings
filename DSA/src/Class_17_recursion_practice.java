
public class Class_17_recursion_practice {
	static int val=0;
	public static void main(String[] args) {
		printValue();
	}
	
	static void printValue() {
		System.out.println("Value: "+val);
		val++;
		if(val<100)
		printValue();
	}
}
