package com.raz.Java_CH.java_io;

import java.io.*;

public class BufferedWriterExample {
    public static void main(String[] args) throws IOException {

        String[] name = {"Raz","Kumar","Subedi"};
        BufferedWriter bw = new BufferedWriter(new FileWriter("Output.txt"));
        bw.write("Hello World I am Writing !!!!");
        bw.write("\n Here is the another line");
        for (String n : name) {
            bw.write("\n" + n);
        }
        bw.close();


        BufferedReader br = new BufferedReader(new FileReader("Output.txt"));
        String line;
        while((line = br.readLine()) != null){
            System.out.println(line);
        }
        br.close();

    }
}
