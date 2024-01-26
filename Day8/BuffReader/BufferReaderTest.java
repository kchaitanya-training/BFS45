package Day8.BuffReader;

import java.io.*;

public class BufferReaderTest {
    void method() throws IOException {
        File file = new File("/Users/bjmac/IntellijWork/BFS45/Day8/BuffReader/inputsample.txt");
        System.out.println(file.isFile());

       BufferedReader rdr = new BufferedReader(new FileReader(file));

       String s = null;
       while ((s = rdr.readLine()) != null)
       {
           System.out.println(s);
       }


    }
    public static void main(String[] args) throws IOException {
        BufferReaderTest obj = new BufferReaderTest();
        obj.method();
    }
}
