package com.raz.Java_CH.Operators;

public class Assignment {

        public static void main(String[] args)
        {
            int f = 7;
            int d = 6;
            double g = 7.8;
            int e =  d +(int) g;
            System.out.println(e);
            System.out.println("f += 3: " + (f += (int)3.56));
            System.out.println("f -= 2: " + (f -= 2));
            System.out.println("f *= 4: " + (f *= 4));
            System.out.println("f /= 3: " + (f /= 3));
            System.out.println("f %= 2: " + (f %= 2));
            System.out.println("f &= 0b1010: " + (f &= 0b1010));
            System.out.println("f |= 0b1100: " + (f |= 0b1100));
            System.out.println("f ^= 0b1010: " + (f ^= 0b1010));
            System.out.println("f <<= 2: " + (f <<= 2));
            f = -5;
            System.out.println("f >>= 1: " + (f >>= 1));
            System.out.println(Integer.toBinaryString(f));
            f=-5;
            System.out.println("f >>>= 1: " + (f >>>= 1));
            System.out.println(Integer.toBinaryString(f));


            int hours = 40;
            System.out.printf("I worked %d hours.\n", hours);

        }
}
