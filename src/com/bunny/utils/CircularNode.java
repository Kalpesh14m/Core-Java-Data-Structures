package com.bunny.utils;

public class CircularNode {

	private CircularNode next, previous;
	private int data;

	public CircularNode() {
	}

	public CircularNode(int data) {
		this.data = data;
		this.next = null;
		this.previous = null;
	}

	public CircularNode getNext() {
		return next;
	}

	public int getData() {
		return data;
	}

	public void setNext(CircularNode next) {
		this.next = next;
	}

	public void setData(int data) {
		this.data = data;
	}

	public CircularNode getPrevious() {
		return previous;
	}

	public void setPrevious(CircularNode previous) {
		this.previous = previous;
	}

}