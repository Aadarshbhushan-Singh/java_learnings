package MainPackage;

public class Main {
	public static void main(String[] args) {
		String plainText = "76yuhjbn";
		String binaryCode = Operations.toBinaryCode(plainText);
		
		System.out.println(binaryCode);
		System.out.println(binaryCode.length());
		System.out.println(Operations.bitwiseOROperation("1111", "1111"));
		
		System.out.println(Operations.addBinary("1010", "1110"));

	}
	
}	


