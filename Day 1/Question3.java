public class Question3 {

    Question3() {
        System.out.println("This is a constructor");
    }

    void second() {
        System.out.println("Hello World");
    }

    public static void main(String[] args){
        Question3 q3instance = new Question3();
        q3instance.second();
    }

}
