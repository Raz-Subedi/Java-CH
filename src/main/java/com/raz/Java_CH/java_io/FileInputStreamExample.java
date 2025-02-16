package com.raz.Java_CH.java_io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileInputStreamExample {
    public static void main(String[] args) {

        byte[] b = {'A', 'B', 'C', 'D', 'E', 'F'};
        try {
            FileOutputStream fos = new FileOutputStream("OutputStream.txt");
            fos.write("Hello World ".getBytes());
            fos.write(1000);
            fos.write(b);
            fos.close();
        }catch (IOException e){
            e.printStackTrace();
        }





        try {
            FileInputStream fis = new FileInputStream("OutputStream.txt");

            int c;
            while((c = fis.read()) != -1){
                System.out.print((char)c);
            }
            fis.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
