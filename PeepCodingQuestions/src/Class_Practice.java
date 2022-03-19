
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class Class_Practice {	
	
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		double x = scn.nextDouble();
		
		System.out.println(x);
		System.out.println("Hello");
		
		
		
	}
	static boolean isValidPassword(String password)
    {
  
        String regex = "^(?=.*[0-9])"
                       + "(?=.*[@#$%^&+=])"
                       + "(?=\\S+$).{5,10}$";
  
        Pattern p = Pattern.compile(regex);
  
        if (password == null) {
            return false;
        }
        Matcher m = p.matcher(password);
        return m.matches();
    }
}

