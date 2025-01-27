package com.raz.Java_CH.userInput;

import java.util.Scanner;

public class ScannerExample {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // in is the instance of the InputStream Class.

        System.out.println("Enter your Name");
        String s = scanner.nextLine();

        System.out.println(s);
    }
}
