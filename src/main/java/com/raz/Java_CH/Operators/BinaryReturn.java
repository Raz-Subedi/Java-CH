package com.raz.Java_CH.Operators;

public class BinaryReturn {
     StringBuffer stringBuffer = new StringBuffer("");
    void binary(int a) {
        while (a > 1) {
            int w = a % 2;
            stringBuffer.append(w);
            a/=2;
        }
        if(a == 1) stringBuffer.append(a);
        System.out.println(stringBuffer.reverse().toString());
    }



    public static void main(String[] args) {
        BinaryReturn b = new BinaryReturn();
        b.binary(32);

    }

}
