package com.raz.Java_CH.datatypes;

public class IntegerCachingExample {
    public static void main(String[] args) {
        Integer a = 127; // Autoboxing
        Integer b = 127; // Cached value reused

        System.out.println(a == b); // true, same object reference

        Integer c = 128; // Autoboxing
        Integer d = 128; // New object created

        System.out.println(c == d); // false, different object references

/*        Integer Caching in Java refers to the internal optimization where Integer objects between -128 and 127 are pre-cached.
                Key points:

        Integers in this range are stored in an internal cache
        Reused objects prevent unnecessary memory allocation
        Works with autoboxing and Integer.valueOf() method
        Improves performance and memory efficiency*/
    }
}

