package com.epam.collections.queue;

import java.util.ArrayDeque;
import java.util.PriorityQueue;
import java.util.Queue;

public class ArrayDequeCreator extends PriorityQueue<String> {
    public ArrayDeque<Integer> createArrayDeque(Queue<Integer> firstQueue, Queue<Integer> secondQueue) {
        ArrayDeque<Integer> deque = new ArrayDeque<>();
        deque.addLast(firstQueue.remove());
        deque.addLast(firstQueue.remove());
        deque.addLast(secondQueue.remove());
        deque.addLast(secondQueue.remove());

        while(!firstQueue.isEmpty() || !secondQueue.isEmpty()) {
            firstQueue.add(deque.pollLast());
            deque.addLast(firstQueue.remove());
            deque.addLast(firstQueue.remove());
            secondQueue.add(deque.pollLast());
            deque.addLast(secondQueue.remove());
            deque.addLast(secondQueue.remove());
        }

        return deque;
    }
}
