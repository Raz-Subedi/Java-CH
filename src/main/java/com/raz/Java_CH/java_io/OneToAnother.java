package com.raz.Java_CH.java_io;


import java.io.FileReader;
import java.io.FileWriter;

// Example to read the content from one file and write to another file
public class OneToAnother {
    public static void main(String[] args) {

        try(FileReader fileReader = new FileReader("Output.txt");
            FileWriter fileWriter = new FileWriter("Reader.txt")){

            int ch;
            while((ch = fileReader.read()) != -1){
                fileWriter.write(ch);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
