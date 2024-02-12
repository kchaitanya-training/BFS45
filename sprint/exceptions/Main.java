package sprint.exceptions;

public class Main {
    public static void main(String[] args) throws CustomException {
        throw new CustomException("**This is a custom exception**");
    }
}

class CustomException extends Exception {
    public CustomException(String message) {
        super(message);
        // System.out.println(message);
    }
}