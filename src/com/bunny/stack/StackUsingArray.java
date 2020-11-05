package com.bunny.stack;

import com.bunny.algo.StackOperation;
import com.bunny.utils.InputUtility;

public class StackUsingArray {

	public static void main(String[] args) {
		int choice = 0;
		System.out.println("Enter Size of STACK: ");
		StackOperation st = new StackOperation(InputUtility.intVal());
		do {
			System.out.println("*********Stack operations using array*********\n");
			System.out.println("\n1.PUSH\n2.POP\n3.Show\n4.EXIT");
			choice = InputUtility.intVal();

			switch (choice) {
			case 1:
				if (st.push()) {
					System.out.println("Item Added");
				} else {
					System.out.println("Sorry Stack if FULL...!!!");
					System.out.println("Item Not Added");
				}
				break;
			case 2:
				if (st.pop())
					System.out.println("item remove");
				else
					System.out.println("Stack is Empty...!!!");
				break;
			case 3:
				if (st.show())
					System.out.println("Stack Items: ");
				else
					System.out.println("Stack is Empty...!!!");
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
