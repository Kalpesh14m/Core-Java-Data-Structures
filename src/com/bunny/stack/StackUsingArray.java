package com.bunny.stack;

import java.util.Arrays;

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

class StackOperation {
	int top;
	int SIZE;
	Integer[] stk;

	public StackOperation(int size) {
		top = -1;
		SIZE = size;
		stk = new Integer[SIZE];
	}

	public StackOperation() {

	}

	public boolean isEmpty() {
		return (top <= -1);
	}

	public boolean isFull() {
		return (top >= SIZE - 1);
	}

	public boolean push() {
		if (isFull()) {
			return false;
		}
		top++;
		stk[top] = getItem();
		return true;
	}

	private int getItem() {
		System.out.print("Enter Value: ");
		return InputUtility.intVal();
	}

	public boolean pop() {
		if (isEmpty()) {
			return false;
		}
		stk[top] = 0;
		top--;
		return true;
	}

	public boolean show() {
		if (isEmpty())
			return false;
		System.out.println(Arrays.asList(stk));
		return true;
	}

}