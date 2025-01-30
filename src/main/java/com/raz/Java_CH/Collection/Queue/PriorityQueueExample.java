package com.raz.Java_CH.Collection.Queue;

import java.util.PriorityQueue;
import java.util.Queue;

public class PriorityQueueExample {
    public static void main(String[] args) {

        // Here the program works as the min heap.
        // The smallest element is stored first.

        Queue<Integer> pq = new PriorityQueue<>();

        pq.add(21);
        pq.add(12);
        pq.add(53);
        pq.add(14);
        pq.add(65);

        System.out.println(pq);

        System.out.println(pq.size());

        pq.poll();
        System.out.println(pq);

        System.out.println(pq.peek());

        System.out.println(pq.size());

        pq.remove();
        System.out.println(pq);

        System.out.println(pq.size());
    }
}
