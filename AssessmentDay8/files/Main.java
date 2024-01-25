package AssessmentDay8.files;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class Main {
    void method() throws IOException {
        String file = new File("AssessmentDay8/files/test.txt").getAbsolutePath();

        InputStream fileInputStream = new FileInputStream(file);

        int data = 0;
        while ((data = fileInputStream.read()) != -1) {
            System.out.print((char) data);
        }

        fileInputStream.close();

    }

    public static void main(String[] args) throws IOException {
        Main m = new Main();
        m.method();
    }

}
