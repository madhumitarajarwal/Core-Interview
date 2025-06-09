package com.rays.collection;

import java.util.PriorityQueue;
import java.util.Queue;
import java.util.concurrent.ArrayBlockingQueue;

public class TestAddOffer {
	public static void main(String[] args) {
		Queue q1 = new ArrayBlockingQueue(2);
		q1.offer(1);
		q1.offer(2);
		q1.offer(3);
		System.out.println(q1);

		Queue q = new ArrayBlockingQueue(1);
		q.add(4);
		q.add(5);
//		q.add(6);
//		q.add(7);
		System.out.println(q);

		// We can use Iterator to iterate

//        Queue q1 = new PriorityQueue();
////        q1.offer(3);
////        q1.offer(4);
//        System.out.println(q1.poll());

	}
}