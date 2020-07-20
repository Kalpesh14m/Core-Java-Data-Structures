package com.bunny.stack;

import java.util.Stack;

import com.bunny.utils.InputUtility;

class StackOperation1 {
	static int SIZE;

	public StackOperation1(int size) {
		SIZE = size;
	}

	public StackOperation1() {

	}

	public void push(Stack<Integer> stack) {
		for (int i = 0; i < SIZE - 1; i++) {
			stack.push(i);
		}
	}

	public void pop(Stack<Integer> stack) {
		System.out.println("Pop :");

		for (int i = 0; i < SIZE; i++) {
			Integer y = (Integer) stack.pop();
			System.out.println(y);
		}
	}

	public void peek(Stack<Integer> stack) {
		Integer element = (Integer) stack.peek();
		System.out.println("Element on stack top : " + element);
	}

	public void search(Stack<Integer> stack, int element) {
		Integer pos = (Integer) stack.search(element);

		if (pos == -1)
			System.out.println("Element not found");
		else
			System.out.println("Element is found at position " + pos);
	}
}

public class StackUsingCollection {

	public static void main(String[] args) {
		Stack<Integer> stack = new Stack<Integer>();

		System.out.println("Enter Size of STACK: ");
		StackOperation1 stk = new StackOperation1(InputUtility.intVal());
		int choice = 0;
		do {
			System.out.println("*********Stack operations using array*********\n");
			System.out.println("\n1.PUSH\n2.POP\n3.Peek\n4.Search\n5.EXIT");
			choice = InputUtility.intVal();

			switch (choice) {
			case 1:

				stk.push(stack);
				break;
			case 2:
				stk.pop(stack);
				break;
			case 3:
				stk.peek(stack);
				break;
			case 4:
				stk.search(stack, 2);
				break;
			case 5:
				System.out.println("Bye...!!");
				break;
			default:
				System.out.println("Enter Valid Choice!!!");
				break;
			}
		} while (choice != 5);
	}

}