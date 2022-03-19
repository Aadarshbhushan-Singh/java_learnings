package MainPackage;

public class Operations {
	
	//This function converts integer to binary and returns string as answer.
	static String toBinary(int a) {
		String ans = "";
		while(a > 0) {
			if(a % 2 == 0) {
				ans = ans + "0";
			}else {
				ans = ans + "1";
			}
			a = a / 2;
		}

		String finalAns = "";

		int diff = 8 - ans.length();
		if(diff > 0) {
			for(int i = 0; i < diff; i++) {
				finalAns += "0";
			}
		}
		for(int i = ans.length() - 1; i >= 0; i--) {
			finalAns = finalAns + ans.charAt(i);
		}
		
		return finalAns;
	}
	
	//This function converts plain text into 64 bit binary code
	static String toBinaryCode(String plainText) {
		String binaryPlainText = "";
		for(int i = 0; i < plainText.length(); i++) {
			char c = plainText.charAt(i);
			int a = c;
			String binaryOfA = (toBinary(a));
			binaryPlainText += binaryOfA;
		}
		
		return binaryPlainText;
	}
	
	//This function is bitwise or operation. Odd ones detector
	static String bitwiseOROperation(String text1, String text2) {
		String result = "";
		for(int i = 0; i < text1.length(); i++) {
			char a = text1.charAt(i);
			char b = text2.charAt(i);
			
			char c = '0';
			
			if(a == '0' && b == '0') {
				c = '0';
			}else if(a == '0' && b == '1') {
				c = '1';
			}else if(a == '1' && b == '0') {
				c = '1';
			}else if(a == '1' && a == '1') {
				c = '0';
			}
			
			result += c;
		}
		return result;
	}
	
	
	//This function is used to add binary numbers
	static String addBinary(String a, String b)
    {
        StringBuilder result = new StringBuilder("");
        int s = 0;        
        int i = a.length() - 1, j = b.length() - 1;
        
        while (i >= 0 || j >= 0 || s == 1)
        {
            s += ((i >= 0)? a.charAt(i) - '0': 0);
            s += ((j >= 0)? b.charAt(j) - '0': 0);
            result.append((char)(s % 2 + '0'));
            s /= 2;
            i--; j--;
        }
        
        int start = result.length()-1;
        
        while(start >=0 && result.charAt(start) == '0') {
            start--;
        }
        
        if(start != result.length()-1) {
            result.delete(start+1,result.length());
        }
        
        String finalResult = result.reverse().toString();
        
        //Removing extra carry numbers
        
        int len = a.length();
        
        if(finalResult.length() > len) {
        	finalResult = finalResult.substring(1, finalResult.length());
        }
        
        return finalResult;
    }
	
	
	
	
}
