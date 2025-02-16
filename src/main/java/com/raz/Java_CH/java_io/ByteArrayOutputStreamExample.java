package com.raz.Java_CH.java_io;

import java.io.ByteArrayOutputStream;
import java.io.FileOutputStream;

public class ByteArrayOutputStreamExample {
    public static void main(String[] args) {

       try ( FileOutputStream f1 = new FileOutputStream("file1.txt");
        FileOutputStream f2 = new FileOutputStream("file2.txt");
             ByteArrayOutputStream baos = new ByteArrayOutputStream()) {
           baos.write(1112233);
           baos.writeTo(f1);
           baos.writeTo(f2);
           baos.flush();

       } catch (Exception e) {
           e.printStackTrace();
       }
    }
}
