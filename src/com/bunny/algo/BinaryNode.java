package com.bunny.algo;

public class BinaryNode<K extends Comparable<K>> {
	// T K N _ _
	K key;
	BinaryNode<K> left;
	BinaryNode<K> right;

	public BinaryNode(K key) {
		this.key = key;
		this.left = null;
		this.right = null;
	}

}
