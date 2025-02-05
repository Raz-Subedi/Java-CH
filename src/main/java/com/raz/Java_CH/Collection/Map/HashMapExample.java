package com.raz.Java_CH.Collection.Map;

import java.util.HashMap;
import java.util.Map;

public class HashMapExample {
    public static void main(String[] args) {

        HashMap<Integer, Double> hm = new HashMap<>();

        //adding key value pairs using put()
        hm.put(1, 1.9);
        hm.put(2, 2.8);
        hm.put(3, 3.7);

        // Finding the value for a key using get()
        System.out.println("The Value for 1 is " + hm.get(1));

    }
}
