package com.project.java.collection.api;

import java.util.PriorityQueue;
import java.util.Queue;

public class QueueUsingPriorityQueue {

	public static void main(String[] args) {
		Queue<Integer> q = new PriorityQueue<Integer>();

		// Adds elements {0, 1, 2, 3, 4} to queue
		for (int i = 0; i < 5; i++)
			q.add(i);
		
		q.add(2);
		
		// Display contents of the queue.
		System.out.println("Elements of queue-" + q);

		// To remove the head of queue.
		int removedele = q.remove();
		System.out.println("removed element-" + removedele);

		System.out.println(q);
		
		// To view the head of queue
		int head = q.peek();
		System.out.println("head of queue-" + head);

		// Rest all methods of collection interface,
		// Like size and contains can be used with this
		// implementation.
		int size = q.size();
		System.out.println("Size of queue-" + size);
	}

}
