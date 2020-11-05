package com.bunny.algo;

import java.util.ArrayList;

public class CircularQueueAlgo {

	private final int SIZE;
	private int front, rear;

	private ArrayList<Integer> queue = new ArrayList<>();

	public CircularQueueAlgo(int size) {
		this.SIZE = size;
		this.front = this.rear = -1;
	}

	public void enQueue(int data) {
		if ((front == 0 && rear == SIZE - 1) || (rear == (front - 1) % (SIZE - 1))) {
			System.out.print("Queue is Full");
		} else if (front == -1) {
			front = 0;
			rear = 0;
			queue.add(rear, data);
		} else if (rear == SIZE - 1 && front != 0) {
			rear = 0;
			queue.set(rear, data);
		} else {
			rear = (rear + 1);
			if (front <= rear) {
				queue.add(rear, data);
			} else {
				queue.set(rear, data);
			}
		}
	}

	public int deQueue() {
		int temp;
		if (front == -1) {
			System.out.print("Queue is Empty");
			return -1;
		}
		temp = queue.get(front);
		if (front == rear) {
			front = -1;
			rear = -1;
		} else if (front == SIZE - 1) {
			front = 0;
		} else {
			front = front + 1;
		}
		return temp;
	}

	public void displayQueue() {
		if (front == -1) {
			System.out.print("Queue is Empty");
			return;
		}
		System.out.print("Elements in the " + "circular queue are: ");
		if (rear >= front) {
			for (int i = front; i <= rear; i++) {
				System.out.print(queue.get(i));
				System.out.print(" ");
			}
			System.out.println();
		} else {
			for (int i = front; i < SIZE; i++) {
				System.out.print(queue.get(i));
				System.out.print(" ");
			}
			for (int i = 0; i <= rear; i++) {
				System.out.print(queue.get(i));
				System.out.print(" ");
			}
			System.out.println();
		}
	}
}
