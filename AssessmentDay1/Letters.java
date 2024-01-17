/*
    ASSESSMENT 2
 */

public class Letters {

    String wordOne = "Hello";


    String concat() {
        return wordOne + "," + getWordTwo();
    }

    String getWordTwo() {
        return "World";
    }

    public static void main(String[] args) {
        Letters assessment = new Letters();

        String lorem = assessment.concat();

        System.out.println(lorem);
    }
}
