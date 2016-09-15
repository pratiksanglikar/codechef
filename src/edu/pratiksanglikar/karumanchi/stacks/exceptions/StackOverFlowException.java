/**
 * 
 */
package edu.pratiksanglikar.karumanchi.stacks.exceptions;

/**
 * @author Pratik Sanglikar
 *
 */
public class StackOverFlowException extends Exception {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public StackOverFlowException() {
		super();
	}
	
	public StackOverFlowException(String message) {
		super(message);
	}
	
	@Override
	public String getMessage() {
		return super.getMessage();
	}
}
