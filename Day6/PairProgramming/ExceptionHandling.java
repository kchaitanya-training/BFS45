package PairProgramming;

public class ExceptionHandling {

    public static void main(String[] args) {
        String s = null;

        try{
            s.charAt(1);
        }catch(NullPointerException e) {
            System.out.println("Null Exception");
        }
    }
    
}
