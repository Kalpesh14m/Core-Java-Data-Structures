package com.bunny.algo;

import com.bunny.utils.CircularNode;

public class DoubleLinkListOperations {
	private CircularNode head;
	private int counter;

	public DoubleLinkListOperations insertFirst(DoubleLinkListOperations list, int data) {
		CircularNode newNode = new CircularNode(data);
		newNode.setNext(null);
		newNode.setPrevious(null);

		if (list.getHead() == null) {
			list.setHead(newNode);
		} else {
			newNode.setNext(getHead());
			setHead(newNode);
			newNode.setPrevious(null);
		}
		counter++;
		return list;
	}

	public DoubleLinkListOperations insertLast(DoubleLinkListOperations list, int data) {
		CircularNode newNode = new CircularNode(data);
		newNode.setNext(null);
		newNode.setPrevious(null);

		if (list.getHead() == null) {
			list.setHead(newNode);
		} else {
			CircularNode last = list.getHead();
			while (last.getNext() != null) {
				last = last.getNext();
			}
			last.setNext(newNode);
			newNode.setPrevious(last);
		}
		counter++;
		return list;
	}

	public DoubleLinkListOperations insertNth(DoubleLinkListOperations list, int data, int pos) {
		CircularNode newNode = new CircularNode(data);
		newNode.setNext(null);
		newNode.setPrevious(null);
		int i = 0;

		if (list.getHead() == null) {
			list.setHead(newNode);
		} else if (0 >= pos || pos >= counter) {
			System.out.println("Invalid Position");
		} else {
			CircularNode last = list.getHead();
			while (i < pos) {
				last = last.getNext();
				i++;
			}
			newNode.setNext(last.getNext());
			newNode.setPrevious(last);
			newNode.getNext().setPrevious(newNode);
			last.setNext(newNode);
			counter++;
		}
		return list;
	}

	public DoubleLinkListOperations deleteFirst(DoubleLinkListOperations list) {
		if (list.getHead() == null) {
			System.out.println("List is Empty!!!");
		} else {
			CircularNode temp = getHead();
			head.setPrevious(null);
			setHead(getHead().getNext());
			temp.setNext(null);
		}
		counter--;
		return list;
	}

	public DoubleLinkListOperations deleteLast(DoubleLinkListOperations list) {
		if (list.getHead() == null) {
			System.out.println("List is Empty!!!");
		} else {
			CircularNode last = list.getHead();
			CircularNode temp = getHead();
			while (last.getNext() != null) {
				temp = last;
				last = last.getNext();
			}
			temp.setNext(null);
			last.setPrevious(null);
		}
		counter--;
		return list;
	}

	public DoubleLinkListOperations deleteNth(DoubleLinkListOperations list, int pos) {
		int i = 0;

		if (list.getHead() == null) {
			System.out.println("List is Empty!!!");
		} else if (pos > counter || 0 > pos) {
			System.out.println("Invalid Position");
		} else {
			CircularNode last = list.getHead();
			CircularNode temp = getHead();
			while (i < pos) {
				temp = last;
				last = last.getNext();
				i++;
			}
			temp.setNext(last.getNext());
			last.getNext().setPrevious(temp);
			last.setNext(null);
			last.setPrevious(null);
			counter--;
		}
		return list;
	}

	public void printList(DoubleLinkListOperations list) {
		CircularNode currNode = list.getHead();
		System.out.print("LinkedList: ");
		while (currNode != null) {
			System.out.print(currNode.getData() + " ");
			currNode = currNode.getNext();
		}
	}

	public int getSize() {
		return counter;
	}

	public int pickNth(DoubleLinkListOperations list, int pos) {
		int i = 0;
		int data = 0;
		if (list.getHead() == null) {
			System.out.println("List is Empty!!!");
		} else if (pos > counter || 0 > pos) {
			System.out.println("Invalid Position");
		} else {
			CircularNode last = list.getHead();
			while (i < pos) {
				last = last.getNext();
				i++;
			}
			data = last.getData();
		}
		return data;
	}

	public int pickNthEle(DoubleLinkListOperations list) {
		int i = 0;
		CircularNode currNode = list.head;
		CircularNode temp = list.head;
		while (currNode != null) {
			currNode = currNode.getNext();
			i++;
			if (i > 25) {
				temp = temp.getNext();
			}
		}
		return temp.getData();
	}

	public CircularNode getHead() {
		return head;
	}

	public void setHead(CircularNode head) {
		this.head = head;
	}
}
