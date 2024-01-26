package com.sample.day8;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class BufferOutput {
    void fileMethod() {
        File file = new File("sample");
        try (BufferedOutputStream bo = new BufferedOutputStream(new FileOutputStream(file))) {
            String s = "hello world";
            byte[] b = s.getBytes();
            bo.write(b);
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        BufferOutput bo = new BufferOutput();
        bo.fileMethod();
    }
}
