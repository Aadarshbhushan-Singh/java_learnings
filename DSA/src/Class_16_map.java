import java.util.HashMap;
import java.util.Map;

public class Class_16_map {
	public static void main(String[] args) {
		Map map1=new HashMap();
		map1.put("Banana", "Yellow");
		map1.put("Mango", "Green");
		map1.put("One", 1);
		map1.put(2,  "two");
		map1.put("Hi", "Hello");
		
		System.out.println(map1);
		
		System.out.println(map1.get("Mango"));
		
		map1.remove("Banana");
		
		System.out.println(map1);
		
		//contains key
		System.out.println(map1.containsKey("Banana"));
		System.out.println(map1.containsKey("Mango"));
		
		//contains value
		System.out.println(map1.containsValue("Green"));
		System.out.println(map1.containsValue("Value"));
		
		
		//replace the value according to key
		map1.replace("Hi", "Not-Hi");
		
		System.out.println(map1);
		
		System.out.println(map1.values());
		System.out.println(map1.keySet());
		
	}
}