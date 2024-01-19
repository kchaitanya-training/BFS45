package AssessmentDay4;

public class DefaultValues {
    int num;
    String word;
    float deci;
    char ch;
    Boolean yesno;

    public static void main(String[] args) {
        DefaultValues dv = new DefaultValues();

        System.out.println("Default object reference = " + dv);
        System.out.println("Default int value = " + dv.num);
        System.out.println("Default String value = " + dv.word);
        System.out.println("Default float value = " + dv.deci);
        System.out.println("Default ch value = " + dv.ch);
        System.out.println("Default yesno value = " + dv.yesno);
    }
}
