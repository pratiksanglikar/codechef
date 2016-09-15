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
	public void push(int data) throws StackOverFlowException;
	public int pop() throws StackUnderFlowException;
	public int peek() throws StackUnderFlowException;
}
