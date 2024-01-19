package AssessmentDay4;

public class Keywords {
    String msg = "This is a parent message";

    public static void main(String[] args) {
        Sample s = new Sample();
        s.printMsg();
    }
}

class Sample extends Keywords {
    String msg = "This is a child message";

    void printMsg() {
        System.out.println(this.msg); // REFERENCE TO ITS OBJECT VARIABLE
        System.out.println(super.msg); // REFERENCE TO ITS PARENT CLASS VARIABLE
    }
}