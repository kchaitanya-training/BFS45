import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class BufferedOutputStreamEx {
    void method() {
        File file = new File("C:\\Users\\wangc\\eclipse-workspace1\\Session 7\\src\\text.txt");
        BufferedOutputStream bo = null;

        try {
            bo = new BufferedOutputStream(new FileOutputStream(file));

            String s = "hello 123";
            byte[] b = s.getBytes();
            

            bo.write(b);

        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            try {
                if (bo != null) {
                    bo.close();
                    System.out.println("Closed the BufferedOutputStream in the finally block.");
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {
        BufferedOutputStreamEx ex = new BufferedOutputStreamEx();
        ex.method();
    }
}
