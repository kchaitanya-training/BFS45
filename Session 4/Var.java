
public class Var {

int a = 0;
String s = null;
Var var;
boolean b;

void method() {
	System.out.println(s);
	System.out.println(a);
	System.out.println(var);
	System.out.println(b);
}
public static void main(String[] args) {
	Var var = new Var();
	var.method();
}
}