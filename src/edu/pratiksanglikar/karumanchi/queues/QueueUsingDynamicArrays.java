/**
 * 
 */
package edu.pratiksanglikar.karumanchi.queues;

import edu.pratiksanglikar.karumanchi.queues.exceptions.QueueEmptyException;

/**
 * Queue implementation using Dynamic Array.
 * 
 * @author Pratik Sanglikar
 */
public class QueueUsingDynamicArrays {
	
	private int size = 0, capacity = 0, rear = 0, front = 0;
	private int[] queue = null;
	
	/**
	 * intializes the Queue with 10 elements.
	 */
	public QueueUsingDynamicArrays() {
		queue = new int[10];
	}
	
	/**
	 * initializes the Queue with capacity provided by the user.
	 * @param capacity initial capacity of the Queue. 
	 */
	public QueueUsingDynamicArrays(int capacity) {
		this.capacity = capacity;
		this.queue = new int[capacity];
	}
	
	/**
	 * enqueues the data provided to the rear end of the queue.
	 * Expands the capacity of the queue whenever queue fills 75% of the capacity.
	 * 
	 * @param data data to be enqueued.
	 */
	public void enqueue(int data) {
		if(size >= 0.75 * capacity) {
			expand();
		}
		queue[rear] = data;
		rear = (rear + 1) % capacity;
		size++;
	}
	
	/**
	 * dequeues the element from the front end of the queue.
	 * Shrinks the queue if the size of the queue is less than half of the capacity of the queue.
	 * 
	 * @return dequeued element.
	 * @throws QueueEmptyException if the queue is empty while performing the operation.
	 */
	public int dequeue() throws QueueEmptyException {
		int data = 0;
		if(size == 0) {
			throw new QueueEmptyException();
		}
		data = queue[front];
		front = (front + 1) % capacity;
		size--;
		if(size <= 0.5 * capacity) {
			shrink();
		}
		return data;
	}

	/**
	 * shrinks the queue by half.
	 */
	private void shrink() {
		// TODO 
		
	}

	/**
	 * 
	 */
	private void expand() {
		//TODO
	}
}
