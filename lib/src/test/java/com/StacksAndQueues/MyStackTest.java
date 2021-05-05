package com.StacksAndQueues;

import static org.junit.Assert.*;
import org.junit.Test;

public class MyStackTest {
	
	@Test
	public void given3NumbersWhenAddedToStackShouldHaveLastAddedNode() {
		MyStack<Integer> myStack=new MyStack<>();
		MyNode<Integer> myFirstNode = new MyNode<>(70);
		MyNode<Integer> mySecondNode = new MyNode<>(30);
		MyNode<Integer> myThirdNode = new MyNode<>(56);
		myStack.push(myFirstNode);
		myStack.push(mySecondNode);
		myStack.push(myThirdNode);
		INode<Integer> myNode=myStack.peak();
		myStack.printStack();
		assertEquals(myThirdNode,myNode);
	}
}
