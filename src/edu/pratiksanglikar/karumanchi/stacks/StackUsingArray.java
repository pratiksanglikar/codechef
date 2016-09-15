/**
 * 
 */
package edu.pratiksanglikar.karumanchi.stacks;

import edu.pratiksanglikar.karumanchi.stacks.exceptions.StackOverFlowException;
import edu.pratiksanglikar.karumanchi.stacks.exceptions.StackUnderFlowException;

/**
 * Stacks using array.
 * 
 * @author Pratik Sanglikar
 */
public class StackUsingArray implements Stack {

	private int[] array;
	private int top;

	/**
	 * default constructor initializes the Stack with default capacity - 10
	 */
	public StackUsingArray() {
		array = new int[10];
		top = -1;
	}

	/**
	 * intitializes the Stack with specified capacity.
	 * 
	 * @param capacity
	 */
	public StackUsingArray(int capacity) {
		array = new int[capacity];
		top = -1;
	}

	/**
	 * pushes an element on the top of the stack.
	 * 
	 * @param element
	 *            to push
	 * @throws StackOverFlowException
	 *             if stack is full.
	 */
	public void push(int element) throws StackOverFlowException {
		if (top + 1 >= array.length) {
			throw new StackOverFlowException();
		}
		array[++top] = element;
	}

	/**
	 * pops an element from the top of the stack.
	 * 
	 * @return popped element.
	 * @throws StackUnderFlowException
	 *             if stack is empty
	 */
	public int pop() throws StackUnderFlowException {
		if (isEmpty()) {
			throw new StackUnderFlowException();
		}
		return array[top--];
	}

	/**
	 * returns the top element of the stack without removing from the stack.
	 * 
	 * @return the element at the top of the stack.
	 * @throws StackUnderFlowException
	 *             if stack is empty.
	 */
	public int peek() throws StackUnderFlowException {
		if (isEmpty()) {
			throw new StackUnderFlowException();
		}
		return array[top];
	}

	/**
	 * returns whether the stack is empty.
	 * 
	 * @return if the stack is empty.
	 */
	public boolean isEmpty() {
		if (top < 0) {
			return true;
		}
		return false;
	}

	/**
	 * return whether the stack is full.
	 * 
	 * @return if the stack is full.
	 */
	public boolean isFull() {
		if (top + 1 >= array.length) {
			return true;
		}
		return false;
	}
}