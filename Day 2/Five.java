public class Five {

    int test(int a, int b){
        return a+b;
    }

    public static void main(String[] args){
        Five f = new Five();
        System.out.println(f.test(5,3));
    }
}
