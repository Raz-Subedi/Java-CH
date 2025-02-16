package com.raz.Java_CH.java_io;

import java.io.*;

public class BufferedInputStreamExample {
    public static void main(String[] args){

       try( FileOutputStream fos = new FileOutputStream("Buffered.txt");
        BufferedOutputStream bos = new BufferedOutputStream(fos)){
        bos.write("Hello World".getBytes());
        } catch (IOException e) {
           e.printStackTrace();
       }


       try (FileInputStream fis = new FileInputStream("Buffered.txt");
        BufferedInputStream bis = new BufferedInputStream(fis)) {
           int line;
           while ((line = bis.read()) != -1) {
               System.out.print((char) line);
           }
       } catch (IOException e) {
           e.printStackTrace();
       }
    }
}
