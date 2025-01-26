package com.raz.Java_CH.datatypes;

public class Test {

    public static void main(String[] args) {

        String str = "10000";
        int a = Integer.parseInt(str);
        System.out.println(a);

        byte b = 125;
        short s = 45;
        int i = 10;
        long lo =50;
        float f = 60.36f;
        double d = 80.56;
        char c = 'a';
        boolean bo = true;

        System.out.println(lo);

        // Automatic Casting from int to long
        long l = i;

        // Automatic Casting from int to double
        double e = i;  // Implicit Widening

        System.out.println("int i = " + i);
        System.out.println("long l =  " + l);
        System.out.println("double d = " + d);

        long w = 1584;
        float fo = 10.25f;
        int o = (int) f;  // Explicit Casting Narrowing
        System.out.println(w + " "+ f +" "+o);

//        Integer Caching ->
    }
}
