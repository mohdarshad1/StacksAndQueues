package com.StacksAndQueues;

import static org.junit.Assert.*;
import org.junit.Test;

public class MyStackTest {
	
	@Test
	public void given3Numbers_AddedToStack_ShouldHaveLastAddedNode() {
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
	
	@Test
	public void given3Numbers_PoppedFromStack_TillListIsEmpty() {
		MyStack<Integer> myStack = new MyStack<>();
		MyNode<Integer> myFirstNode = new MyNode<>(70);
		MyNode<Integer> mySecondNode = new MyNode<>(30);
		MyNode<Integer> myThirdNode = new MyNode<>(56);
		myStack.push(myFirstNode);
		myStack.push(mySecondNode);
		myStack.push(myThirdNode);
		INode<Integer> popedNode1 = myStack.pop();
		myStack.printStack();
		assertEquals(myThirdNode, popedNode1);
		INode<Integer> myNode = myStack.peak();
		myStack.printStack();
		assertEquals(mySecondNode, myNode);
		INode<Integer> popedNode2 = myStack.pop();
		myStack.printStack();
		assertEquals(mySecondNode, popedNode2);
		INode<Integer> popedNode3 = myStack.pop();
		assertEquals(myFirstNode, popedNode3);
	}
}
