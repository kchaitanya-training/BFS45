public class Third {
    Third(){
        System.out.println("Inside Constructor");
    }

    void b(){
        System.out.print("Done");
    }

    public static void main(String[] args){
        Third obj = new Third();
        obj.b();
    }
}
