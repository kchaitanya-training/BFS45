public class Two {
    int a = 7;
    char b = 'b';
    float c = 2.36f;

    Two(int x, float d){
//        a = x;
        System.out.println(a+c);

    }

    public static void main(String[] args){
        Two t = new Two(9, 9.38f);
    }
}
