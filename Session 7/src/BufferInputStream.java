import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class BufferInputStream {

    void method() throws IOException {
        File file = new File("C:\\Users\\wangc\\eclipse-workspace1\\Session 7\\src\\text");
        try (BufferedInputStream is = new BufferedInputStream(new FileInputStream(file))) {
            int a;
            while ((a = is.read()) != -1) {
                System.out.println((char) a);
            }
        }
    }

    public static void main(String[] args) throws IOException {
        BufferInputStream bufferInputStream = new BufferInputStream();
        bufferInputStream.method();
    }
}
