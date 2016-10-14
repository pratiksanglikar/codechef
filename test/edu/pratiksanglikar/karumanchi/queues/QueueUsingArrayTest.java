/**
 * 
 */
package edu.pratiksanglikar.karumanchi.queues;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

import edu.pratiksanglikar.karumanchi.queues.exceptions.QueueEmptyException;
import edu.pratiksanglikar.karumanchi.queues.exceptions.QueueFullException;

/**
 * @author Pratik Sanglikar
 *
 */
public class QueueUsingArrayTest {

	private QueueUsingArray queue = null;
	
	@Before
	public void intializeQueue() {
		queue = new QueueUsingArray(5);
	}
	
	@Test
	public void insertIntoEmptyQueue() throws QueueFullException {
		queue.enqueue(1);
		assertEquals("1-->0-->0-->0-->0-->", queue.toString());
	}
	
	@Test(expected = QueueEmptyException.class)
	public void testQueueEmptyException() throws QueueEmptyException {
		queue.dequeue();
	}
	
	@Test(expected = QueueFullException.class) 
	public void testQueueFullException() throws QueueFullException {
		queue.enqueue(1);
		queue.enqueue(2);
		queue.enqueue(3);
		queue.enqueue(4);
		queue.enqueue(5);
		queue.enqueue(6);
	}
}
