package AssessmentDay8.files;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class FileExample {
    void fileDemo() throws IOException {
        String file = GetFile.filePath();

        InputStream fileInputStream = new FileInputStream(file);

        int data = 0;
        while ((data = fileInputStream.read()) != -1) {
            System.out.print((char) data);
        }

        fileInputStream.close();

    }

    public static void main(String[] args) {
        try {
            FileExample m = new FileExample();
            m.fileDemo();
        } catch (IOException e) {
            System.out.println("Caught error: " + e);
        }
    }

}
