
public class Exception {


	public static void main(String[] args) {
		try {
			System.out.println("TESTING");
			String s = null;
			System.out.println(s.toUpperCase());
		}
		catch(NullPointerException e)
		{
			System.out.println("Exception caught");
		}
		
	}

}
