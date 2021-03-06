package com.StacksAndQueues;

public class MyNode<K> implements INode<K> {
	private K key;
	private INode<K> next;

	public MyNode(K key) {
		this.key = key;
		this.next = null;
	}

	public INode<K> getNext() {
		return next;
	}

	public void setNext(INode next) {
		this.next = next;
	}

	@Override
	public K getKey() {
		return key;
	}

	@Override
	public void setKey(K key) {
		this.key = key;
	}
}
