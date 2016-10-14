/**
 * 
 */
package edu.pratiksanglikar.karumanchi.queues;

import edu.pratiksanglikar.karumanchi.queues.exceptions.QueueEmptyException;
import edu.pratiksanglikar.karumanchi.queues.exceptions.QueueFullException;

/**
 * Queue implementation using circular array.
 * 
 * @author Pratik Sanglikar
 */
public class QueueUsingArray {
	
	int[] queue = null;
	int front = 0, rear = 0, size = 0, capacity = 0;
	
	/**
	 * default constructor. 
	 * Initializes the Queue with size = 25.
	 */
	public QueueUsingArray() {
		capacity = 25;
		queue = new int[25];
	}
	
	/**
	 * intialize the Queue with initial capacity.
	 * @param capacity of the Queue.
	 */
	public QueueUsingArray(int capacity) {
		this.capacity = capacity;
		queue = new int[capacity];
	}

	/**
	 * returns if the Queue is empty.
	 * @return 	'true' if the queue is empty.
	 * 			'false' if the queue is non empty.
	 */
	public boolean isEmpty() {
		return size == 0;
	}
	
	/**
	 * returns if the Queue is full to it's capacity.
	 * @return	'true' if the queue is full to it's capacity
	 * 			'false' if the queue is not full to it's capacity.
	 */			
	public boolean isFull() {
		return size == capacity;
	}
	
	/**
	 * enqueues the data provided to the rear of the Queue.
	 * @param data data to be enqueued.
	 * @throws QueueFullException if the queue is full to it's capacity.
	 */
	public void enqueue(int data) throws QueueFullException {
		if(isFull()) {
			throw new QueueFullException();
		}
		size++;
		queue[rear] = data;
		rear = (rear + 1) % capacity;
	}
	
	/**
	 * dequeues the element from the front of the Queue.
	 * @return dequeued data.
	 * @throws QueueEmptyException if the queue is Empty.
	 */
	public int dequeue() throws QueueEmptyException {
		int data = 0;
		if(isEmpty()) {
			throw new QueueEmptyException();
		}
		size--;
		data = queue[front % capacity];
		queue[front] = Integer.MIN_VALUE;
		front = (front + 1) % capacity;
		return data;
	}
	
	/**
	 * returns the String representation of the Queue.
	 */
	@Override
	public String toString() {
		StringBuffer sb = new StringBuffer();
		for (int i : queue) {
			sb.append(i + "-->");
		}
		return sb.toString();
	}
}
