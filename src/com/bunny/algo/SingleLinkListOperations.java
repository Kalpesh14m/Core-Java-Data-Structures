package com.bunny.algo;

import com.bunny.utils.Node;

public class SingleLinkListOperations {
	private Node head;
	private int counter;

	public SingleLinkListOperations insertFirst(SingleLinkListOperations list, int data) {
		Node newNode = new Node(data);
		newNode.setNext(null);
		if (list.getHead() == null) {
			list.setHead(newNode);
		} else {
			newNode.setNext(getHead());
			setHead(newNode);
		}
		counter++;
		return list;
	}

	public SingleLinkListOperations insertLast(SingleLinkListOperations list, int data) {
		Node newNode = new Node(data);
		newNode.setNext(null);

		if (list.getHead() == null) {
			list.setHead(newNode);
		} else {
			Node last = list.getHead();
			while (last.getNext() != null) {
				last = last.getNext();
			}
			last.setNext(newNode);
		}
		counter++;
		return list;
	}

	public SingleLinkListOperations insertNth(SingleLinkListOperations list, int data, int pos) {
		Node newNode = new Node(data);
		newNode.setNext(null);
		int i = 0;

		if (list.getHead() == null) {
			list.setHead(newNode);
		} else if (0 >= pos || pos >= counter) {
			System.out.println("Invalid Position");
		} else {
			Node last = list.getHead();
			while (i < pos) {
				last = last.getNext();
				i++;
			}
			newNode.setNext(last.getNext());
			last.setNext(newNode);
			counter++;
		}
		return list;
	}

	public SingleLinkListOperations deleteFirst(SingleLinkListOperations list) {
		if (list.getHead() == null) {
			System.out.println("List is Empty!!!");
		} else {
			Node temp = getHead();
			setHead(getHead().getNext());
			temp.setNext(null);
		}
		counter--;
		return list;
	}

	public SingleLinkListOperations deleteLast(SingleLinkListOperations list) {
		if (list.getHead() == null) {
			System.out.println("List is Empty!!!");
		} else {
			Node last = list.getHead();
			Node temp = getHead();
			while (last.getNext() != null) {
				temp = last;
				last = last.getNext();
			}
			temp.setNext(null);
		}
		counter--;
		return list;
	}

	public SingleLinkListOperations deleteNth(SingleLinkListOperations list, int pos) {
		int i = 0;

		if (list.getHead() == null) {
			System.out.println("List is Empty!!!");
		} else if (pos > counter || 0 > pos) {
			System.out.println("Invalid Position");
		} else {
			Node last = list.getHead();
			Node temp = getHead();
			while (i < pos) {
				temp = last;
				last = last.getNext();
				i++;
			}
			temp.setNext(last.getNext());
			last.setNext(null);
			counter--;
		}
		return list;
	}

	public void printList(SingleLinkListOperations list) {
		Node currNode = list.getHead();
		System.out.print("LinkedList: ");
		while (currNode != null) {
			System.out.print(currNode.getData() + " ");
			currNode = currNode.getNext();
		}
	}

	public int getSize() {
		return counter;
	}

	public int pickNth(SingleLinkListOperations list, int pos) {
		int i = 0;
		int data = 0;
		if (list.getHead() == null) {
			System.out.println("List is Empty!!!");
		} else if (pos > counter || 0 > pos) {
			System.out.println("Invalid Position");
		} else {
			Node last = list.getHead();
			while (i < pos) {
				last = last.getNext();
				i++;
			}
			data = last.getData();
		}
		return data;
	}

	public int pickNthEle(SingleLinkListOperations list) {
		int i = 0;
		Node currNode = list.head;
		Node temp = list.head;
		while (currNode != null) {
			currNode = currNode.getNext();
			i++;
			if (i > 25) {
				temp = temp.getNext();
			}
		}
		return temp.getData();
	}

	public Node getHead() {
		return head;
	}

	public void setHead(Node head) {
		this.head = head;
	}
}
