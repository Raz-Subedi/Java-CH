package com.raz.Java_CH.string;

public class StringBufferExample {
    public static void main(String[] args) {

        StringBuffer sb = new StringBuffer("Hello");
        sb.append(" World"); // "Hello World"
        sb.append(123); // "Hello World123"
        System.out.println(sb);

        StringBuffer sb1 = new StringBuffer("Hello");
        sb1.insert(1, "Java"); // "HJavaello"
        System.out.println(sb1);

        StringBuffer sb2 = new StringBuffer("Hello World");
        sb2.delete(5, 11); // "Hello"
        sb2.deleteCharAt(1); // "Hllo"
        System.out.println(sb2);

        StringBuffer sb4 = new StringBuffer("Hello World");
        sb4.replace(6, 11, "Java"); // "Hello Java"
        System.out.println(sb4);

        StringBuffer sb5 = new StringBuffer("Hello");
        sb5.reverse(); // "olleH"
        System.out.println();

        StringBuffer sb6 = new StringBuffer("Hello");
        System.out.println(sb6.length()); // 5                  length(): Returns the number of characters in the StringBuffer.
        System.out.println(sb6.capacity()); // 21 (16 + 5)      capacity(): Returns the current capacity (total allocated space).

        StringBuffer sb7 = new StringBuffer("Hello");
        sb7.setLength(3); // "Hel"
        sb7.setLength(10); // "Hel       " (padded with null characters)
        System.out.println(sb7);

        StringBuffer sb8 = new StringBuffer();
        sb8.ensureCapacity(50); // Ensures capacity is at least 50 -> Ensures that the capacity is at least equal to the specified minimum.

        StringBuffer sb9 = new StringBuffer("Hello");
        String str = sb9.toString(); // "Hello"  // Converts the String Buffer into String

//        StringBuffer s = new StringBuffer("razKUMAR");
//        s.replace(1,3,"eaz");
//        System.out.println(s);
//        System.out.println(s.capacity());
//        System.out.println(s.append(12));
//        System.out.println(s.insert(5,"Subedi"));
    }
}
