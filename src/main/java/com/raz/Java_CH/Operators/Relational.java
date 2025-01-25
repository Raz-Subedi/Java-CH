package com.raz.Java_CH.Operators;

public class Relational {
        public static void main(String[] args)
        {
            // Comparison operators
            int a = 10;
            double b = 3.00;
            float c = 15.0f;
            String s = "1000";

            int i = Integer.parseInt(s);
            double d = Double.parseDouble(s);
            float f = Float.parseFloat(s);

            System.out.println("a > b: " + (a > b));
            System.out.println("a < b: " + (a < b));
            System.out.println("a >= b: " + (a >= b));
            System.out.println("a <= b: " + (a <= b));
            System.out.println("a == c: " + (a == c));
            System.out.println("a != c: " + (a != c));

            System.out.println(d>c);
            System.out.println(i<a);
            System.out.println(f==b);
        }
}
