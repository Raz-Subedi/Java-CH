package com.raz.Java_CH.exception;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class TryWithResource {
    public static void main(String[] args) {
        try(BufferedReader reader = new BufferedReader(new FileReader("demo.txt"));){

            String line;
            while((line = reader.readLine())!=null){
                System.out.println(line);
            }
        }catch (IOException e){
            System.out.println("IOException caught: " +e.getMessage());
        }

    }
}
