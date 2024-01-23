package AssessmentDay6.wrapper;

public class Main {
    public static void main(String[] args) {
        int a = 10;
        float b = 10.5f;
        boolean c = true;

        String num = String.valueOf(a);
        Integer n = Integer.valueOf(a);
        Float decimal = Float.valueOf(b);
        Boolean bool = Boolean.valueOf(c);
        Double d = Double.valueOf(b);

        System.out.println(num);
        System.out.println(n);
        System.out.println(decimal);
        System.out.println(bool);
        System.out.println(d);
    }
}