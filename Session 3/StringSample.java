
public class StringSample {
	public static void main(String[] args) {
		
		String string = new String("These are the String Examples");
		
		String word = "HeLLo WoRlD";
		
		String s1 = "Coca ";

		
		System.out.println(word.toLowerCase());
		
		System.out.println(word.toUpperCase());
		
		s1 = s1.concat("Cola");
		
		System.out.println(s1);
		
		System.out.println(word +" "+s1 + " Cola");
		
		System.out.println("Substring you picked: "+ string.substring(14));
		
		System.out.println(word.charAt(7));
		
		System.out.println(word.contains("String"));
		
		System.out.println(word.indexOf("W"));
	}
}
