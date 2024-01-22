package AssessmentDay5.package1;

import AssessmentDay5.package2.*;

public class Sample1 {
    void method() {
        System.out.println("This is Sample1");

        Sample2 s = new Sample2();
        s.method();

        Example e = new Example();
        e.method();

        Example2 e2 = new Example2();
        e2.method();
    }

    public static void main(String[] args) {
        Sample1 s = new Sample1();
        s.method();
    }
}
