package Comparing;
import java.util.ArrayList;
import java.util.Collections;

public class CompareMain {
	

	public static void main(String[] args) {
		
		ArrayList<Detail> ref = new ArrayList<>(); 
		ref.add(new Detail("John", 34534456,  34));
		ref.add(new Detail("Michael", 34538456,  23));
		ref.add(new Detail("Paul", 644375 , 24));
		
		//comparable
		Collections.sort(ref);
		System.out.println(ref);
		
		//comparator
		Collections.sort(ref, new NameComparator());
		System.out.println(ref);
		
		Collections.sort(ref, new NumberComparator());
		System.out.println(ref);
		
		
		
	}

}
