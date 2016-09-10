/**
 * 
 */
package edu.pratiksanglikar.karumanchi.linkedlists;

/**
 * This class represents the SinglyLinkedList and possible operations on it.
 * 
 * @author Pratik Sanglikar
 */
public class SinglyLinkedList {

	/**
	 * This class represents the Node of the SinglyLinkedList.
	 * 
	 * @author Pratik Sanglikar
	 */
	static class Node {

		private Node next;
		private int data;

		/**
		 * default constructor - initialize the empty Node.
		 */
		public Node() {
			setNext(null);
			setData(0);
		}

		/**
		 * initialize the Node with data.
		 * 
		 * @param data
		 */
		public Node(int data) {
			this.setData(data);
		}

		/**
		 * returns the data present in the Node.
		 * 
		 * @return the data
		 */
		public int getData() {
			return data;
		}

		/**
		 * Sets the data in the Node.
		 * 
		 * @param data
		 *            the data to set
		 */
		public void setData(int data) {
			this.data = data;
		}

		/**
		 * returns the pointer to the next node. null if it has no next pointer.
		 * 
		 * @return the next
		 */
		public Node getNext() {
			return next;
		}

		/**
		 * sets the next node of present node.
		 * 
		 * @param next
		 *            the next to set
		 */
		public void setNext(Node next) {
			this.next = next;
		}
	}

	private int length = 0;
	private Node head;

	/**
	 * initialize an empty SinglyLinkedList.
	 */
	public SinglyLinkedList() {
		head = null;
		length = 0;
	}

	/**
	 * initiliaze the SinglyLinkedList with head.
	 * 
	 * @param head
	 *            head of the SinglyLinkedList.
	 */
	public SinglyLinkedList(Node head) {
		this.head = head;
		length = 1;
	}

	/**
	 * returns the length of the SinglyLinkedList.
	 * 
	 * @return the length
	 */
	public int getLength() {
		return length;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(head.getData());
		for (Node iteratorNode = head.getNext(); iteratorNode != null; iteratorNode = iteratorNode.getNext()) {
			sb.append("-->" + iteratorNode.getData());
		}
		return sb.toString();
	}

	/**
	 * returns the head of the SinglyLinkedList.
	 * 
	 * @return the head
	 */
	public synchronized Node getHead() {
		return head;
	}

	/**
	 * inserts the new node at the beginning of the SinglyLinkedList.
	 * 
	 * @param node
	 *            node to insert
	 */
	public synchronized void insertAtBeginning(Node node) {
		node.setNext(head);
		head = node;
		length++;
	}

	/**
	 * inserts the new node at the end of the SinglyLinkedList.
	 * 
	 * @param node
	 *            node to insert
	 */
	public synchronized void insertAtTheEnd(Node node) {
		if(head == null) {
			insertAtBeginning(node);
			return;
		}
		Node iteratorNode = null;
		for (iteratorNode = head; iteratorNode.getNext() != null; iteratorNode = iteratorNode.getNext())
			;
		iteratorNode.setNext(node);
		node.setNext(null);
		length++;
	}
	
	/**
	 * inserts a node at the specified position in the Singly Linked List
	 * 
	 * @param node
	 * 			node to insert
	 * @param position
	 * 			position at which the node to insert
	 */
	public void insertAtPosition(Node node, int position) {
		if(position <= 0) {
			insertAtBeginning(node);
			return;
		}
		if(position > length) {
			insertAtTheEnd(node);
			return;
		}
		Node iterator = head;
		for(int i = 2; i < position; i++, iterator = iterator.getNext()); 
		Node temp = iterator.getNext();
		iterator.setNext(node);
		node.setNext(temp);
		length++;
	}

}
