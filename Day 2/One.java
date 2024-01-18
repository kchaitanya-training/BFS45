public class One {

    void add(int a , int b){
        System.out.println(a+b);
    }

    void compute(int a , int b){
        add(a,b);
    }

    public static void main(String[] args){
        One o = new One();
        o.compute(3, 5);
    }
}
