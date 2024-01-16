public class MyFirst {
    int a = 15; // Global variables

    void hi() {
        int a = 30;
        System.out.println(a);
    }

    void sample(){
        int b = 10; // local variables only for this method
        int c= b + a;
        System.out.println(c);
    }

    void hello(){
        System.out.println(a);
    }


    public static void main(String[] args){
        MyFirst myFirst = new MyFirst();
        myFirst.hi();
        myFirst.hello();
    }
}
