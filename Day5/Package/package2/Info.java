package com.sonam.package2;
import com.sonam.package1.Name;
import com.sonam.package1.School;
import com.sonam.protectedAndPrivate.*;

public class Info extends Demo1{
	
	void printInfo() {
		Name n = new Name();
		n.printName("Sonam");
		School s = new School();
		s.printSchool("Queens College");
		Address a = new Address();
		a.printAddress("New york");
		test(); // protected methods can be accessed w/o creating instance of the class.
	}
	
	public static void main(String[] args) {
		
		Info info = new Info();
		info.printInfo();
		
	}

}
