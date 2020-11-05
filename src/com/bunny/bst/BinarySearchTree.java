package com.bunny.bst;

import com.bunny.algo.MyBinaryTree;

public class BinarySearchTree {
	public static void main(String[] args) {
		MyBinaryTree<Integer> myBinaryTree = new MyBinaryTree<>();
		myBinaryTree.add(56);
		myBinaryTree.add(56);
		myBinaryTree.add(30);
		myBinaryTree.add(70);

		System.out.println("Tree Size: " + myBinaryTree.getSize());
	}
}
