import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;
public class Class_24_TreeSet {

	//HashSet O(1), LinkedHashSet O(n), TreeSet O(logn)
	
	Set<Integer> set1=new TreeSet<>();
	
	set1.add(34); 
	set1.add(21);
	set1.add(90);
	set1.add(12);
	set1.add(34);
	
	System.out.println(set1);
	
	set1.remove(34);
	
	System.out.println(set1);
	
	System.out.println(set1.contains(34));
	System.out.println(set1.contains(12));
	
	set1.clear();
	System.out.println(set1);
}
