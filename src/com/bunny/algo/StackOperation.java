package com.bunny.algo;

import java.util.Arrays;

import com.bunny.utils.InputUtility;

public class StackOperation {
	private int top;
	private final int SIZE;
	private Integer[] stk;

	public StackOperation(int size) {
		this.SIZE = size;
		top = -1;
		stk = new Integer[size];
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
		stk[top] = null;
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
