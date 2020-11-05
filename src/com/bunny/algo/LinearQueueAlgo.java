package com.bunny.algo;

public class LinearQueueAlgo {
	private int rear = -1, front = -1;
	private final int SIZE;
	private int[] queue;

	public LinearQueueAlgo(int size) {
		SIZE = size;
		queue = new int[size];
	}

	private boolean isFull() {
		return (rear == SIZE - 1);
	}

	private boolean isEmpty() {
		return (front == rear || front == SIZE - 1);
	}

	public void add(int data) {
		if (isFull()) {
			System.out.println("Full");
		} else {
			queue[++rear] = data;
			System.out.println(data + " Added");
		}
	}

	public void delete() {
		if (isEmpty()) {
			System.out.println("Empty");
		} else {
			System.out.println(queue[++front] + " Deleted");
		}
	}

	public void display() {
		if (isEmpty()) {
			System.out.println("Empty");
		} else {
			int temp = front;
			while (temp < rear) {
				System.out.print(queue[++temp] + " ");
			}
		}
	}
}
