package AssessmentDay8.files;

import java.io.FileInputStream;
import java.io.BufferedInputStream;
import java.io.IOException;

public class BufferedInput {
    void fileDemo() throws IOException {
        String file = GetFile.filePath();

        BufferedInputStream fileInputStream = new BufferedInputStream(new FileInputStream(file));

        int data = 0;
        while ((data = fileInputStream.read()) != -1) {
            System.out.print((char) data);
        }

        fileInputStream.close();
    }

    public static void main(String[] args) {
        try {
            BufferedInput bInput = new BufferedInput();
            bInput.fileDemo();
        } catch (IOException e) {
            System.out.println("Caught error: " + e);
        }
    }
}
