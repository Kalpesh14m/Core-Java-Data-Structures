package com.bunny.utils;

public class Node {

	private Node next;
	private int data;

	public Node() {
	}

	public Node(int data) {
		this.data = data;
		this.next = null;
	}

	public Node getNext() {
		return next;
	}

	public int getData() {
		return data;
	}

	public void setNext(Node next) {
		this.next = next;
	}

	public void setData(int data) {
		this.data = data;
	}

}