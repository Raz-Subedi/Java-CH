package com.raz.Java_CH.Operators;

public class Bitwise {
    public static void main(String[] args) {
        int a = 5;  // Binary: 0101
        int b = 2;  // Binary: 0011

        // Bitwise AND
        System.out.println("a & b: " + (a & b)); // Binary: 0001 -> Decimal: 1

        // Bitwise OR
        System.out.println("a | b: " + (a | b)); // Binary: 0111 -> Decimal: 7

        // Bitwise XOR
        System.out.println("a ^ b: " + (a ^ b)); // Binary: 0110 -> Decimal: 6

        // Bitwise Complement
        System.out.println("~a: " + (~a));       // Binary: 1010 (2's complement) -> Decimal: -6

        // Left Shift
        System.out.println("a << 1: " + (a << 1)); // Binary: 1010 -> Decimal: 10

        // Right Shift
        System.out.println("a >> 1: " + (a >> 1)); // Binary: 0010 -> Decimal: 2

        // Unsigned Right Shift
        System.out.println(a<<b); // Binary: 0010 -> Decimal: 2
    }
}
