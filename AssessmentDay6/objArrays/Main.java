package AssessmentDay6.objArrays;

public class Main {
    public static void main(String[] args) {
        Object[] objArr = new Object[5];
        objArr[0] = new Test1();
        objArr[1] = new Test2();
        objArr[2] = "Word";
        objArr[3] = true;
        objArr[4] = 50;

        for (Object obj : objArr) {
            if (obj instanceof Test1) {
                Test1 o = (Test1) obj;
                o.method();
            } else if (obj instanceof Test2) {
                Test2 o = (Test2) obj;
                o.method();
            }

            System.out.println(obj);
        }
    }
}
