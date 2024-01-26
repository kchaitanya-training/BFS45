package Day8.BuffReader;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

//write a program to read text using buffered input stream and buffered output stream
public class Output {
    void method() throws IOException
    {
        File f = new File("/Users/bjmac/IntellijWork/BFS45/Day8/BuffReader/sample.txt");
        BufferedOutputStream bo = new BufferedOutputStream(new FileOutputStream(f));

        String str = " Hello Sample What's going on....updated";
        byte [] b = str.getBytes();

        bo.write(b);
        bo.close();



    }

    public static void main(String[] args) throws IOException {
        Output ou = new Output();
        ou.method();






    }
}
