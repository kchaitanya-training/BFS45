public class Example1 {
	String fName;
	String lName;
	String fullName;
	Example1(String fName, String lName){
		this.fName = fName;
		this.lName = lName;
	}
	public String toString() {
		return ("First Name: " + fName + "\nLast Name: " + lName);
	}
	
	// return user full name with string concatenation of two strings
	String userFullName() {
		fullName = fName + " " + lName;
		return fullName;
	}
	// this method changes the first name case to all upper case
	String changeCaseName() {
		return (fName.toUpperCase());
	}
	// method overloading, this method changes the case of the string passed to all lower case
	String changeCaseName(String name) {
		return (name.toLowerCase());
	}
	//check if a certain string is contained in the full name
	boolean fullNameContain(String checkStr) {
		return fullName.contains(checkStr);
	}
	// method that contains argument and check whether the user full name contains the character 'test'
	void checkIndexOf(char test) {
		int indexOf = fullName.indexOf(test);
		System.out.println("indexOf():");
		if(indexOf > 0) {
			System.out.println("\tThe index of character '" + test + "' in user1 full Name: " + indexOf);	
		}else {
			System.out.println("\tError!!! There is no character '" + test + "' in user1 full Name");}
	}
	public static void main(String[] args) {
		Example1 user1 = new Example1("Nima", "Sherpa");
		System.out.println(user1);  		// calling toString() method
		
		// calling a method that concatenates user1 first name and last name to get the full name
		System.out.println("Concatenation:\n\tFull Name of user1: " + user1.userFullName());
		
		// using upper case functionality by calling the function without passing arguments
		System.out.println("Case functionality:\n\tUpper case of the user1 first Name: " + user1.changeCaseName());
		
		// using lower case functionality by calling the function with passing argument
		String name = "NIMADSHERPA";
		System.out.println("\tLower case of this string \""+ name + "\" is --> " 
				+ user1.changeCaseName(name));
		
		//Substring(): Gives extracted substring after index 6 and also inside the range
		System.out.println("Substring():\n\tSubstring of user1 full Name: " + user1.fullName.substring(6));
		System.out.println("\tSubstring of user1 full Name within the index 3 and 8: " + user1.fullName.substring(3,8));
		
		// Contains: Check if the user full name contains the given string
		System.out.println("Contains:\n\tFull name contains 'Sher': " + user1.fullNameContain("Sher"));
		
		//charAt: being used for index 3 of full Name
		System.out.println("charAt():\n\tCharacter at index 3 in user1 full name: "+ user1.fullName.charAt(3));
		
		//indexOf:  
		// for finding the index user input character and checking whether the character is in the full name
		char a = 'd'; 				
		user1.checkIndexOf(a);		// check whether char 'd' is in the full name by calling checkIndexof() method
		a = 'i';
		user1.checkIndexOf(a);		// check whether char 'i' is in the full name by calling checkIndexof() method
	}
}

/*
Sample Output: 
First Name: Nima
Last Name: Sherpa
Concatenation:
	Full Name of user1: Nima Sherpa
Case functionality:
	Upper case of the user1 first Name: NIMA
	Lower case of this string "NIMADSHERPA" is --> nimadsherpa
Substring():
	Substring of user1 full Name: herpa
	Substring of user1 full Name within the index 3 and 8: a She
Contains:
	Full name contains 'Sher': true
charAt():
	Character at index 3 in user1 full name: a
indexOf():
	Error!!! There is no character 'd' in user1 full Name
indexOf():
	The index of character 'i' in user1 full Name: 1

 */

