
public class TestTwo {
	
	TestTwo(String name, int age, float height) {
		int legalAge = age - 21;
		if(legalAge >= 0) {
			System.out.println("Legal to drive and drink");
		}
		else {
			System.out.println("Not legal to drive and drink");
		}
	}
	
	void information() {
		String address = "3500 Sun Bowl Dr";
		int pNo = 17000000;
		System.out.println("Information of Driver");
		System.out.println("Address: "+address);
		System.out.println("Phone number: "+pNo);
	}
	

	
	public static void main(String[] args) {
		TestTwo test = new TestTwo("Menda",20,184.2f);
		test.information();
	}
}

