package Day6;

public class Wrapper {
    public static void main(String[] args) {

        // integer to string
        int i = 23;
        String res1 = Integer.toString(23);
        System.out.println(res1);

        //string to integer
        String s = "234";
        Integer res2 = Integer.valueOf(s);
        System.out.println(res2);

        //float to string/int
        Float f = 3.14f;
        String res3 = Float.toString(f);
        Integer res4 = Float.valueOf(f).intValue();
        System.out.println(res3);
        System.out.println(res4);

        //double to string/float
        Double d = 45.56;
        String res5 = Double.valueOf(d).toString();
        Integer res6= Double.valueOf(d).intValue();
        System.out.println(res5);
        System.out.println(res6);

        //boolean to string
        Boolean bl = false;
        String res7 = Boolean.valueOf(bl).toString();
        System.out.println(res7);




    }
}
