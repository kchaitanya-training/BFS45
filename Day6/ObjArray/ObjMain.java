package Day6.ObjArray;

public class ObjMain {
    public static void main(String[] args) {
        Object [] ob = new Object[5];

        ob[0] = new Sample1();
        ob[1] = new Sample2();
        ob[2] = 45;
        ob[3] = "Hello";
        ob[4] = true;

        for(Object result: ob) {
            if (result instanceof Sample1) {
                Sample1 s1 = (Sample1) result;
                s1.newMethod();} else{
                System.out.println(result);
            }

        }

}}
