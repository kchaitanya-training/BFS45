package AssessmentDay8.files;

import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.BufferedInputStream;

public class FileExample {
    String file;

    FileExample() {
        this.file = GetFile.filePath();
    }

    void fileDemo() throws IOException {
        System.out.println("FILE INPUT STREAM\n----");
        InputStream fileInputStream = new FileInputStream(this.file);

        int data = 0;
        while ((data = fileInputStream.read()) != -1) {
            System.out.print((char) data);
        }

        System.out.println("");

        fileInputStream.close();
    }

    void bufferedFileDemo() throws IOException {
        System.out.println("BUFFERED INPUT STREAM\n----");

        BufferedInputStream fileInputStream = new BufferedInputStream(new FileInputStream(this.file));

        int data = 0;
        while ((data = fileInputStream.read()) != -1) {
            System.out.print((char) data);
        }

        System.out.println("");

        fileInputStream.close();
    }

    void bufferedReaderFileDemo() throws IOException {
        System.out.println("BUFFERED READER\n----");

        BufferedReader reader = new BufferedReader(new FileReader(this.file));

        String line = null;
        while ((line = reader.readLine()) != null) {
            System.out.println(line);
        }

        reader.close();
    }

    public static void main(String[] args) {
        try {
            FileExample m = new FileExample();
            m.fileDemo();
            m.bufferedFileDemo();
            m.bufferedReaderFileDemo();
        } catch (IOException e) {
            System.out.println("Caught error: " + e);
        }
    }

}
