package com.raz.Java_CH.Collection.Queue;

import java.util.ArrayDeque;

public class ArrayDequeExample {
    public static void main(String[] args) {

            ArrayDeque<Integer> adq = new ArrayDeque<>();
            adq.offer(23);
            adq.offerFirst(12);
            adq.offerLast(45);
            adq.offer(26);

            System.out.println(adq);

            System.out.println(adq.peek());
            System.out.println(adq.peekFirst());
            System.out.println(adq.peekLast());

            System.out.println(adq.poll());
            System.out.println("Poll() "+adq);

            System.out.println(adq.pollFirst());
            System.out.println("PollFirst() "+adq);

            System.out.println(adq.pollLast());
            System.out.println("PollLast() "+adq);
        }

}
