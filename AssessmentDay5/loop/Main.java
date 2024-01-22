package AssessmentDay5.loop;

public class Main {
    void forLoop() {
        System.out.println("For Loop");

        int num = 0;
        for (int i = 0; i < 15; i++) {
            num++;
            System.out.println(num);
        }

        String[] words = new String[5];
        words[0] = "This";
        words[1] = "Is";
        words[2] = "A";
        words[3] = "Placeholder";
        words[4] = "Array";

        for (int i = 0; i < 5; i++) {
            System.out.println(words[i]);
        }
    }

    void whileLoop() {
        System.out.println("While Loop");

        int num = 0;
        while (num < 15) {
            num++;
            System.out.println(num);
        }

        String[] words = new String[5];
        words[0] = "This";
        words[1] = "Is";
        words[2] = "A";
        words[3] = "Placeholder";
        words[4] = "Array";

        int i = 0;
        while (i < 5) {
            System.out.println(words[i]);
            i++;
        }
    }

    public static void main(String[] args) {
        Main m = new Main();
        m.forLoop();
        m.whileLoop();
    }
}
