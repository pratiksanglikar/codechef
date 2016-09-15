/**
 * 
 */
package edu.pratiksanglikar.karumanchi.stacks;

import edu.pratiksanglikar.karumanchi.stacks.exceptions.StackOverFlowException;
import edu.pratiksanglikar.karumanchi.stacks.exceptions.StackUnderFlowException;

/**
 * @author Pratik Sanglikar
 *
 */
public class StackUsingDynamicArray implements Stack {
	
	private int[] stack;
	private int top = -1;
	
	/**
	 * initializes the stack using the initial size as 10.
	 * 
	 */
	public StackUsingDynamicArray() {
		stack = new int[10];
		top = -1;
	}
	
	/**
	 * initializes the stack with specified intial capacity.
	 *  
	 * @param initialCapacity initial capacity of the stack.
	 */
	public StackUsingDynamicArray(int initialCapacity) {
		stack = new int[initialCapacity];
		top = -1;
	}

	/* (non-Javadoc)
	 * @see edu.pratiksanglikar.karumanchi.stacks.Stack#push(int)
	 */
	@Override
	public void push(int data) throws StackOverFlowException {
		if(top + 2 >= stack.length) {
			expand();
		}
		stack[++top] = data;
	}

	/**
	 * expands the capacity of the stack.
	 */
	private void expand() {
		resetCapacity(stack.length * 2);
	}
	
	/**
	 * resets the capacity of the stack.
	 * 
	 * @param capacity new capacity of the stack.
	 */
	private void resetCapacity(int capacity) {
		int[] newStack = new int[capacity];
		System.arraycopy(stack, 0, newStack, 0, top);
		stack = newStack;
	}

	/* (non-Javadoc)
	 * @see edu.pratiksanglikar.karumanchi.stacks.Stack#pop()
	 */
	@Override
	public int pop() throws StackUnderFlowException {
		if(top <= 0) {
			throw new StackUnderFlowException();
		}
		if(top < stack.length / 2) {
			shrink();
		}
		return stack[top--];
	}

	/**
	 * shrinks the stack if elements fall below half of the size; 
	 */
	private void shrink() {
		resetCapacity(stack.length / 2 + 1);
	}

	/* (non-Javadoc)
	 * @see edu.pratiksanglikar.karumanchi.stacks.Stack#peek()
	 */
	@Override
	public int peek() throws StackUnderFlowException {
		if(top <= 0) {
			throw new StackUnderFlowException();
		}
		return stack[top];
	}
}
