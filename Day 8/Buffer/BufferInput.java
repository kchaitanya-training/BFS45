package com.sample.day8;
import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class BufferInput {
    void fileMethod() throws IOException {
        File file = new File("sample");
        InputStream is = new BufferedInputStream(new FileInputStream(file));

        int i = 0;
        while((i = is.read()) != -1) {
            System.out.print((char)i);
        }

        is.close();
    }

    public static void main(String[] args) throws IOException {
        BufferInput bi = new BufferInput();
        bi.fileMethod();
    }
}
