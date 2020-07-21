package com.bunny.singlelinklist;

import com.bunny.utils.Node;

public class LinkListOperations {
	public Node head;
	static int counter;

	public LinkListOperations insertFirst(LinkListOperations list, int data) {
		Node newNode = new Node(data);
		newNode.next = null;
		if (list.head == null) {
			list.head = newNode;
		} else {
			newNode.next = head;
			head = newNode;
		}
		counter++;
		return list;
	}

	public LinkListOperations insertLast(LinkListOperations list, int data) {
		Node newNode = new Node(data);
		newNode.next = null;

		if (list.head == null) {
			list.head = newNode;
		} else {
			Node last = list.head;
			while (last.next != null) {
				last = last.next;
			}
			last.next = newNode;
		}
		counter++;
		return list;
	}

	public LinkListOperations insertNth(LinkListOperations list, int data, int pos) {
		Node newNode = new Node(data);
		newNode.next = null;
		int i = 0;

		if (list.head == null) {
			list.head = newNode;
		} else if (0 >= pos || pos >= counter) {
			System.out.println("Invalid Position");
		} else {
			Node last = list.head;
			while (i < pos) {
				last = last.next;
				i++;
			}
			newNode.next = last.next;
			last.next = newNode;
			counter++;
		}
		return list;
	}

	public LinkListOperations deleteFirst(LinkListOperations list) {
		if (list.head == null) {
			System.out.println("List is Empty!!!");
		} else {
			Node temp = head;
			head = head.next;
			temp.next = null;
		}
		counter--;
		return list;
	}

	public LinkListOperations deleteLast(LinkListOperations list) {
		if (list.head == null) {
			System.out.println("List is Empty!!!");
		} else {
			Node last = list.head;
			Node temp = null;
			while (last.next != null) {
				temp = last;
				last = last.next;
			}
			temp.next = null;
		}
		counter--;
		return list;
	}

	public LinkListOperations deleteNth(LinkListOperations list, int pos) {
		int i = 0;

		if (list.head == null) {
			System.out.println("List is Empty!!!");
		} else if (pos > counter || 0 > pos) {
			System.out.println("Invalid Position");
		} else {
			Node last = list.head;
			Node temp = null;
			while (i < pos) {
				temp = last;
				last = last.next;
				i++;
			}
			temp.next = last.next;
			last.next = null;
			last = null;
			counter--;
		}
		return list;
	}

	public void printList(LinkListOperations list) {
		Node currNode = list.head;
		System.out.print("LinkedList: ");
		while (currNode != null) {
			System.out.print(currNode.data + " ");
			currNode = currNode.next;
		}
	}

	public int getSize() {
		return counter;
	}

	public int pickNth(LinkListOperations list, int pos) {
		int i = 0;
		int data = 0;
		if (list.head == null) {
			System.out.println("List is Empty!!!");
		} else if (pos > counter || 0 > pos) {
			System.out.println("Invalid Position");
		} else {
			Node last = list.head;
			while (i < pos) {
				last = last.next;
				i++;
			}
			data = last.data;
		}
		return data;
	}

}
