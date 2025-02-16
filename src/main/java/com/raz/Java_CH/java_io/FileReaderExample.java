package com.raz.Java_CH.java_io;

import java.io.FileReader;
import java.io.FileWriter;

public class FileReaderExample {
    public static void main(String[] args) {

        try(FileWriter fw = new FileWriter("Reader.txt")){
            fw.write("Hello World I am from the fileReader and file writer.");

        } catch (Exception e) {
            e.printStackTrace();
        }


        try(FileReader fr = new FileReader("Reader.txt");){
            int ch;
            while((ch=fr.read())!=-1){
                System.out.print((char)ch);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
