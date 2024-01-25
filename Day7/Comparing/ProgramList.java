package Comparing;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ProgramList {
	
	public static void main(String[] args) {
		ArrayList <String> names = new ArrayList();
		names.add("John");
		names.add("Peter");
		names.add("Daniel");
		
		List <Integer> num= new ArrayList(); //loose coupled
		num.add(4);
		num.add(5);
		num.add(8);
		
		Set <Boolean> result = new HashSet(); //loose coupled
		result.add(true);
		
		System.out.println(names);
		System.out.println(num);
		System.out.println(result);
		
		
		
	}

}
