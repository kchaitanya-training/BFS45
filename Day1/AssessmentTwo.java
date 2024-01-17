//create the different class with two method and try to
// communicate one method to other and run it.

public class AssessmentTwo {

    //function
    void first() {
        System.out.println(second());
    }

    //function with return type int

    int second() {
        int a = 2;
        int b = 3;
        int c = a+b;

        return c;

    }

    public static void main(String[] args){
        AssessmentTwo object = new AssessmentTwo();

        object.first();
    }
}
