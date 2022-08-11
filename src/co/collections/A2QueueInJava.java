package co.collections;

import java.util.PriorityQueue;

public class A2QueueInJava {
	public static void main(String[] args) {
		PriorityQueue<Integer> queue = new PriorityQueue<Integer>();
		for (int i = 10; i > 0; i--) {
			queue.add(i);
		}
		// Queue: Front 10, 9, 8, 7, 6, 5, 4, 3, 2, 1 Rear
		// Priority queue sorts the data for us and the queue becomes
		// Queue: Front 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 Rear
		System.out.println(queue);
		System.out.println(queue.size());
		// Peeking -> Obtaining the head of the queue
		System.out.println(queue.peek());
		// Polling -> Removing the head of the queue
		queue.poll();
		// System.out.println(queue.poll());
		System.out.println(queue.size());
		System.out.println(queue.peek());
	}
}
