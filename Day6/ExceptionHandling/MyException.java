package Day6.ExceptionHandling;

public class MyException extends Exception {
    //arg constructor
    MyException(String dummyMsg)
    {
        super(dummyMsg);
        System.out.println("This is a dummy exception.");
    }
}
