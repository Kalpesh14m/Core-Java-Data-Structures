package com.bunny.utils;

public class BinaryNode<K extends Comparable<K>> {
	K key;
	BinaryNode<K> left;
	BinaryNode<K> right;

	public BinaryNode(K key) {
		this.key = key;
		this.left = null;
		this.right = null;
	}

}
