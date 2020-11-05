package com.bunny.queue;

import com.bunny.algo.CircularQueueAlgo;
import com.bunny.utils.InputUtility;

public class CircularQueue {
	public static void main(String[] args) {
		System.out.println("Enter size of queue: ");
		CircularQueueAlgo q = new CircularQueueAlgo(InputUtility.intVal());
		int choice = 0;
		do {
			System.out.println("\n*********Queue Operations*********");
			System.out.println("1.Add \n2.Delete\n3.Display\n4.EXIT");
			choice = InputUtility.intVal();
			switch (choice) {
			case 1:
				System.out.println("Enter Data to insert: ");
				q.enQueue(InputUtility.intVal());
				break;
			case 2:
				int x = q.deQueue();
				if (x != -1) {
					System.out.print("Deleted value = ");
					System.out.println(x);
				}
				break;
			case 3:
				q.displayQueue();
				break;
			case 4:
				System.out.println("Bye...!!");
				break;
			default:
				System.out.println("Enter Valid Choice!!!");
				break;
			}
		} while (choice != 4);
	}
}
