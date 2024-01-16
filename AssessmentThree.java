//create class with constructor , methods and run it.

public class AssessmentThree {

    //constructor
    AssessmentThree() {
        System.out.println("This is a constructor");
    }

    //function
    void second() {
        System.out.println("Hello World");
    }

    public static void main(String[] args){
        AssessmentThree object = new AssessmentThree();
        object.second();
    }
}
