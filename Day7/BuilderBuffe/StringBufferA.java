package Day7.BuilderBuffe;

public class StringBufferA {
    String str = "Hello";

    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer();
        StringBufferA sa = new StringBufferA();

        sb.append( sa.str + " How are you");
        System.out.println(sb);
        sb.append(" Message");
        System.out.println(sb);


    }
}
