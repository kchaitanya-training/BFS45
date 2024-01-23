package coupling;

public class Main {
	
	void method() {
		System.out.println("It is A");
		
		System.out.println("Car1 info:");
		Car car1=new Bmw("BMW", "5 series", 2023);
		car1.carDetails();
		
		System.out.println("Car2 info:");
		Car car2=new Toyota("Toyota", "Tacoma", 2022);
		car2.carDetails();
		
	}

	
	public static void main(String[] args) {
		Main a=new Main();
		a.method();
	}

}
