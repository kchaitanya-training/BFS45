import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main {
	
	public static void main(String[] args) {
		
		Info info1 = new Info(22, "Menda");
		Info info2 = new Info(23, "Wangchuk");
		Info info3 = new Info(4, "Dorji");
		Info info4 = new Info(52, "Krishna");
		Info info5 = new Info(88, "Sabita");
	
		List<Info> list = new ArrayList<>();
		list.add(info1);
		list.add(info2);
		list.add(info3);
		list.add(info4);
		list.add(info5);
	
		System.out.println("Original List:");
		for (Info info : list) {
			System.out.println(info);
		}
	
		System.out.println("==============");
		System.out.println("Sorted List by Name:");
		Collections.sort(list, new Comparator<Info>() {
			@Override
			public int compare(Info info1, Info info2) {
				return info1.getName().compareTo(info2.getName());
			}
		});
		
		for (Info info : list) {
			System.out.println(info);
		}
	}
}
