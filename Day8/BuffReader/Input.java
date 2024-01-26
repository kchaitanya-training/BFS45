package Day8.BuffReader;

import java.io.*;

public class Input {
    void method() throws IOException {
        File fi = new File("/Users/bjmac/IntellijWork/BFS45/Day8/BuffReader/inputsample.txt");  //file path
        System.out.println(fi.isFile());
        BufferedInputStream bi = new BufferedInputStream(new FileInputStream(fi));                   //create to read from file
        System.out.println();
        int inp = 0;                                                                                //variable to store read byte
        while((inp = bi.read()) != -1)                                                              //read bytes from the file until the end of the file is reached
        {
            System.out.println((char)inp);

        }

        bi.close();

    }

    public static void main(String[] args) throws IOException {
        Input ip = new Input();
        ip.method();

    }
}
