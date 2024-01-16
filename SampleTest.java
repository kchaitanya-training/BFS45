public class SampleTest {

    void diffClass()
    {
        System.out.println(secClass());
    }

    int secClass()
    {
        int a = 5;
        int b = 10;

        int c = a+b;

        return c;
    }


    public static void main(String[] args) {
        SampleTest t = new SampleTest();

        t.diffClass();


    }
}

