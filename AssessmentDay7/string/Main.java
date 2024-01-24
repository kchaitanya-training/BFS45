package AssessmentDay7.string;

public class Main {
    public static void main(String[] args) {
        StringBuffer sb1 = new StringBuffer();
        StringBuilder sb2 = new StringBuilder();

        sb1.append("Hello");
        sb1.append("World");

        sb2.append("Hello");
        sb2.append("World");

        System.out.println("StringBuffer");
        System.out.println(sb1);
        System.out.println("StringBuilder");
        System.out.println(sb2);
    }
}
