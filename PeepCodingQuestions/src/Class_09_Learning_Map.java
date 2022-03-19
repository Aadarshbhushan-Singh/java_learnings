import java.util.*;
import java.util.Map.Entry;

public class Class_09_Learning_Map {
	public static void main(String[] args) {
//		Map <String, String> map1=new HashMap<>();
//		map1.put("Aadarsh", "Singh");
//		
//		System.out.println(map1);
//		System.out.println(map1.containsValue("Singh"));
//		System.out.println(map1.containsKey("Aadarsh"));
//		
//		String value="Singh";
//		
//		for(Entry<String, String> ent: map1.entrySet()) {
//			if(ent.getValue().equals(value)) {
//				System.out.println(ent.getKey());
//			}
//		}
//		
		
		//Printing the frequency of elements of an array
		
//		Map <Integer, Integer> map2=new HashMap<>();
//		int[] arr= {1,2,2,3,3,3,4,4,5,6,6,6,6,6,7};
//		for(int i=0; i<arr.length; i++) {
//			if(map2.containsKey(arr[i])) {
//				for(Entry<Integer, Integer> ent: map2.entrySet()) {
//					if(ent.getKey()==arr[i]) {
//						int x=ent.getValue();
//						map2.put(arr[i], ++x);
//					}
//				}
//			}else {
//				map2.put(arr[i], 1);
//			}
//		}
//		
//		System.out.println(map2);
		
		//Get the value using key
		//Map1.get();
		
		//Get the key using the value
//		int value=400;
//		for(Entry<Integer, Integer> entry: map1.entrySet()) {
//			if(entry.getValue()==value) {
//				System.out.println(entry.getKey());
//			}
//		}
		
		
		Map <Integer, Integer> map1=new TreeMap<>();
		map1.put(10, 100);
		map1.put(20, 400);
		System.out.println("1");
		System.out.println(map1.get(20));
		System.out.println("2");
		
		//Get key using value
//		int value=400;
//		for(Entry<Integer, Integer> entry: map1.entrySet()) {
//			if(entry.getValue()==value) {
//				System.out.println(entry.getKey());
//			}
//		}
		
		//clear()
//		map1.clear();
//		System.out.println(map1);
		
		//ContainsKey() 
		System.out.println(map1.containsKey(20));
		
		System.out.println(map1.containsValue(400));
		
		System.out.println(map1.entrySet());
		
		//get key using get()
		System.out.println(map1.get(20));
		
		System.out.println(map1.getOrDefault(10, 300));
		System.out.println(map1.getOrDefault(50, 300));
		
		//Returns the hashcode value of this map
		System.out.println(map1.hashCode());
		
		//isEmpty();
		System.out.println(map1.isEmpty());
		
		Set<Integer> set1=map1.keySet();
		System.out.println(set1);
		
		map1.putIfAbsent(40, 100);
		System.out.println(map1);
		
		map1.remove(10);
		System.out.println(map1);
		
		map1.remove(20, 400);
		map1.put(30, 900);
		map1.put(3, 9);
		System.out.println(map1.values());
		Set<Integer> set10=map1.keySet();
		System.out.println(set10);
		Collection<Integer> set11=map1.values();
		System.out.println(set11);
		
		
		
		
	}
}
