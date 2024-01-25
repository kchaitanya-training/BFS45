// List, Set, & map implementation with Generic Type
import java.util.*;
import java.util.Map.Entry;
public class Learn1 {

	public static void main(String[] args) {
		
		// Array List with Integer generic 
		ArrayList<Integer> num = new ArrayList<Integer>();
		num.add(101);
		num.add(102);
		num.add(103);
		
		System.out.println("Array List of ID: " + num);
		num.remove(1);		// remove id with index 1
		System.out.println("After removing index 1 of ID: " + num);
		
		//Linked List with String generic type
		LinkedList<String> shape = new LinkedList<String>();
		shape.add("Circle");
		shape.add("Triangle");
		shape.add("Rectangle");
		System.out.println("Shapes in Linked List:" + shape);
		
		shape.remove("Rectangle");		// Removing shape name Rectangle from the list
		System.out.println("After removing \"Rectangle\" from the shapes list: "+ shape);
		
		//Hash Set
		Set<Integer> hashset = new HashSet<>();
		hashset.add(12);
		hashset.add(56);
		
		System.out.println("Hash Set:");
		// Using for-loop to print out the Hash Set with Object reference
		for(Object i:hashset) {
			System.out.println(i);
		}
		
		//Working with Map too with generic type
		Map<Integer, String> id = new HashMap<Integer, String>();
		id.put(101, "Tom");
		id.put(102, "Kevin");
		id.put(103, "Matt");
		id.put(104, "Ryan");
		
		System.out.println("Map:\nWho's id 103: " + id.get(103));
		
		Set<Integer> key = id.keySet();
		System.out.println(key);
		
		System.out.println("Show the name on the list: " + id.values());
		
		Set<Entry<Integer, String>> set = id.entrySet();
		System.out.println("Show the name and its associated id: " + set);
		}
}
