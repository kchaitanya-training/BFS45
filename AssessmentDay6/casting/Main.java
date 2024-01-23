package AssessmentDay6.casting;

public class Main {
    public static void main(String[] args) {
        Parent pa = new Child();
        pa.method1();

        // DOWN CASTING
        Child ch = (Child) pa;
        ch.method2();

        // UP CASTING
        Parent p = (Parent) ch;
        p.method1();

        // CASTING FOR PRIMITIVE TYPES
        int a = 1;

        // UP CASTING
        float b = (float) a;
        System.out.println(b);

        // DOWN CASTING
        int c = (int) b;
        System.out.println(c);
    }
}
