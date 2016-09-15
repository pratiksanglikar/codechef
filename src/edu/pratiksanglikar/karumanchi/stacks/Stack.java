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
public interface Stack {
	/**
	 * pushes the data in the stack.
	 * 
	 * @param data data to be pushed.
	 * @throws StackOverFlowException if stack is full.
	 */
	public void push(int data) throws StackOverFlowException;
	
	/**
	 * pops the element from the stack.
	 * 
	 * @return popped element.
	 * @throws StackUnderFlowException if the stack is empty.
	 */
	public int pop() throws StackUnderFlowException;
	
	/**
	 * returns the top element of the stack without removing it from stack.
	 * 
	 * @return the top element of the stack.
	 * @throws StackUnderFlowException if the stack is empty.
	 */
	public int peek() throws StackUnderFlowException;
}
