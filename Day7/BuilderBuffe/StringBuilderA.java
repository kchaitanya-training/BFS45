package Day7.BuilderBuffe;

public class StringBuilderA {
    public static void main(String[] args) {
        String sbr = "Hello";
        StringBuilder stb = new StringBuilder();

        stb.append(sbr + " How are you");
        System.out.println(stb);
    }
}
