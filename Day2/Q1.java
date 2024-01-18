/* write program to define two methods with parameters , one method should call to another 
method and execute or call that method with object reference.*/

public class Q1 {
	
	public void makeCoffee(int cups) {
		System.out.println("Cups of coffee: "+ cups);
		condiments("milk", "coffee", "sugar");
		
	}
	
	public void condiments(String c1, String c2, String c3 ) {
		System.out.println("Please add " + c1 + ", "+ c2 + " and "+c3 + " to make a cup of coffee.");
	}

	public static void main(String[] args) {
		Q1 q = new Q1();
		q.makeCoffee(2);
	}
}
