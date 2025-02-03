package com.raz.Java_CH.digest_collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class ArrayListExample {
    public static void main(String[] args) {

        // Internal Working
        // Unlike regular array, which has a fixed size, an ArrayList can grow and shrink as elements
        // are added or removed. This dynamic resizing is achieved by creating a new array when the current
        // array is full and copying the elements to the new array.

        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(55);
        list.add(8);
        list.add(92);


        Collections.sort(list);
        System.out.println(list);

        list.remove(Integer.valueOf(25));
        System.out.println(list);

//        Object[] array = list.toArray();
//        Integer[] array1 = list.toArray(new Integer[0]);


        List<Integer> list1 = List.of(36,35,34,33,32,31);  // List of is immutable (nothing can be done here).
        list.addAll(list1);                                // Arrays.asList we can replace omly (set).
        System.out.println(list);

        System.out.println(list.get(2));
        System.out.println(list.size());

        for(int i=0; i<list.size();i++){
            System.out.println(list.get(i));
        }

        for(int x : list){
            System.out.println(x);
        }

        System.out.println(list.contains(25));
        System.out.println(list.contains(50));

        list.remove(3);
        list.add(1,99);

        System.out.println(list);
        list.set(1,100);
        System.out.println(list);

        // Time Complexity
        // -> Access by index (get) is O(1).
        // -> Adding an element is O(n) in the worst case when resizing occurs.
        // -> Removing elements can be O(n) because it may involve shifting elements.
        // -> Iteration is O(n).
    }
}
