package AssessmentDay6.exception;

public class CustomException extends Exception {
    CustomException(String message) {
        super(message);
        System.out.println("This is Custom Exception.");
    }
}
