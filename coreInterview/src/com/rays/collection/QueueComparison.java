package com.rays.collection;

import java.util.*;

public class QueueComparison {
    public static void main(String[] args) {
        
        // PriorityQueue Example
        Queue<Integer> priorityQueue = new PriorityQueue<>();
        priorityQueue.offer(100);
        priorityQueue.offer(200);
        priorityQueue.offer(30);
        priorityQueue.offer(400);
        
        System.out.println(" PriorityQueue Output:");
        System.out.println("Original Queue: " + priorityQueue); // Sorted order (heap-based)
        System.out.println("element(): " + priorityQueue.element());   //peek jaise hi hai but empty queue pe exception deta hai
        System.out.println("peek(): " + priorityQueue.peek()); //	Head element dikhata hai (remove nahi karta)
        System.out.println("poll(): " + priorityQueue.poll());  // removes head
        System.out.println("remove(): " + priorityQueue.remove());  // removes next head
        System.out.println("After poll and remove: " + priorityQueue);
        System.out.println("remove(200): " + priorityQueue.remove(200));//poll jaise hi hai, but empty queue pe exception deta hai
        System.out.println("Final Queue: " + priorityQueue);
        
        System.out.println("\n-----------------------------\n");

        // LinkedList Example
        Queue<Integer> linkedListQueue = new LinkedList<>();
        linkedListQueue.offer(100);
        linkedListQueue.offer(200);
        linkedListQueue.offer(30);
        linkedListQueue.offer(400);
        
        System.out.println(" LinkedList Queue Output:");
        System.out.println("Original Queue: " + linkedListQueue); // Insertion order
        System.out.println("element(): " + linkedListQueue.element());
        System.out.println("peek(): " + linkedListQueue.peek());
        System.out.println("poll(): " + linkedListQueue.poll());  // removes head
        System.out.println("remove(): " + linkedListQueue.remove());  // removes next head
        System.out.println("After poll and remove: " + linkedListQueue);
        System.out.println("remove(200): " + linkedListQueue.remove(200));
        System.out.println("Final Queue: " + linkedListQueue);
    }
}
