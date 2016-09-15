/**
 * 
 */
package edu.pratiksanglikar.karumanchi.stacks.exceptions;

/**
 * @author Pratik Sanglikar
 *
 */
public class StackUnderFlowException extends Exception {
	
	private static final long serialVersionUID = 1L;

	public StackUnderFlowException() {
		super();
	}
	
	public StackUnderFlowException(String message) {
		super(message);
	}
	
	@Override
	public String getMessage() {
		return super.getMessage();
	}
}
