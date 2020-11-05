package com.bunny.queue;

import com.bunny.algo.LinearQueueAlgo;
import com.bunny.utils.InputUtility;

public class LinearQueue {
	public static void main(String[] args) {

		System.out.println("Enter size of queue: ");
		LinearQueueAlgo q = new LinearQueueAlgo(InputUtility.intVal());
		int choice = 0;
		do {
			System.out.println("\n*********Queue Operations*********");
			System.out.println("1.Add \n2.Delete\n3.Display\n4.EXIT");
			choice = InputUtility.intVal();
			switch (choice) {
			case 1:
				System.out.println("Enter Data to insert: ");
				q.add(InputUtility.intVal());
				break;
			case 2:
				q.delete();
				break;
			case 3:
				q.display();
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
