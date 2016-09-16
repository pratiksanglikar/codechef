/**
 * 
 */
package edu.pratiksanglikar.karumanchi.stacks;

import edu.pratiksanglikar.karumanchi.linkedlists.SinglyLinkedList;
import edu.pratiksanglikar.karumanchi.linkedlists.SinglyLinkedList.Node;
import edu.pratiksanglikar.karumanchi.stacks.exceptions.StackOverFlowException;
import edu.pratiksanglikar.karumanchi.stacks.exceptions.StackUnderFlowException;

/**
 * @author Pratik Sanglikar
 *
 */
public class StackUsingLinkedList implements Stack {

	private SinglyLinkedList stack;
	
	/**
	 * initialize the Stack using an empty linked list.
	 */
	public StackUsingLinkedList() {
		this.stack = new SinglyLinkedList();
	}
	
	/* (non-Javadoc)
	 * @see edu.pratiksanglikar.karumanchi.stacks.Stack#push(int)
	 */
	@Override
	public void push(int data) throws StackOverFlowException {
		stack.insertAtBeginning(new Node(data));
	}

	/* (non-Javadoc)
	 * @see edu.pratiksanglikar.karumanchi.stacks.Stack#pop()
	 */
	@Override
	public int pop() throws StackUnderFlowException {
		if(stack.getHead() == null) {
			throw new StackUnderFlowException();
		}
		return stack.decapitateHead().getData();
	}

	/* (non-Javadoc)
	 * @see edu.pratiksanglikar.karumanchi.stacks.Stack#peek()
	 */
	@Override
	public int peek() throws StackUnderFlowException {
		if(stack.getHead() == null) {
			throw new StackUnderFlowException();
		}
		return stack.getHead().getData();
	}
}
