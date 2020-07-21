package com.bunny.test;

import java.util.Random;

import com.bunny.singlelinklist.LinkListOperations;
import com.bunny.utils.Node;

public class FindLast25ThElementInSLL {

	public static void main(String[] args) {
		LinkListOperations list = new LinkListOperations();

		Random rand = new Random();
		for (int i = 0; i < 150; i++) {
			list.insertFirst(list, rand.nextInt(10000));
		}
		list.printList(list);
		System.out.println("\n\n");
//		System.out.println("Element is: " + list.pickNth(list, list.getSize() - 10));
		System.out.println("Element is: " + pickNthEle(list));
	}

	public static int pickNthEle(LinkListOperations list) {
		int i = 0;

		Node currNode = list.head;
		Node temp = list.head;
		while (currNode != null) {
			currNode = currNode.next;
			i++;
			if (i > 25) {
				temp = temp.next;
			}
		}
		return temp.data;
	}
}
