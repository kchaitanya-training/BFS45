package com.sample.day8;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;


public class FileRead {
    void fileMethod() throws IOException {
        File file=new File("sample");
        InputStream  is=new FileInputStream(file);
        int a=0;
        while((a=is.read())!=-1)

            System.out.print((char)a);

    }
    public static void main(String[] args) throws IOException {
        FileRead fr = new FileRead();
        fr.fileMethod();
    }
}
