package Day6.ExceptionHandling;
class NullPointerSample {
    void nullMethod()
    {
        String s = null;
        try{
            System.out.println(s.length());
        }
        catch(NullPointerException e)
        {
            System.out.println(e.getMessage());
            e.printStackTrace();
        }

    }

}
public class MainE {
   void customException()
   {
       try{
           //method throws custom exception with custom msg.
           throw new MyException("Custom Exception");}
       catch (MyException e)
       {
           System.out.println(e.getMessage());  //catch and handle the custome exception
           e.printStackTrace();
       }
   }
    public static void main(String[] args) {
        MainE m = new MainE();
        m.customException();

        NullPointerSample n = new NullPointerSample();
        n.nullMethod();




    }}
