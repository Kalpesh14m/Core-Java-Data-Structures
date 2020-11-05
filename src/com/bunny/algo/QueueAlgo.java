package com.bunny.algo;

public class QueueAlgo {
	private int front, rear;
	private int size;
	private int capacity;
	private int[] array;

	public QueueAlgo(int capacity) {
		this.capacity = capacity;
		front = this.size = 0;
		rear = capacity - 1;
		array = new int[this.capacity];
	}

	private boolean isFull(QueueAlgo queue) {
		return (queue.size == queue.capacity);
	}

	private boolean isEmpty(QueueAlgo queue) {
		return (queue.size == 0);
	}

	public void enqueue(int item) {
		if (isFull(this))
			System.out.println("Queue full..");
		this.rear = (this.rear + 1) % this.capacity;
		this.array[this.rear] = item;
		this.size++;
		System.out.println(item + " enqueued to queue");
	}

	public int dequeue() {
		if (isEmpty(this)) {
			System.out.println("Queue Empty...");
			return Integer.MIN_VALUE;
		}
		int item = this.array[this.front];
		this.front = (this.front + 1) % this.capacity;
		this.size--;
		return item;
	}

	public void displayQueue() {
		if (isEmpty(this)) {
			System.out.print("Queue is Empty");
			return;
		} else {
			int temp = front;
			while (temp < rear) {
				temp++;
				System.out.println(array[temp]);
			}
		}
	}

}
