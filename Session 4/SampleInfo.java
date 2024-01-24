
public class SampleInfo extends Sample {
	String Id;
	
	SampleInfo( String name, String email, String Id){
		super(name, email);
		this.Id = Id;
	}
	void identity() {
		System.out.println("Id: "+ Id);
	}
	void print() {
		super.print();
	System.out.println("Id: "+ Id);
	}

}
