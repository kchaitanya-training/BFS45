package AssessmentDay6.exception;

public class Main {
    public void simulateException() {
        int a = 1;

        try {
            a = a / 0;
        } catch (Exception ex) {
            System.out.println(ex);
        }

        String word = null;
        try {
            System.out.println(word.length());
        } catch (NullPointerException e) {
            System.out.println(e);
        }

        try {
            throw new CustomException("Custom exception");
        } catch (CustomException e) {
            System.out.println(e);
        }
    }

    public static void main(String[] args) {
        Main m = new Main();
        m.simulateException();
    }
}
