public class SampleConst {

    SampleConst()
    {
        System.out.println("hello constructor");
    }

    void sayMethod()
    {
        System.out.println("method defined");
    }

    public static void main(String[] args) {

        SampleConst n = new SampleConst();

        n.sayMethod();
    }
}
