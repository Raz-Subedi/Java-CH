package com.raz.Java_CH.Collection.Queue;

import java.util.LinkedList;
import java.util.Queue;

public class LinkedListQueueExample {
    public static void main(String[] args) {

        Queue<Integer> queue = new LinkedList<>();

        queue.offer(12);
        queue.offer(24);
        queue.offer(36);

        System.out.println(queue);

        System.out.println(queue.poll());// Takes out the First in Element.
        System.out.println(queue);
        System.out.println(queue.peek()); //Gives the next element to come out.


        //add() offer() -> same work but add throws an exception
        //element() peek() -> same work but element() throws an exception.
        //remove() poll()  -> same as poll() but remove() throws an exception if queue id empty.
    }
}
