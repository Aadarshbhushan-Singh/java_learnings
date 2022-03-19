import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;
public class Class_26_TreeMap {
	public static void main(String[] args) {
		Map <String, Double> map1=new TreeMap<>();
		map1.put("Aadarsh",  9.0);
		map1.put("Sashwat", 8.16);
		map1.put("Pranjal", 8.64);
		map1.put("Deepak", 8.96);
		
		//we can if statement to check if the key is already present in the map
		if(!map1.containsKey("Aadarsh")){
			map1.put("Aadarsh", 8.6);
		}
		
		//we can also use putIfAbsent() to achieve the same
		map1.putIfAbsent("Deepaka", 100.0);
		
		System.out.println(map1);
		
		for(Map.Entry<String, Double> e: map1.entrySet()) {
			System.out.println(e.getKey());
			System.out.println(e.getValue());
		}
		
		map1.remove("Deepak");
		System.out.println(map1);
	}
}
