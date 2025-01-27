package com.raz.Java_CH.jump;

public class ContinueExample {
    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            if (i % 2 == 0) {
                continue;
            }
            System.out.println(i);
        }

    }
    // The continue statement is used to skip the current iteration of a loop and proceed to the next iteration.
}
