/**
 * 
 */
package edu.pratiksanglikar.karumanchi.stacks;

import static org.junit.Assert.*;

import org.junit.Test;

import edu.pratiksanglikar.karumanchi.stacks.exceptions.StackOverFlowException;
import edu.pratiksanglikar.karumanchi.stacks.exceptions.StackUnderFlowException;

/**
 * @author Pratik Sanglikar
 *
 */
public class StackUsingArrayTest {

	private Stack stack = new StackUsingArray(5);
	
	@Test(expected = StackUnderFlowException.class)
	public void peekTest() throws StackUnderFlowException {
		stack.peek();
	}
	
	@Test
	public void peekNonEmptyTest() throws StackOverFlowException, StackUnderFlowException {
		stack.push(4);
		stack.push(5);
		stack.push(7);
		assertEquals("Peeked element should be recently added element", 7, stack.peek());
	}
	
	@Test(expected = StackOverFlowException.class) 
	public void pushOverflowTest() throws StackOverFlowException {
		stack.push(1);
		stack.push(2);
		stack.push(3);
		stack.push(4);
		stack.push(5);
		stack.push(6);
	}
	
	@Test
	public void popTest() throws StackUnderFlowException, StackOverFlowException {
		stack.push(1);
		stack.push(2);
		stack.push(3);
		stack.push(4);
		assertEquals("popped element should be same as recently added element.", 4, stack.pop());
		assertEquals("popped element should be same as recently added element.", 3, stack.pop());
	}
}
