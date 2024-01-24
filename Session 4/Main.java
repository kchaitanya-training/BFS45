
public class Main {
	public static void main(String[] args) {
		SampleInfo S = new SampleInfo("Menda", "ex@takeo","80623");
		System.out.println(S.name);
		System.out.println(S.email);
		S.identity();
		S.print();
		
	}

}
